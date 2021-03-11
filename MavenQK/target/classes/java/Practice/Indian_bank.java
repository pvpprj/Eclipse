package Practice;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indian_bank {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//driver =new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.indianbank.net.in/jsp/startIBPreview.jsp");
	driver.findElement(By.xpath("//*[@id=\"indexLoginformPreview\"]/div/div[2]/div[2]/div[2]/div/a")).click();
	Thread.sleep(1000);
	Set<String> handle = driver.getWindowHandles();
	System.out.println(handle.size());
	for(String handle1:handle)
	{
		System.out.println(handle1);
		driver.switchTo().window(handle1);
	}
	System.out.println("sucess");
	WebElement wb=driver.findElement(By.xpath("//*[@id=\"indexLoginform\"]/div/div[2]/div[3]/div[2]/div[4]/div[2]"));
	String filename="E:\\SeleniumServer\\"+ LocalDateTime.now().getMinute()+".jpg";
	
	File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
	WebElement element = driver.findElement(By.id("img_captcha"));
	int ImageWidth = element.getSize().getWidth();
	int ImageHeight = element.getSize().getHeight();
	Point point = element.getLocation();
	  int xcord = point.getX();
	  int ycord = point.getY();
	  BufferedImage img = ImageIO.read(screen);
	  BufferedImage dest = img.getSubimage(xcord, ycord, ImageWidth, ImageHeight);
	  ImageIO.write(dest, "png", screen);
	  FileUtils.copyFile(screen, new File("C:\\Users\\Vishal\\Pictures\\Screenshots\\Page098.jpg"));
	
//	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	try {
//	//BufferedImage fullimg=ImageIO.read(src);
//	FileUtils.copyFile(src, new File(filename));
//	} catch (IOException e)
//	{
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//	}
//	String Captcha=JOptionPane.showInputDialog("please enter a captch");


	/*Point p= wb.getLocation();
	int elementwid=Screenshots23.getSize().getWidth();
	int elementhieght=wb.getSize().getHeight();*/



	}

	}

