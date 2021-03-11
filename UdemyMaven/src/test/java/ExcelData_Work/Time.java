package ExcelData_Work;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Time {

	public static void main(String[] args) throws InterruptedException, IOException, TesseractException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (9)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://allwebco-templates.com/support/script-simple-captcha.htm");
				
		Thread.sleep(5000);

		File src = driver.findElement(By.xpath("//div[@id='CaptchaDiv']"))
				.getScreenshotAs(OutputType.FILE);
		String path =System.getProperty("user.dir")+"/screenshots/captcha.png";
		FileHandler.copy(src, new File(path));
		
		ITesseract image = new Tesseract();
		String imagetext = image.doOCR(new File(path));
		System.out.println(imagetext);
		
	String finalText =	imagetext.split("below")[1].replaceAll("[^a-zA-Z]", "");
		System.out.println("Final Captha is : "+finalText);
		
		
		WebElement captcha = driver.findElement(By.xpath("//input[@id='CaptchaInput']"));
		captcha.sendKeys("finalText");
		Thread.sleep(2000);
		
		

	}

}
