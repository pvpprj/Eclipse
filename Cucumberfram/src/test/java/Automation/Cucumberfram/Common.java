package Automation.Cucumberfram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Common {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software RAHUL\\DRIVER\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.google.com");
		//driver.manage().window().maximize();
		
		System.out.println("1st page :  "+driver.getTitle());
		System.out.println("Current URL : " +driver.getCurrentUrl());
	
}

}
