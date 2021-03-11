package AppiumProgram;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class time {
	
	
	AppiumDriver<WebElement> driver;

	@BeforeTest
	public void setup() throws MalformedURLException {

	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	caps.setCapability(MobileCapabilityType.UDID, "164adebd");
	caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Vivo_v9");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");

	URL url = new URL("http://0.0.0.0:4723/wd/hub");
	driver = new AppiumDriver<WebElement>(url, caps);
	}

	@Test
	public void login() throws InterruptedException {
	driver.get("https://ess-staging.ttconline.com/");
	Thread.sleep(10000);
	
	driver.findElement(By.xpath("// android.widget.EditText[@id='username']")).sendKeys("abcd");
	driver.findElement(By.xpath("// android.widget.EditText[@id='password']")).sendKeys("1234");
	driver.findElement(By.xpath("// android.widget.EditText[@text='Sign In']")).click();

	}
}
