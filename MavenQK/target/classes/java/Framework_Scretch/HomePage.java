package Framework_Scretch;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomePage extends Base {
	
	@Test()
	public void basePageNavigation( ) throws IOException {
		driver=InitializingDriver();
		driver.get(p.getProperty("url"));
		//PageObject_LandingPage l = new PageObject_LandingPage(driver);
		LoginPage l=new LoginPage(driver);
	String s=l.getTitle().getText();
	Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
	
		l.getLogin().click();
		l.username().sendKeys("pvpprj@gmail.com");
		l.password().sendKeys("Test@123");
		System.out.println("text");
		l.Login().click();  
		System.out.println(s);
	}
	
	
}
