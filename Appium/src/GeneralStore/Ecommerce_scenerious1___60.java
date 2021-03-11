// Add 2 product and calculated the both amount and compare

package GeneralStore;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Ecommerce_scenerious1___60 extends Base__GeneralStore{

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
		
		
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();   //Click on 1st product
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();        //Click on 2nd product
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();  // Click on cart
		Thread.sleep(4000);
		
		String amt1 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();  //$160
		amt1 = amt1.substring(1);
		double amount1 = Double.parseDouble(amt1);  System.out.println(" 1st Product : "+amount1);
		
		String amt2 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();  //$120
		amt2 = amt2.substring(1);
		double amount2 = Double.parseDouble(amt2);   System.out.println(" 2nd Product : "+amount2);
		
		Double SumOfProductAmount = amount1+amount2;
		System.out.println(" Sum Of Product Amount : "+SumOfProductAmount);
		
		String Total = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		
		Total =Total.substring(1);
		double TotalValue = Double.parseDouble(Total);
		
		System.out.println(" Total value : "+TotalValue);
		 
		if(SumOfProductAmount==TotalValue)
		{
			System.out.println("OKKKKKK");
		}
	}
}
