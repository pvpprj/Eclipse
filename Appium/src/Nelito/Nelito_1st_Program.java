package Nelito;
import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Nelito_1st_Program extends Nelito_Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);

		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='username']")).sendKeys("mbfext0001");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='password']")).sendKeys("Test@123");
		driver.hideKeyboard();
		
		//driver.findElementByXPath("//android.widget.Button[5]").click();
		//driver.findElements(By.xpath("//android.widget.Button[5]")).click();
		//driver.findElement(By.xpath("//android.widget.Button[@content-desc='LOGIN']")).click();
		//"//android.view.View 11[@content-desc=‘Abscess Overview Heading’]"
		
		//List <WebElement> checkbox = driver.findElements(By.xpath("//android.widget.EditText[@id='android:id/edit']"));
		
		List<AndroidElement> btn = driver.findElements(By.xpath("//*[@class='android.widget.Button']"));
        System.out.println(btn.size() + " list size is");
        btn.get(0).click();
        
		
	}
}



//driver.findElements(By.className("android.widget.Button")).get(5).click();
	//driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
	
	/*List <WebElement> checbox = driver.findElement(By.xpath("//android.widget.EditText[@id='android:id/edit']"));

	System.out.println(checbox.size());
	checbox.get(0).click();
*/