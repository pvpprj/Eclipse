package PageObject;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends base {
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage h = new HomePage(driver);
				
		Preference p= new Preference(driver);
		
		dependencies d =new dependencies(driver);
		
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		h.preferences.click();
		
		//driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		p.dependencies.click(); 
		
		
		driver.findElementById("android:id/checkbox").click();	
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
		//driver.findElementsByClassName("android.widget.Button").get(1).click();
		p.buttons.get(1).click();
			}
}
