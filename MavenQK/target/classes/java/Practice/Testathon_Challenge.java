package Practice;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Testathon_Challenge {
 
	WebDriver driver;
	@BeforeTest
	  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Software RAHUL\\DRIVER\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://open.rocket.chat/home");
	  }
	
	@Test
  public void f() throws InterruptedException {
		driver.findElement(By.id("emailOrUsername")).sendKeys("pvpprj@gmail.com"); 
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("QK@12345678");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login-card\"]/div[3]/button[1]")).click();
		
		Actions a=new Actions(driver);
		
		WebElement search=driver.findElement(By.xpath("//*[@id=\"rocket-chat\"]/aside/header/div[2]/button[1]"));
		WebElement Directory=driver.findElement(By.id("icon-discover"));
		WebElement view_Mode=driver.findElement(By.id("icon-list"));
		WebElement sort=driver.findElement(By.xpath("//*[@id=\"icon-sort\"]"));
		WebElement create_new=driver.findElement(By.xpath("//*[@id=\"rocket-chat\"]/aside/header/div[2]/button[5]"));
		a.moveToElement(search).perform();  Thread.sleep(2000); 
		a.moveToElement(Directory).perform(); Thread.sleep(2000);
		a.moveToElement(view_Mode).perform(); Thread.sleep(2000);
		a.moveToElement(sort).perform	(); Thread.sleep(2000);
		a.moveToElement(create_new).build().perform();
		
		driver.quit();
		
	
	}
}
