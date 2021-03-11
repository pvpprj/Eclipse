package day3;

import java.io.File;

import java.util.logging.FileHandler;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//driver.get("https://www.kotak.com/en/digital-banking/ways-to-bank/net-banking.html");
		System.out.println("1st page :  "+driver.getTitle());
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
	
			try {
				//FileUtils.copyFile(source , new File ("src/test/resources/Screenshot/google123.jpg"));
				FileUtils.copyFile(source , new File ("C:/Users/Vishal/Pictures/Screenshots/Page123.jpg"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Screenshot done ");
	}
}
