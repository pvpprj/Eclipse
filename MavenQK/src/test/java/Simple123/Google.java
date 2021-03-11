package Simple123;

import java.awt.List;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://devapp.moneyboxxfinance.com:9911/");
		driver.manage().window().maximize();

		By username = By.id("USER_CODE");
		WebElement username1 = driver.findElement(username); // highLightElement(driver,username1);
		username1.sendKeys("mbfbco00004");

		By password = By.xpath("//*[@id=\"Password\"]");
		WebElement password1 = driver.findElement(password); // highLightElement(driver,password);
		password1.sendKeys("aaa333");

		By submit = By.xpath("//input[@value=\"LOGIN\"]");
		WebElement submit1 = driver.findElement(submit); // highLightElement(driver,submit1);
		submit1.click();

		By dashboard = By.xpath("//*[@id=\"DASHBOARD\"]/div[1]/div/i/img");
		WebElement dashboard1 = driver.findElement(dashboard); // highLightElement(driver,submit1);
		dashboard1.click();

		By NewLeads = By.xpath("//*[@id=\"h29\"]");
		WebElement NewLeads1 = driver.findElement(NewLeads); // highLightElement(driver,submit1);
		NewLeads1.click();

		String leadno = "LEAD219";
		By leads = By.linkText(leadno);
		WebElement leads1 = driver.findElement(By.xpath("//*[@id=\"Doc_Check_Lst1\"]/tbody/tr[7]/td[1]/a")); // highLightElement(driver,submit1);
	//	leads1.click();

		Set<String> s = driver.getWindowHandles();
		int size = s.size();
		Iterator<String> it = s.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		System.out.println("2nd page :  " + driver.getTitle());

		// driver.switchTo().frame(driver.findElement(By.className("")));

		// driver.findElement(By.xpath("// [@id=\"ACTION_APPROVE1\"]")).click();
		// driver.findElement(By.xpath("// [@id=\"ACTION_APPROVE2\"]")).click();
		// driver.findElement(By.xpath("// [@id=\"ACTION_APPROVE3\"]")).click();

		// driver.findElement(By.(linkText))

		By sel = By.cssSelector("input[value='1']");
		WebElement sel1 = driver.findElement(sel);
		System.out.println("Size : " + sel1.getSize());
		
		//List s =driver.findElement("By.cssSelector(\"input[value='1']\")");

		Set <WebElement> elements=(Set<WebElement>) driver.findElements(sel);
		
		for (int i =0 ; i < elements.size(); i++)
		{
			if (i > 4 && i < elements.size()) 
			{
				sel1.click();
			}
			System.out.println(" Status is -  " + sel1.isSelected());
		} // sel1.click();

	}


		  
	}


