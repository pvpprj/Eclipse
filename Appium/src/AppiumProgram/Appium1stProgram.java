package AppiumProgram;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Appium1stProgram {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		File f=new File("src");
		File fs=new File(f,"MoneyBoxx.apk");
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				
		driver.findElementById("android:id/button1").click();
		Thread.sleep(10000);
		
		driver.findElementById("username").sendKeys("mbfext0001");
	
		driver.findElementById("password").sendKeys("aaa111");

		driver.findElementByClassName("android.widget.Button").click();	
		
	}
}