package UdemyMaven.UdemyMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Software RAHUL\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kotak.com/en/digital-banking/ways-to-bank/net-banking.html");
		driver.manage().window().maximize();
		driver.get("https://www.kotak.com/en/digital-banking/ways-to-bank/net-banking.html");
		System.out.println("1st page :  "+driver.getTitle());
		
	
}
}