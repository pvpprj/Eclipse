// Add 2 product and calculated the both amount and compare

package GeneralStore;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class Ecommerce_scenerious1___61_63 extends Base__GeneralStore {

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
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click(); // Click on 2nd product
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click(); // Click on cart
		Thread.sleep(4000);

		int count = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();
		double sum = 0;

		for (int i = 0; i < count; i++) {
			String amt11 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0)
					.getText(); // $160
			double amount11 = GetAmount(amt11);
			sum = sum + amount11;
		}

		/*
		 * String amt1 =
		 * driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).
		 * get(0).getText(); //$160 double amount1 = GetAmount(amt1); String amt2 =
		 * driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).
		 * get(1).getText(); //$120 double amount2 = GetAmount(amt2);
		 * 
		 * Double SumOfProductAmount = amount1+amount2;
		 */
		System.out.println(" Sum Of Product Amount : " + sum);

		String Total = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		double TotalValue = GetAmount(Total);

		System.out.println(" Total value : " + TotalValue);

		if (sum == TotalValue) // assert not working
		{
			System.out.println("OKKKKKK");
		}

		// 63 udemy topic starts here ..... Mobile Gestures

	/*	WebElement checkbox = driver.findElement(By.className("android.widget.CheckBox"));
		TouchAction t = new TouchAction(driver);
	//	t.tap(tapOptions().withElement(element(checkbox))).perform();
		driver.findElement(By.xpath("//*[@text='Send me e-mails on discounts related to selected products in future']")).click();

		WebElement Tc = driver.findElement(By.xpath("//*[@text='Please read our terms of conditions']"));
		t.longPress(longPressOptions().withElement(element(Tc)).withDuration(ofSeconds(2))).release().perform();
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();   */
	}

	public static double GetAmount(String value) {
		value = value.substring(1);
		double amount = Double.parseDouble(value);
		return amount;
	}
}
