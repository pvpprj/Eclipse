import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
 
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
 
public class base {
 
	static AppiumDriver driver;
 
	public static void main(String[] args) throws MalformedURLException {
		File f = new File("src");
		File fs=new File(f,"MoneyBoxx UAT 0.4.1.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Uiautomator2");
		cap.setCapability(MobileCapabilityType.VERSION, "9.0");
		//cap.setCapability(MobileCapabilityType.NO_RESET, "true");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Views\").instance(0))");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
 
	}
}