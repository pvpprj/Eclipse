package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GOPAL {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.get("https://igstg.com/fundraiser/help-ek-fekf-new");
		driver.get("https://google.com");
		driver.manage().window().maximize();

		System.out.println(driver.findElements(By.tagName("iframe")).size());

	}
}
