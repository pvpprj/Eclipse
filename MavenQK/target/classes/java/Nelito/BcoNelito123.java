package Nelito;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BcoNelito123 {
	public static By Lead=By.xpath("//a[contains(text(),'LEAD240')]");	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);

		driver.get("https://devapp.moneyboxxfinance.com:9911");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='USER_CODE']")).sendKeys("mbfbco00004");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("aaa333");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='btn trans']")).click();
		Thread.sleep(2000);
		System.out.println("1st Page : "+driver.getTitle());
		driver.findElement(By.xpath("//span[contains(text(),'DASHBOARD')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[@id='h29']")).click();
		Thread.sleep(2000);
		
		WebElement LeadNo=driver.findElement(Lead);
		
		WebDriverWait w=new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(Lead));
		LeadNo.click();
		
		Set<String> handle = driver.getWindowHandles();
		for(String ele2 : handle) {
		driver.switchTo().window(ele2);
		}
		System.out.println("2nd Page : "+driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='ACTION_APPROVE1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ACTION_APPROVE2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ACTION_APPROVE3']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ACTION_APPROVE4']")).click();
		Thread.sleep(1000);
		
		WebElement 	Business = 	driver.findElement(By.xpath("//input[@id='ACTION_APPROVE5']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", Business);	
		Thread.sleep(1000);
		
		WebElement 	BusinessInformation =	driver.findElement(By.xpath("//input[@id='ACTION_APPROVE6']"));
		executor.executeScript("arguments[0].click();", BusinessInformation);
		Thread.sleep(1000);
		
		WebElement  ExistingBankAccountDetails = driver.findElement(By.xpath("//input[@id='ACTION_APPROVE7']"));
		executor.executeScript("arguments[0].click();", ExistingBankAccountDetails);
		Thread.sleep(1000);
		WebElement  ExistingLoanDetails = driver.findElement(By.xpath("//input[@id='ACTION_APPROVE8']"));
		executor.executeScript("arguments[0].click();", ExistingLoanDetails);
		Thread.sleep(1000);
		WebElement InsuranceDetails = driver.findElement(By.xpath("//input[@id='ACTION_APPROVE9']"));
		executor.executeScript("arguments[0].click();", InsuranceDetails);
		Thread.sleep(1000);
		WebElement Reference = driver.findElement(By.xpath("//input[@id='ACTION_APPROVE10']"));
		executor.executeScript("arguments[0].click();", Reference);
		Thread.sleep(1000);
		WebElement DocumentDetails= driver.findElement(By.xpath("//input[@id='ACTION_APPROVE11']"));
		executor.executeScript("arguments[0].click();", DocumentDetails);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='RECOM_REMARK']")).sendKeys("PASS By Bco");
		Thread.sleep(3000);
		
		driver.close();
		
		Set<String> handle1 = driver.getWindowHandles();
		for(String ele3 : handle1) {
		driver.switchTo().window(ele3);
		}
		
		driver.findElement(By.xpath("//input[@name='btndone']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='BtnLogout']")).click();
		driver.close();
		
		/*driver.findElement(By.xpath("//input[@id='APPROVE']")).click();
		Thread.sleep(2000);
		
		Alert a=driver.switchTo().alert();
		String s=a.getText();
		a.accept();
		System.out.println(s);
		System.out.println("BCO Work Is Done");   */
				
	}
}
