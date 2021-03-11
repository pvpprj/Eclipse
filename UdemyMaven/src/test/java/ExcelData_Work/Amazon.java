package ExcelData_Work;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class Amazon {

//	WebElement signIn = driver.findElement(By.xpath(""));
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (9)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		
		WebElement signIn = driver.findElement(By.xpath("//a[@id='nav-link-accountList']//span[@class='nav-line-1']"));
		a.moveToElement(signIn).build().perform();
		
		WebElement sig = driver.findElement(By.xpath("//span[@class='nav-action-inner'][1]"));
		sig.click();
		Thread.sleep(2000);
		
		WebElement newAccount = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
		newAccount.click();
		Thread.sleep(2000);
		
		WebElement name = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));    name.sendKeys("Raj");   Thread.sleep(2000);
		
		WebElement mobile = driver.findElement(By.xpath("//input[@id='ap_phone_number']"));    mobile.sendKeys("787778");   Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='ap_email']"));     		email.sendKeys("bdsjbd");	Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));		password.sendKeys("bxjbbxnsx");	Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.xpath("//input[@id='continue']"));			submit.click();		
		
		String error = driver.findElement(By.xpath("//div[contains(text(),'Enter a valid email address')]")).getText();
		String Expected = "Enter a valid email address";

		Assert.assertEquals(Expected, error);
		System.out.println("error mSG : "+error);
		
		
		
		
		
		
		
	}

}


//input[@id='ap_customer_name']