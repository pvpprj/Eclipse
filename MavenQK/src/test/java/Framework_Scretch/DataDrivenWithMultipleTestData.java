package Framework_Scretch;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenWithMultipleTestData extends Base {
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String username ,String password ) throws IOException {
		driver=InitializingDriver();
		driver.get("http://www.qaclickacademy.com/");
		/*PageObject_LandingPage l = new PageObject_LandingPage(driver);
		l.getLogin().click();
		l.username().sendKeys("pvpprj@gmail.com");
		l.password().sendKeys("Test@123");
		System.out.println("text");
		l.Login().click();  */
		
		LoginPage  l=new LoginPage(driver);
		l.getLogin().click();
		l.username().sendKeys(username);
		l.password().sendKeys(password);	
		System.out.println("text");
		l.Login().click();  
			
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[4][2];
		data [0][0]="1Login@gsg.com";
		data [0][1]="123456";
		System.out.println("1st");
		
		data [1][0]="2Login@gsg.com";
		data [1][1]="98765";
		System.out.println("2nd");
		
		data [2][0]="3Login@gsg.com";
		data [2][1]="123456";
		System.out.println("3rd");
		
		data [3][0]="4Login@gsg.com";
		data [3][1]="123456";
		System.out.println("4th");
		return data;
	}
}
