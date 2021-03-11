package AppiumProgram;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class browse extends baseChrome {

	public static void main(String[] args) throws MalformedURLException {
// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();

		driver.get("https://www.facebook.com");
		driver.findElementByXPath("//input[@id='m_login_email']").sendKeys("ratg@gmail.com");
		driver.findElementByXPath("//input[@id='m_login_password']").sendKeys("rsdsatg");
		driver.findElementByXPath("//button[@name='login']").click();

	/*	driver.get("https://m.cricbuzz.com/");
		driver.findElementByXPath("//div[@class='col-xs-4 col-lg-4 pull-right dis-inline']//span[@class='ui-btn-text']").click();
		driver.findElementByXPath("//*[@id=\"top\"]/div/div[11]/table/tbody/tr[1]/td[1]/a").click();
		System.out.println(driver.getCurrentUrl());
		*/
		
		//driver.get("https://www.facebook.com");
	}
}