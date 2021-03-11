package qkAssesment;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BdoNelito {
	public static By Lead=By.xpath("//a[contains(text(),'LEAD25')]");	

	public static void main(String[] args) throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);

		driver.get("https://devapp.moneyboxxfinance.com:9911");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement username = driver.findElement(By.xpath("//input[@id='USER_CODE']"));
		username.sendKeys("mbfbdo00004");
		Thread.sleep(2000);
		WebElement Password	=driver.findElement(By.xpath("//input[@id='Password']"));
		Password.sendKeys("aaa111");
		Thread.sleep(2000);
		WebElement login =	driver.findElement(By.xpath("//input[@class='btn trans']"));
		login.click();
		Thread.sleep(2000);
		System.out.println("1st Page : "+driver.getTitle());
		WebElement	dashboard = driver.findElement(By.xpath("//span[contains(text(),'DASHBOARD')]"));
		dashboard.click();
		Thread.sleep(2000);
		WebElement ProceedForDisbursement= driver.findElement(By.xpath("//h2[@id='h219']"));
		ProceedForDisbursement.click();
		Thread.sleep(2000);
		
		WebElement LeadNo=driver.findElement(Lead);
		
		WebDriverWait w=new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(Lead));
		LeadNo.click();
		
//		Robot robot = new Robot();
		 Thread.sleep(4000);

		Set<String> handle = driver.getWindowHandles();
		for(String ele2 : handle) {
		driver.switchTo().window(ele2);
		}
		 Thread.sleep(4000);
		 
		WebElement  AccountNo = driver.findElement(By.xpath("//input[@id='BTN_CREATE_ACT']"));
		AccountNo.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
					
		WebElement insuranceDetails = driver.findElement(By.xpath("//input[@id='VEH_INS_DTL']"));
		insuranceDetails.click();
		Thread.sleep(4000);
		
		Set<String> hand = driver.getWindowHandles();
		for(String ele3 : hand) {
		driver.switchTo().window(ele3);
		}
		
		WebElement insuranceDetails2 = driver.findElement(By.xpath("//input[@id='btnCalculatePremium']"));
		insuranceDetails2.click();
		Thread.sleep(5000);
		
		WebElement Insert = driver.findElement(By.xpath("//input[@id='btninsertinsu']"));
		Insert.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='ui-button-icon-primary ui-icon ui-icon-closethick'])[2]")).click();
		Thread.sleep(2000);
		
		WebElement Disbursement = driver.findElement(By.xpath("//input[@class='tab-button disburment mt3 trans']"));
		Disbursement.click();  
		Thread.sleep(2000);
		
		WebElement add = driver.findElement(By.xpath("//input[@id='btnAddDisbursement']"));
		add.click();
		Thread.sleep(2000);
		
		WebElement frankingCharges = driver.findElement(By.xpath("//input[@id='CALC_AMT_TEMP3']"));
		frankingCharges.sendKeys(Keys.CONTROL, Keys.chord("a"));
		frankingCharges.sendKeys(Keys.BACK_SPACE);
		frankingCharges.sendKeys("100");
		Thread.sleep(2000);

		WebElement save = driver.findElement(By.xpath("//input[@id='WF_SAVE']"));
		save.click();
		System.out.println(" Approved LAN Creation  Successfully ");
		Thread.sleep(2000);
		
		driver.switchTo().alert();
		Thread.sleep(5000);
		
	/*	Alert a=driver.switchTo().alert();
		String s=a.getText();
		a.accept();  */
		
		try {
			Alert a=driver.switchTo().alert();
			String s=a.getText();
			a.accept();
			System.out.println(s);  
			//log.info("LAN Creation Done : " +s);
		} catch (UnhandledAlertException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.switchTo().alert().accept();
		}
		
		Thread.sleep(3000);
		System.out.println("BDO LAN Creation Work Is Done"); 
				
		/* driver.close();
		Set<String> handle1 = driver.getWindowHandles();
		for(String ele3 : handle1) {
		driver.switchTo().window(ele3);
		}
		
		WebElement close = driver.findElement(By.xpath("//input[@name='btndone']"));
		close.click();
		Thread.sleep(3000);*/
		
		WebElement logout = driver.findElement(By.xpath("//input[@id='BtnLogout']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", logout);
		driver.quit();
			
	}
}
