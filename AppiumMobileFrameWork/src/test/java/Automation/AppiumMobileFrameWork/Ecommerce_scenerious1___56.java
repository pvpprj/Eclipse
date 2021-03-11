//add product as per the user provided and add to the cart 

package Automation.AppiumMobileFrameWork;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Ecommerce_scenerious1___56 extends Base__GeneralStore{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		AndroidDriver<AndroidElement> driver = capabilities("GeneralStoreApp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Austria\"));");
		driver.findElement(By.xpath("//*[@text='Austria']")).click();
				
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Raj");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
		int count = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		
		for(int i=0;i<count;i++)
		{
			String prod = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			
			if(prod.equalsIgnoreCase("Jordan 6 Rings"))
			{
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
				break;
			}
		}
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		//Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@text='Send me e-mails on discounts related to selected products in future']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		
	
	}
}
