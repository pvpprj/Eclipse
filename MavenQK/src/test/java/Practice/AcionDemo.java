package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AcionDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Rahul\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.amazon.in/b?ie=UTF8&node=12597663031&pf_rd_p=34c51316-47d3-4e47-a5a8-12d1ae202d22&pf_rd_r=QC0TS0QE1X26803JGXBD");
		driver.manage().window().maximize();

		WebElement action=driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[2]"));
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		Actions a = new Actions(driver);
		a.moveToElement(action).build().perform(); //Right click
		
		a.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("mobile").sendKeys(Keys.ENTER).build().perform();
		
		WebDriverWait d = new WebDriverWait(driver, 20);
		d.until(ExpectedConditions.elementToBeClickable(action));
		
		a.moveToElement(action).build().perform();
		*/
		
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://open.rocket.chat/home");
		driver.findElement(By.id("emailOrUsername")).sendKeys("pvpprj@gmail.com"); 
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("QK@12345678");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login-card\"]/div[3]/button[1]")).click();
		
		Actions a=new Actions(driver);
		
		WebElement search=driver.findElement(By.xpath("//*[@id=\"rocket-chat\"]/aside/header/div[2]/button[1]"));
	
		WebElement view_Mode=driver.findElement(By.id("icon-list"));
		WebElement sort=driver.findElement(By.xpath("//*[@id=\"icon-sort\"]"));
		WebElement create_new=driver.findElement(By.xpath("//*[@id=\"rocket-chat\"]/aside/header/div[2]/button[5]"));
		a.moveToElement(search).perform(); 
		WebElement Directory=driver.findElement(By.id("icon-discover"));
		a.moveToElement(Directory).perform();
		a.moveToElement(view_Mode).perform(); 
		a.moveToElement(sort).perform	(); 
		a.moveToElement(create_new).build().perform();
		
		driver.quit();
		
	}
}
