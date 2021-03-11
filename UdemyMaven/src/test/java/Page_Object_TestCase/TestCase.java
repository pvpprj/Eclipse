package Page_Object_TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase {

	@Test
	public void Login()
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Software RAHUL\\DRIVER\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://google.com");
		
	}
	
	
}
