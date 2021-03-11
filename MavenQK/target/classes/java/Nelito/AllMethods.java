package Nelito;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllMethods {
	public WebDriver driver;
	Properties p = new Properties();
	
	public WebDriver InitializingDriver() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public void BMLogin(WebDriver driver) throws InterruptedException, IOException {
		FileInputStream f = new FileInputStream("src\\test\\java\\Nelito\\Nelito_Data.properties");
		p.load(f);
		PageObjectNelitoLogin page = new PageObjectNelitoLogin(driver);
		
		page.Getusername().sendKeys(p.getProperty("BMusername"));
		Thread.sleep(2000);
		page.Getpassword().sendKeys(p.getProperty("BMpassword"));
		Thread.sleep(2000);
		page.Getlogin().click();
		Thread.sleep(2000);
		System.out.println("1st Page : " + driver.getTitle());	
	}
	
	public void CCOLogin(WebDriver driver) throws InterruptedException, IOException {
		FileInputStream f = new FileInputStream("src\\test\\java\\Nelito\\Nelito_Data.properties");
		p.load(f);
		PageObjectNelitoLogin page = new PageObjectNelitoLogin(driver);
		
		page.Getusername().sendKeys(p.getProperty("CCOusername"));
		Thread.sleep(2000);
		page.Getpassword().sendKeys(p.getProperty("CCOpassword"));
		Thread.sleep(2000);
		page.Getlogin().click();
		Thread.sleep(2000);
		System.out.println("1st Page : " + driver.getTitle());	
	}
	
	public void CROLogin(WebDriver driver) throws InterruptedException, IOException {
		FileInputStream f = new FileInputStream("src\\test\\java\\Nelito\\Nelito_Data.properties");
		p.load(f);
		PageObjectNelitoLogin page = new PageObjectNelitoLogin(driver);
		
		page.Getusername().sendKeys(p.getProperty("CROusername"));
		Thread.sleep(2000);
		page.Getpassword().sendKeys(p.getProperty("CROpassword"));
		Thread.sleep(2000);
		page.Getlogin().click();
		Thread.sleep(2000);
		System.out.println("1st Page : " + driver.getTitle());	
	}

	public void BDOLogin(WebDriver driver) throws InterruptedException, IOException {
		FileInputStream f = new FileInputStream("src\\test\\java\\Nelito\\Nelito_Data.properties");
		p.load(f);
		PageObjectNelitoLogin page = new PageObjectNelitoLogin(driver);
		
		page.Getusername().sendKeys(p.getProperty("BDOusername"));
		Thread.sleep(2000);
		page.Getpassword().sendKeys(p.getProperty("BDOpassword"));
		Thread.sleep(2000);
		page.Getlogin().click();
		Thread.sleep(2000);
		System.out.println("1st Page : " + driver.getTitle());	
	}


	public void common(By Lead, WebDriver driver) throws Exception {
		WebElement LeadNo = driver.findElement(Lead);
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(Lead));
		LeadNo.click();

		Set<String> handle = driver.getWindowHandles();
		for (String ele2 : handle) {
			driver.switchTo().window(ele2);
		}
		System.out.println("2nd Page : " + driver.getTitle());

		List<WebElement> total = driver.findElements(By.xpath("//*[starts-with(@id,'ACTION_APPROVE')]"));
		int totalCreditParameters = driver.findElements(By.xpath("//*[starts-with(@id,'ACTION_APPROVE')]")).size();
		System.out.println("Total Credit Parameters : " + totalCreditParameters);

		for (int i = 1; i <= totalCreditParameters; i++) {// input[starts-with(@id,'ACTION_APPROVE')]
			By d = By.xpath("(//*[starts-with(@id,'ACTION_APPROVE')])[" + i + "]");

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", driver.findElement(d));
			Thread.sleep(1000);
		}
	}
}
