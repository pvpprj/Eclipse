package GeneralStore;

import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class Ecommerce_scenerious1___65 extends Base__GeneralStore {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("android:id/text1")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Austria\"));");
		driver.findElement(By.xpath("//*[@text='Austria']")).click();

		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Raj");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click(); // Click on 1st product
		//driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click(); // Click on 2nd product
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click(); // Click on cart
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@text='Send me e-mails on discounts related to selected products in future']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		Thread.sleep(7000);
		
		Set<String> contexts = driver.getContextHandles();
		for(String contextName:contexts)
		{
			System.out.println(contextName);
		}
		
		driver.context("WEBVIEW_com.androidsample.generalstore");
		driver.findElement(By.name("q")).sendKeys("Hello");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));	
		driver.context("NATIVE_APP");
		                                        
	}
}