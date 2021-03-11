package Framework_Scretch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By title=By.xpath("//*[@id=\"content\"]/div/div/h2");
	By signin=By.xpath("//*[@id=\"homepage\"]/header/div[1]/div/nav/ul/li[4]/a/span");
	By username=By.xpath("//*[@id=\"user_email\"]");
	By password=By.xpath("//*[@id=\"user_password\"]");
	By Login=By.xpath("//*[@id=\"new_user\"]/div[3]/input");
	
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;	
	}

	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	
	public WebElement username()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement Login()
	{
		return driver.findElement(Login);
	}
	
	
	
}
