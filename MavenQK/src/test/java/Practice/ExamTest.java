package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamTest {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kotak.com/en/digital-banking/ways-to-bank/net-banking.html");
		driver.manage().window().maximize();
		driver.get("https://www.kotak.com/en/digital-banking/ways-to-bank/net-banking.html");
		System.out.println("1st page :  "+driver.getTitle());

		driver.findElement(By.xpath("//*[@id=\"header\"]/header/div/div/div[2]/ul/li[3]/a")).click();
		
		Set<String> s=driver.getWindowHandles();
		int size=s.size();
		Iterator <String> it = s.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		System.out.println("2nd page :  "+driver.getTitle());
		
		driver.switchTo().frame("framemain");
		
	//	driver.switchTo().window(parent);
		//System.out.println("1st page :  "+driver.getTitle());
		//driver.close();
			
		driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]")).click();
		driver.findElement(By.id("CrnAlias")).sendKeys("Testing");
		driver.findElement(By.id("Password")).sendKeys("test@123!");
	    driver.findElement(By.xpath("//*[@id=\"secBtn2\"]/span")).click();	
		//*[@id="secBtn2"]/span
			
		
	}

}
