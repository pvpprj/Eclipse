

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
//import org.apache.commons.io
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_Recording {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("1st page :  "+driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("raj");
		driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("yadav");
		driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys("67273er7627");
	//	driver.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys("raj@123");
		driver.findElement(By.xpath("//input[@id='u_0_7']")).click();
		driver.findElement(By.xpath("//button[@id='u_0_13']")).click();
		driver.switchTo().alert().accept();
		
		
		//WebElement firstname= driver.findElement(By.xpath("//input[@id='u_0_m']"));
		
		WebElement lastname	=driver.findElement(By.xpath("//input[@id='u_0_o']"));
		WebElement 	reg_email=driver.findElement(By.xpath("//input[@id='u_0_r']"));
		WebElement reg_passwd=driver.findElement(By.xpath("//input[@id='u_0_w']"));
		WebElement 	birthday_day=driver.findElement(By.xpath("//select[@id='day']"));
		WebElement 	birthday_month =driver.findElement(By.xpath("//select[@id='month']"));
		WebElement 	birthday_year=driver.findElement(By.xpath("//select[@id='year']"));
		WebElement 	Male	=driver.findElement(By.xpath("//input[@id='u_0_7']"));
		WebElement 	websubmit	=driver.findElement(By.xpath("//button[@id='u_0_13']"));

		
		WebElement	firstname=	driver.findElement(By.xpath("//input[@id='u_0_m']"));
				firstname.sendKeys("gsahgh");

		

		
		
	}

}
