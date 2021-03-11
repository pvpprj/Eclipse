package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {      // Page Object Class
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
	  this.driver=driver;	
	}
		
	By search =By.xpath("//input[@type='search']");
	
			public WebElement getsearch()
			{
			     return driver.findElement(search);
			}

}
