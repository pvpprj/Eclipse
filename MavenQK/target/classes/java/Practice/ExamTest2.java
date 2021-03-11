package Practice;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamTest2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kotak.com/en/digital-banking/ways-to-bank/net-banking.html");
		driver.manage().window().maximize();
		// *[@id="header"]/header/div/div/div[2]/ul/li[3]/a

		By byvar = By.xpath("//*[@id=\"header\"]/header/div/div/div[2]/ul/li[3]/a");
		WebElement weinput = driver.findElement(byvar);
		weinput.click();

		Set<String> setHandles = driver.getWindowHandles();
		for (String ele : setHandles) {
			System.out.println(ele);
			Thread.sleep(3000);
			driver.switchTo().window(ele);
			System.out.println("Windows Title " + driver.getTitle());
		}

		// *[@id="ui-id-2"]
		Thread.sleep(1000);

		driver.switchTo().frame("framemain");

		By byvar1 = By.xpath("//a[@id=\"ui-id-2\"]");
		WebElement weinput1 = driver.findElement(byvar1);
		weinput1.click();

		System.out.println("Now on User name tex field");
		System.out.println("Please enter User Name");

		By byvar2 = By.id("CrnAlias");
		WebElement weinput2 = driver.findElement(byvar2);
		weinput2.sendKeys("Testing");

		By byvar3 = By.xpath("//*[@id=\"Password\"]");
		WebElement weinput3 = driver.findElement(byvar3);
		weinput3.sendKeys("test@123!");

		By byvar4 = By.xpath("//*[@id=\"secBtn2\"]/span");
		WebElement weinput4 = driver.findElement(byvar4);
		weinput4.click();

		// Screenshot page

		/*
		 * TakesScreenshot ts = (TakesScreenshot) driver;
		 * 
		 * File source = ts.getScreenshotAs(OutputType.FILE);
		 * 
		 * FileUtils.copyFile(source, new
		 * File("src\\test\\resources\\screenshots\\Screen1.png"));
		 * 
		 * System.out.println("Screenshot is taken");
		 * 
		 * // driver.quit();
		 * 
		 */

	}
}
