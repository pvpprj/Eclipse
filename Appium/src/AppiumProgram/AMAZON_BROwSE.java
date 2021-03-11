package AppiumProgram;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AMAZON_BROwSE extends baseChrome {

	public static void main(String[] args) throws MalformedURLException, Exception {
// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();

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

		//Assert.assertEquals(Expected, error);
		System.out.println("error mSG : "+error);
		

		
		
	}
}