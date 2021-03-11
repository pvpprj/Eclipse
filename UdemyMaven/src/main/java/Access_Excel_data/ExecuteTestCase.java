package Access_Excel_data;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteTestCase {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
      TestData d=new TestData();
      ArrayList data=d.getData("Kotak");
      
      System.out.println(data.get(0));
      System.out.println(data.get(1));
      System.out.println(data.get(2));
      System.out.println(data.get(3));
      System.out.println(data.get(4));
      //driver.findElement(by.xpath("gfhfhh")).sendKeys(data.get(2));
      
      System.setProperty("webdriver.chrome.driver", "C:\\Software RAHUL\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		
		//search.sendKeys(data.get(3));
		System.out.println("1st page :  "+driver.getTitle());
		  
  
	}
}
