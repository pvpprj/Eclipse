package Assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By sign=By.xpath("//span[@class='nav-action-inner'][1]");
	By newAcc= By.xpath("//a[@id='createAccountSubmit']");
	By username=By.xpath("//input[@id='ap_customer_name']"); 
	By mobileNum=By.xpath("//input[@id='ap_phone_number']");
	By email=By.xpath("//input[@id='ap_email']");
	By password=By.xpath("//input[@id='ap_password']");
	By submit=By.xpath("//input[@id='continue']");
	By error =By.xpath("//div[contains(text(),'The mobile number you entered does not seem to be')]");
		
	public LoginPage(WebDriver driver) {
		this.driver=driver;	
	}

	public WebElement signin()
	{
		return driver.findElement(sign);
	}
	
	public WebElement newAccount()
	{
		return driver.findElement(newAcc);
	}
	
	public WebElement username()
	{
		return driver.findElement(username);
	}
	
	public WebElement Mobile()
	{
		return driver.findElement(mobileNum);
	}
	
	public WebElement Email()
	{
		return driver.findElement(email);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement Submit()
	{
		return driver.findElement(submit);
	}
	
	public WebElement Error()
	{
		return driver.findElement(error);
	}
	
	
}
