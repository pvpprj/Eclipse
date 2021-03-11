package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Data_Properties_Global {
	
	public WebDriver driver=null;
	
	@Test
	public void Login() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\eclipse-workspace\\Udemy\\drivers\\chromedriver.exe");
		Properties p=new Properties();
		FileInputStream f=new FileInputStream("C:\\Users\\Vishal\\eclipse-workspace\\Udemy\\src\\TestNG\\TestData.properties");
		p.load(f);
		
		System.out.println(p.getProperty("username"));  System.out.println(p.getProperty("password"));
		System.out.println(p.getProperty("url"));
		
		if(p.getProperty("browser").equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(p.getProperty("browser").equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(p.getProperty("browser").equals("interexplorer"))
		{
			driver = new InternetExplorerDriver();
		}
		
		driver.get(p.getProperty("url"));
		WebElement search =driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		search.sendKeys("Selinium");
		search.sendKeys(Keys.ENTER);
		
		

	}
	

}
