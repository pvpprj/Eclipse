package ExcelData_Work;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TimepassTest {
	WebDriver driver;

	@BeforeTest
	public void setUp(){
		System.out.println("Opening chrome browser");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (9)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}	
	
  @Test
  public void f() throws Exception {
	  driver.get("https://ess-staging.ttconline.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='pwa-closeip']")).click();
	//	driver.switchTo().frame("freshwidget-frame");

		WebElement root1 = driver.findElement(By.tagName("login-view"));
		WebElement shadowRoot1 = expandRootElement(root1);
	 
		WebElement root2 = shadowRoot1.findElement(By.cssSelector("iron-form[id=loginform]"));
		WebElement shadowRoot2 = expandRootElement(root2);
		
		shadowRoot2.findElement(By.xpath("//input[@id='username']")).sendKeys("abcd");
				
  }
  
  public WebElement expandRootElement(WebElement element) {
		WebElement ele = (WebElement) ((JavascriptExecutor) driver)
.executeScript("return arguments[0].shadowRoot",element);
		return ele;
	}
}
