package ExcelData_Work;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RRR {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (9)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	driver.get("https://ess-staging.ttconline.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@id='pwa-closeip']")).click();
	
	WebElement root = driver.findElement(By.tagName("login-view"));
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	WebElement shadom1 = (WebElement) js.executeScript("return arguments[0].shadowRoot",root);	
	
	WebElement iron = shadom1.findElement(By.cssSelector("iron-form#loginform"));
	
	iron.findElement(By.cssSelector("input#username")).sendKeys("rahul@gmail.com");
	iron.findElement(By.cssSelector("input#password")).sendKeys("password");
	
	WebElement button = iron.findElement(By.cssSelector("vaadin-button#loginBtn"));
	button.findElement(By.xpath("//button[@id='button']")).click();  
	     
System.out.println("done........");
	
	}
}