package Practice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.*;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet {

	private static final String FileUtils = null;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();

		int count = driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).size();
		System.out.println("SIZE : " + count);

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i)
					.getAttribute("value");
			if (text.equals("RoundTrip")) {
				driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).click();
			}
		}

		WebElement ss = driver.findElement(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']"));

		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[2]/li[2]/a")).click(); // From
		driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[2]/li[3]/a")).click(); // To
		Thread.sleep(2000);

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click(); // Select
																											// DATE

		driver.findElement(By.id("divpaxinfo")).click();
		WebElement adult = driver.findElement(By.id("ctl00_mainContent_ddl_Adult")); // dropdown
		Select s = new Select(adult);
		s.selectByVisibleText("4");
		Thread.sleep(2000);

		WebElement child = driver.findElement(By.id("ctl00_mainContent_ddl_Child")); // dropdown
		Select s1 = new Select(child);
		s1.selectByVisibleText("2");
		Thread.sleep(2000);

		WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); // dropdown
		Select s2 = new Select(currency);
		s2.selectByVisibleText("USD");

		WebElement senior = driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount"));
		senior.click();

		WebElement submit = driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
		submit.click();

	}
}
