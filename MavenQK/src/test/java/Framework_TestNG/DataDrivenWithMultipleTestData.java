package Framework_TestNG;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenWithMultipleTestData extends Base {
	
	private static Logger log =  LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void Initializer() throws IOException
	{
		driver=InitializingDriver();
		log.info("Driver is initialize of Multiple Teat Data");	
	}
	
	@Test(dataProvider="getData")
	public void MultipleData(String username ,String password ) throws IOException {
		
		driver.get(p.getProperty("url"));	
		LoginPage  l=new LoginPage(driver);
		l.getLogin().click();
		l.username().sendKeys(username);
		l.password().sendKeys(password);	
		l.Login().click();  
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
		driver=null;
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data [0][0]="1Login@gsg.com";
		data [0][1]="123456";
		log.info("1st Test data execute");
		
		data [1][0]="2Login@gsg.com";
		data [1][1]="98765";
		log.info("2nd Test data execute");
		
	/*	data [2][0]="3Login@gsg.com";
		data [2][1]="123456";
		log.info("3rd Test data execute");
		
		data [3][0]="4Login@gsg.com";
		data [3][1]="123456";
		log.info("4th Test data execute");  */
		return data;
	}
}
