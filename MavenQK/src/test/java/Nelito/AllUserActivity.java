package Nelito;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class AllUserActivity extends AllMethods {
	public static By Lead = By.xpath("//a[contains(text(),'LEAD11')]");
	//89,77,65,51,36

	@BeforeTest
	public void beforeTest() {
		driver = InitializingDriver();
		// driver.get(p.getProperty("url"));
		driver.get("https://devapp.moneyboxxfinance.com:9911");
	}

	@Test(priority=1)
	public void NelitoBM() throws Exception {
		BMLogin(driver);

		WebElement dashboard = driver.findElement(By.xpath("//span[contains(text(),'DASHBOARD')]"));
		dashboard.click();
		Thread.sleep(2000);
		WebElement IncomeAssessmentcheck = driver.findElement(By.xpath("//h2[@id='h223']"));
		IncomeAssessmentcheck.click();
		Thread.sleep(2000);
		common(Lead, driver);
		WebElement Remark = driver.findElement(By.xpath("//textarea[@id='FINAL_REMARK']"));
		Remark.sendKeys("PASS");
		Thread.sleep(2000);
		System.out.println(" Remark Enter ");

		WebElement process = driver.findElement(By.xpath("//input[@id='PROCESS_BM']"));
		process.click();
		System.out.println(" Approved Successfully ");
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		String s = a.getText();
		a.accept();
		System.out.println(s);
		System.out.println("BM Work Is Done");

		driver.close();

		Set<String> handle1 = driver.getWindowHandles();
		for (String ele3 : handle1) {
			driver.switchTo().window(ele3);
		}

		WebElement close = driver.findElement(By.xpath("//input[@name='btndone']"));
		close.click();
		Thread.sleep(3000);
		WebElement logout = driver.findElement(By.xpath("//input[@id='BtnLogout']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", logout);
		Thread.sleep(5000);
	}

	@Test(priority=2)
	public void NelitoCCO() throws Exception {
		CCOLogin(driver);

		WebElement dashboard = driver.findElement(By.xpath("//span[contains(text(),'DASHBOARD')]"));
		dashboard.click();
		Thread.sleep(2000);
		WebElement IncomeAssessmentcheck = driver.findElement(By.xpath("//h2[@id='h220']"));
		IncomeAssessmentcheck.click();
		Thread.sleep(2000);
		common(Lead, driver);
		WebElement Remark = driver.findElement(By.xpath("//textarea[@id='CCO_REMARK']"));
		Remark.sendKeys("PASS");
		Thread.sleep(2000);
		System.out.println(" Remark Enter ");

		WebElement process = driver.findElement(By.xpath("//input[@id='CC_Aprove']"));
		process.click();
		System.out.println(" Approved Successfully ");
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		String s = a.getText();
		a.accept();
		System.out.println(s);
		System.out.println("CCO Work Is Done");

		driver.close();

		Set<String> handle2 = driver.getWindowHandles();
		for (String ele5 : handle2) {
			driver.switchTo().window(ele5);
		}

		WebElement close = driver.findElement(By.xpath("//input[@name='btndone']"));
		close.click();
		Thread.sleep(3000);
		WebElement logout = driver.findElement(By.xpath("//input[@id='BtnLogout']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", logout);
		Thread.sleep(5000);
	}

	@Test(priority=3)
	public void NelitoCRO() throws Exception {
		CROLogin(driver);

		WebElement dashboard = driver.findElement(By.xpath("//span[contains(text(),'DASHBOARD')]"));
		dashboard.click();
		Thread.sleep(2000);
		WebElement IncomeAssessmentcheck = driver.findElement(By.xpath("//h2[@id='h227']"));
		IncomeAssessmentcheck.click();
		Thread.sleep(2000);
		common(Lead, driver);
		WebElement Remark = driver.findElement(By.xpath("//textarea[@id='CRO_REMARK']"));
		Remark.sendKeys("PASS");
		Thread.sleep(2000);
		System.out.println(" Remark Enter ");

		WebElement process = driver.findElement(By.xpath("//input[@id='CR_Aprove']"));
		process.click();
		System.out.println(" Approved Successfully ");
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		String s = a.getText();
		a.accept();
		System.out.println(s);
		System.out.println("CRO Work Is Done");

		driver.close();

		Set<String> handle3 = driver.getWindowHandles();
		for (String ele6 : handle3) {
			driver.switchTo().window(ele6);
		}

		WebElement close = driver.findElement(By.xpath("//input[@name='btndone']"));
		close.click();
		Thread.sleep(3000);
		WebElement logout = driver.findElement(By.xpath("//input[@id='BtnLogout']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", logout);
		Thread.sleep(5000);
	}

	@Test(priority=4)
	public void NelitoBDO() throws Exception {
		BDOLogin(driver);

		WebElement dashboard = driver.findElement(By.xpath("//span[contains(text(),'DASHBOARD')]"));
		dashboard.click();
		Thread.sleep(2000);
		WebElement CustomerAcceptance = driver.findElement(By.xpath("//h2[@id='h243']"));
		CustomerAcceptance.click();
		Thread.sleep(2000);
		common(Lead, driver);
		WebElement Remark = driver.findElement(By.xpath("//textarea[@id='BDO_REMARK']"));
		Remark.sendKeys("PASS");
		Thread.sleep(2000);
		System.out.println(" Remark Enter ");

	/*	WebElement process = driver.findElement(By.xpath("//input[@id='BDO_PROCESS']"));
		process.click();
		System.out.println(" Approved Successfully ");
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		String s = a.getText();
		a.accept();
		System.out.println(s);
		System.out.println("BDO Work Is Done");  */

		driver.close();

		Set<String> handle4 = driver.getWindowHandles();
		for (String ele7 : handle4) {
			driver.switchTo().window(ele7);
		}

		WebElement close = driver.findElement(By.xpath("//input[@name='btndone']"));
		close.click();
		Thread.sleep(3000);
		WebElement logout = driver.findElement(By.xpath("//input[@id='BtnLogout']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", logout);
		Thread.sleep(5000);
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
