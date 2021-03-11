package Pune;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITest;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Assesment_Pune {

	public static void main(String[] args) throws InterruptedException, IOException, TesseractException {

		System.setProperty("webdriver.chrome.driver","File\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://siteplanner.yagnaiq.com/Login/");Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='usernameField-inputEl']")).sendKeys("sptestu1");  Thread.sleep(2000);     
		driver.findElement(By.xpath("//input[@id='passwordField-inputEl']")).sendKeys("Sptestu1");  Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='loginButtonFrontView-btnEl']")).click();  Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='createProjectQuicklink-btnInnerEl']")).click();  Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='mainViewPortCenterPanel-innerCt']")).click();  Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='projectGenuineId-inputEl']")).click();  Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='customerNameField-inputEl']")).sendKeys("Raj");  Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='customerCity-inputEl']")).sendKeys("Mumbai");  Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='customerState-inputEl']")).sendKeys("Maharashtra");  Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='customerPostalCode-inputEl']")).sendKeys("400075");  Thread.sleep(2000);
		//WebElement cou = driver.findElement(By.xpath("//div[@id='customerCountry-trigger-picker']"));  Thread.sleep(2000);
		//Select country =new Select(cou);
		//country.deselectByVisibleText("India");
		
		driver.findElement(By.xpath("//div[@id='customerCountry-trigger-picker']")).click();  Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='countryNameList']/div[@id='countryNameList-listWrap']/ul[@id='countryNameList-listEl']/li[95]")).click();  Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='nextBtn-btnInnerEl']")).click();  Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@id='nextGoogleMapBtn-btnInnerEl']")).click();  Thread.sleep(2000);
		WebElement drop = driver.findElement(By.xpath("//input[@id='uploadFloorPlanImage-button-fileInputEl']"));
				drop.click();
		drop.sendKeys("E:\\Rahul\\QK Selinium Assesment\\PUNe Assesment\\Image.jpg");
		driver.findElement(By.xpath("//span[@id='button-1129-btnInnerEl']")).click();  Thread.sleep(2000);
		
		
		
		
		
		
		
	}
}
