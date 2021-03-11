package Simple123;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
				//String s=driver.getTitle();
		System.out.println(driver.findElements(By.tagName("a")).size());
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("RAJ");
		driver.findElement(By.cssSelector("#pass")).sendKeys("hsssj");;
		//driver.findElement(By.cssSelector("#u_0_b")).click();
		driver.findElement(By.id("u_0_b")).click();
		
		System.out.println("TITLE : "+driver.getTitle());
			
	}
}
