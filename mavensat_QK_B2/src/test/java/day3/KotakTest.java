package day3;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KotakTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String url="https://www.kotak.com/en/digital-banking/ways-to-bank/net-banking.html";
		driver.get(url);
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		System.out.println("Parent windows : "+parent  +" Parent page : "+driver.getTitle()  );
		WebElement login=driver.findElement(By.xpath("//*[@id=\"header\"]/header/div/div/div[2]/ul/li[3]/a/span"));
		login.click();
		
		Set<String> s=driver.getWindowHandles();
		for(String nextWindow : s)
		{
			if(!nextWindow.equalsIgnoreCase(parent))
			{				driver.switchTo().window(nextWindow);
				System.out.println("child windows : "+nextWindow  +" child page : "+driver.getTitle()  );
			}
		}
		
		driver.switchTo().frame("framemain");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]")).click();
	Thread.sleep(2000);

	WebElement username	=driver.findElement(By.id("CrnAlias"));
	username.sendKeys("Testing");
	Thread.sleep(2000);
		
	WebElement password =driver.findElement(By.xpath("//*[@id=\"Password\"]"));
	password.sendKeys("test@123!");  Thread.sleep(2000);
		//String child=it.next();
	//river.findElement(By.xpath("//*[@id=\"Username\"]")).sendKeys("fghgfhf");
		
	driver.findElement(By.xpath("//*[@id=\"secBtn2\"]/span")).click();
	Thread.sleep(2000);
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File sr = ts.getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFiles(sr,new File("C:/Users/Vishal/Pictures/Screenshots/Page123.jpg"));
	FileUtils.copyFile(sr, new File("C:\\Users\\Vishal\\Pictures\\Screenshots\\Page1234.jpg"));

	}
}

