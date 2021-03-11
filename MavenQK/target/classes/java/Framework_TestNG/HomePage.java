package Framework_TestNG;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomePage extends Base {
	private static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void Initializer() throws IOException {
		driver = InitializingDriver();
		driver.get(p.getProperty("url"));
		log.info("Driver is initialize of Home PAge");
	}

	@AfterTest
	public void close() {
		driver.close();
	}

	@Test()
	public void basePageNavigation() throws IOException {

		LoginPage l = new LoginPage(driver);
		driver.get(p.getProperty("url"));
		String s = l.getTitle().getText();
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES12");
		l.getLogin().click();
		l.username().sendKeys(p.getProperty("username"));
		l.password().sendKeys(p.getProperty("password"));
		System.out.println("text");
		l.Login().click();
		log.info("Home Page Successfully execute" + s);
	}

	@Test()
	public void basePageNavigation1() throws IOException {

		LoginPage l = new LoginPage(driver);
		driver.get(p.getProperty("url"));
		String s = l.getTitle().getText();
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		l.getLogin().click();
		l.username().sendKeys(p.getProperty("username"));
		l.password().sendKeys(p.getProperty("password"));
		System.out.println("text");
		l.Login().click();
		log.info("Home Page Successfully execute" + s);
	}

}