package Automation.ZTimepass;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BaseClass {
AppiumDriver<WebElement> driver;

@BeforeTest
public void setup() throws MalformedURLException {

DesiredCapabilities caps = new DesiredCapabilities();

caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Rahul");
caps.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
caps.setCapability("chromedriverExecutable", "E:\\Rahul\\chromeDriver\\chromedriver.exe");


caps.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");

URL url = new URL("http://0.0.0.0:4723/wd/hub");
driver = new AppiumDriver<WebElement>(url, caps);
}

@Test
public void login() throws InterruptedException {
driver.get("https://ess-staging.ttconline.com/");
Thread.sleep(10000);
/*driver.findElement(By.id("username")).sendKeys("abcd");
driver.findElement(By.id("password")).sendKeys("1234");
driver.findElement(By.id("loginBtn")).click();*/

driver.findElement(By.xpath("// android.widget.EditText[@id='username']")).sendKeys("abcd");
driver.findElement(By.xpath("// android.widget.EditText[@id='password']")).sendKeys("1234");
driver.findElement(By.xpath("// android.widget.EditText[@text='Sign In']")).click();



}


}

