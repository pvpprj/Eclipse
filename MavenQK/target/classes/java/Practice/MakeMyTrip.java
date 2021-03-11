package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	public static void main(String[] args) throws InterruptedException {
		//   driver.findElement(By.xpath("")).click();
		
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]/span[2]")).click();
		driver.findElement(By.xpath("//input[@id='city']")).click();
	WebElement s=	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
	s.sendKeys("Benglore");// + Keys.ENTER);
	s.sendKeys(Keys.DOWN);
	s.sendKeys(Keys.ENTER);    Thread.sleep(2000);
	
	// Select from date
	driver.findElement(By.xpath("//div[@class=\"DayPicker-Day\"][contains(@aria-label,'Mar 18 2021')]")).click();
	Thread.sleep(3000);
	// Select end date
	driver.findElement(By.xpath("//div[@class=\"DayPicker-Day\"][contains(@aria-label,'Mar 20 2021')]")).click();
	Thread.sleep(3000);
	// Click on room guest 
	driver.findElement(By.xpath("//input[@id='guest']")).click();
								
	driver.findElement(By.xpath("//li[@data-cy=\"adults-2\"]")).click();   // select adult  //li[@data-cy="adults-2"] 
    
	 Thread.sleep(3000);
	 driver.findElement(By.cssSelector(".btnAddRoom")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//li[@data-cy=\"adults-2\"]")).click(); 
	 Thread.sleep(3000);
	 
	driver.findElement(By.xpath("//button[contains(text(),'APPLY')]")).click();  // Apply button in Adult
	 Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@id='hsw_search_button']")).click();
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*WebElement sel=driver.findElement(By.xpath("//*[@id=\"fromCity\"]"));
		sel.click();
		WebElement from=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
		from.sendKeys("MUMBAI");
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		
		//WebElement sel1=driver.findElement(By.xpath("//*[@id=\"toCity\"]"));
		//sel1.click();
		WebElement destination=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));
		destination.sendKeys("pun");
		
        int i=1;
		for(i=1;i<=4;i++)
		{
			destination.sendKeys(Keys.ARROW_DOWN);   //Punta Arenas, Chile
		}
		destination.sendKeys(Keys.ENTER);
		*/
		
	}

}
