package cucumberOption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	public static Properties prop;

	public static WebDriver getDriver() throws IOException 
	{
		prop=new Properties();
		FileInputStream f=new FileInputStream("C:\\Users\\Vishal\\eclipse-workspace\\CucumberFrame\\src\\test\\java\\cucumberOption\\global.properties");
		prop.load(f);		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Rahul\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		return driver;

	}
}
