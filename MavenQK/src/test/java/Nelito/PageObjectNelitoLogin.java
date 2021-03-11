package Nelito;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class PageObjectNelitoLogin {
	
	public WebDriver driver;
	
	By username = By.xpath("//input[@id='USER_CODE']");
	By Password = By.xpath("//input[@id='Password']");
	By login = By.xpath("//input[@class='btn trans']");
	
	public PageObjectNelitoLogin(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement Getusername() {
		return driver.findElement(username);
	}
	
	public WebElement Getpassword() {
		return driver.findElement(Password);
	}
	
	public WebElement Getlogin() {
		return driver.findElement(login);
	}
	
	
	
	
	
	
	
	

}
