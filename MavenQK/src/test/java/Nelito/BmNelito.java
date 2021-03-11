package Nelito;

import java.util.List;
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

public class BmNelito {
	public static By Lead=By.xpath("//a[contains(text(),'LEAD345')]");	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);

		driver.get("https://devapp.moneyboxxfinance.com:9911");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement username = driver.findElement(By.xpath("//input[@id='USER_CODE']"));
		username.sendKeys("mbfbm00004");
		Thread.sleep(2000);
		WebElement Password	=driver.findElement(By.xpath("//input[@id='Password']"));
		Password.sendKeys("aaa222");
		Thread.sleep(2000);
		WebElement login =	driver.findElement(By.xpath("//input[@class='btn trans']"));
		login.click();
		Thread.sleep(2000);
		System.out.println("1st Page : "+driver.getTitle());
		WebElement	dashboard = driver.findElement(By.xpath("//span[contains(text(),'DASHBOARD')]"));
		dashboard.click();
		Thread.sleep(2000);
		System.out.println("1st Page : "+driver.getTitle());
		WebElement IncomeAssessmentcheck = driver.findElement(By.xpath("//h2[@id='h223']"));
		IncomeAssessmentcheck.click();
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
		
		List<WebElement> total=driver.findElements(By.xpath("//*[starts-with(@id,'ACTION_APPROVE')]"));
	    int totalCreditParameters=driver.findElements(By.xpath("//*[starts-with(@id,'ACTION_APPROVE')]")).size();
	    System.out.println("Total Credit Parameters : "+totalCreditParameters);
	    
	    for(int i=1;i<=totalCreditParameters;i++)
	    {//input[starts-with(@id,'ACTION_APPROVE')]
	    	By d=By.xpath("(//*[starts-with(@id,'ACTION_APPROVE')])["+i+"]");
	    		    	
	    	JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", driver.findElement(d));	
			Thread.sleep(1000); 		
	    }
	    
	    WebElement Remark =driver.findElement(By.xpath("//textarea[@id='FINAL_REMARK']"));
	    Remark.sendKeys("PASS");
		Thread.sleep(2000);
		System.out.println(" Remark Enter ");
		
	WebElement process = driver.findElement(By.xpath("//input[@id='PROCESS_BM']"));
	    process.click();
	    System.out.println(" Approved Successfully ");
		Thread.sleep(2000);
		
		Alert a=driver.switchTo().alert();
		String s=a.getText();
		a.accept();
		System.out.println(s);
		System.out.println("BM Work Is Done");  
		
		driver.close();
		
		Set<String> handle1 = driver.getWindowHandles();
		for(String ele3 : handle1) {
		driver.switchTo().window(ele3);
		}  
		
		System.out.println("Current Page : "+driver.getTitle());
		
		WebElement close = driver.findElement(By.xpath("//input[@name='btndone']"));
		close.click();
		Thread.sleep(3000);
		WebElement logout = driver.findElement(By.xpath("//input[@id='BtnLogout']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", logout);
		driver.close();
		
	}
}
