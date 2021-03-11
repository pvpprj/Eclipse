package ExcelData_Work;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteTestCase {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
      TestData d=new TestData();
      ArrayList data=d.getData("Kotak");
      
      System.out.println(data.get(0));
      System.out.println(data.get(1));
      System.out.println(data.get(2));
      System.out.println(data.get(3));
      System.out.println(data.get(4));
      String s= (String) data.get(0); 
      System.out.println();
      System.out.println("s = "+s);
      //driver.findElement(by.xpath("gfhfhh")).sendKeys(data.get(2));
      
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (9)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys(""+data.get(0)+"");
		search.sendKeys(Keys.ENTER);
		
//		search.sendKeys(data.get(0));
	//	search.sendKeys((CharSequence[]) data.get(3));
	
   	    System.out.println("1st page :  "+driver.getTitle());
	}
}
