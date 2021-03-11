package day3;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Koatak_script {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.kotak.com/en/digital-banking/ways-to-bank/net-banking.html");
		driver.findElement(By.xpath("//*[@id=\"header\"]/header/div/div/div[2]/ul/li[3]/a/span")).click();
		Thread.sleep(1000);
		Set<String> handle = driver.getWindowHandles();
		System.out.println(handle.size());
		for(String handle1:handle)
		{
			System.out.println(handle1);
			driver.switchTo().window(handle1);
		}
		
		Thread.sleep(2000);
		driver.switchTo().frame("framemain");
		System.out.println("sucess");
		
		driver.findElement(By.xpath("//*[@id='ui-id-2']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"CrnAlias\"]")).sendKeys("Testing");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("test@123!");
		driver.findElement(By.xpath("//*[@id=\"secBtn2\"]/span")).click();
		Thread.sleep(2000);
		System.out.println("sucess logi");
		Alert alert=driver.switchTo().alert();
//		String s=alert.getText(); 
		Thread.sleep(1000);
		         
		String filename="C:\\Users\\Vishal\\Pictures\\Screenshots\\"+ LocalDateTime.now().getMinute()+".png";
		/*File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);*/
		try
		{
			Robot robot=new Robot();
			Rectangle screensize=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			BufferedImage tmp=robot.createScreenCapture(screensize);
			ImageIO.write(tmp, "png", new File(filename));
		
		}catch (Exception e)
		{
		// TODO Auto-generated catch block
		e.getMessage();
		}
	}
}
