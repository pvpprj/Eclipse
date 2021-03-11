package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		
		String date="22"; String month="February";
		driver.findElement(By.xpath("//*[@id=\"travel_date\"]")).click();
		
		//select month
		WebElement monthcal = driver.findElement(By.cssSelector("div[class='datepicker-days'] [class='datepicker-switch'] "));
		
		while(!monthcal.getText().contains(month))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
				
		//select date    : grab common attribute //put into list and iterate
		List<WebElement> d=driver.findElements(By.cssSelector(".day"));                                      //by x path (//td[@class='day'])
		int count = driver.findElements(By.cssSelector(".day")).size();
		System.out.println("Total Count "+driver.findElements(By.cssSelector(".day")).size());
		
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.cssSelector(".day")).get(i).getText();
			if(text.equalsIgnoreCase(date))
			{
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}
		} 
	}
}