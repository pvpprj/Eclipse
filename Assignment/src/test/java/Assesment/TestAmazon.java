package Assesment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAmazon extends Base {

	@Test()
	public void Amaze() throws IOException, Exception {
		driver = InitializingDriver();
		driver.get(p.getProperty("url"));
		Thread.sleep(3000);
		LoginPage l = new LoginPage(driver);
		
		Actions a = new Actions(driver);
		WebElement signIn = driver.findElement(By.xpath("//a[@id='nav-link-accountList']//span[@class='nav-line-1']"));
		a.moveToElement(signIn).build().perform();

		l.signin().click();
		Thread.sleep(2000);
		l.newAccount().click();
		Thread.sleep(2000);
		
		File src = new File("File\\resources\\data\\MetaData.xlsx");
		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String name = sheet1.getRow(0).getCell(0).getStringCellValue();
		String mobile = sheet1.getRow(0).getCell(1).getStringCellValue();
		String mail = sheet1.getRow(0).getCell(2).getStringCellValue();
		String pass = sheet1.getRow(0).getCell(3).getStringCellValue();
		
		l.username().sendKeys(name);
		Thread.sleep(2000);
		l.Mobile().sendKeys(mobile);
		Thread.sleep(2000);
		l.Email().sendKeys(mail);
		Thread.sleep(2000);
		l.password().sendKeys(pass);
		Thread.sleep(2000);
		l.Submit().click();
		Thread.sleep(2000);
		String errorMessage = l.Error().getText();
		String Expected = "The mobile number you entered does not seem to be valid";

		Assert.assertEquals(Expected, errorMessage);

	}

}
