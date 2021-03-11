package Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
		System.out.println("Totallomk on page : "+driver.findElements(By.tagName("a")).size());
		                 
		WebElement k=driver.findElement(By.id("gf-BIG"));  // to find footer part link
	System.out.println("Footaer  link of page : "+k.findElements(By.tagName("a")).size());	
	
	WebElement coulmn=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));  // to find footer part link
	int count=coulmn.findElements(By.tagName("a")).size();
	System.out.println("Column  link of foter page : "+count);	
	
    for(int i=1;i<count;i++)
    {
    	String s=Keys.chord(Keys.CONTROL,Keys.ENTER);
    	coulmn.findElements(By.tagName("a")).get(i).sendKeys(s);
    	Thread.sleep(5000);
    }
    
    Set<String> value = driver.getWindowHandles();
    
    for(String e:value)
    {
    	driver.switchTo().window(e);
    	Thread.sleep(3000);
    	System.out.println("Title of : "+driver.getTitle());
    }
    
    
    
    
	
	
	
	
	
	}

}
