package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronisation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		//WebElement from = driver.findElement(By.id("FH-origin"));
		WebElement from = driver.findElement(By.id("package-origin-hp-package"));
		from.sendKeys("new");
		Thread.sleep(2000);
		from.sendKeys(Keys.TAB);
		from.sendKeys(Keys.TAB);
		Thread.sleep(2000);

		WebElement to = driver.findElement(By.id("package-destination-hp-package"));
		to.sendKeys("Mumbai");
		Thread.sleep(2000);
		to.sendKeys(Keys.TAB);
		to.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
//		driver.findElement(By.id("package-departing-hp-package")).sendKeys(Keys.ENTER);

		WebDriverWait d = new WebDriverWait(driver, 20);
		d.until(ExpectedConditions.elementToBeClickable(By.id("hotelNewSearchLnk")));

		driver.findElement(By.id("hotelNewSearchLnk")).click();

	}
}