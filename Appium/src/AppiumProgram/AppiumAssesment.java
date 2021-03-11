package AppiumProgram;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AppiumAssesment extends baseChrome {

	public static void main(String[] args) throws MalformedURLException, Exception {
// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://ess-staging.ttconline.com/");
		Thread.sleep(10000);

		WebElement root = driver.findElement(By.tagName("login-view"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement shadom1 = (WebElement) js.executeScript("return arguments[0].shadowRoot",root);	
		
		WebElement iron = shadom1.findElement(By.cssSelector("iron-form#loginform"));
		
		iron.findElement(By.cssSelector("input#username")).sendKeys("rahul@gmail.com");
		Thread.sleep(2000);
		iron.findElement(By.cssSelector("input#password")).sendKeys("password");
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
		
		WebElement button = iron.findElement(By.cssSelector("vaadin-button#loginBtn"));
		//button.findElement(By.xpath("//button[@id='button']")).click();  
	    
	System.out.println("done........");
		
	}
}