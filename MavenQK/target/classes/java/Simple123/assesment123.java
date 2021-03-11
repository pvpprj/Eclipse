package Simple123;

import java.awt.List;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assesment123 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://igstg.com/fundraiser/help-ek-fekf-new");
		driver.manage().window().maximize();
		
		System.out.println(	driver.findElements(By.tagName("iframe")).size());
		
	}		  
	}


