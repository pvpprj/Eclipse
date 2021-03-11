package Log4j_Project;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Quick_Quote {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software RAHUL\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
				
		driver.get("https://www.tataaig.com/");
				
		By buy1 = By.id("buyTab");
		WebElement buy = driver.findElement(buy1);
		buy.click();
		
		By travel1 = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div[1]/div[1]/div/ul/li[2]/a/p");
		WebElement travel = driver.findElement(travel1);
		travel.click();
		
		WebElement gender = driver.findElement(By.xpath("//*[@id=\"travelGenderSelectBoxItArrow\"]")); // dropdown
		gender.click();
		driver.findElement(By.xpath("//*[@id=\"travelGenderSelectBoxItOptions\"]/li[1]")).click();
		Thread.sleep(2000);
		
		WebElement country = driver.findElement(By.xpath("//*[@id=\"preQuoteTravelForm\"]/div[1]/div/div/div[2]/div[2]/div")); // dropdown
		country.click();
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div[2]/div[2]/label")).click();
		driver.findElement(By.id("addcountry")).click();
		Thread.sleep(2000);
		
		WebElement visit = driver.findElement(By.xpath("//*[@id=\"purposeSelectSelectBoxIt\"]")); // dropdown
		visit.click();
		driver.findElement(By.xpath("//*[@id=\"purposeSelectSelectBoxItOptions\"]/li[1]")).click();
		Thread.sleep(2000);
		
		By quickQuit1 = By.xpath("//*[@id=\"preQuoteTravelForm\"]/div[2]/div");
		WebElement quickQuit = driver.findElement(quickQuit1); 
		quickQuit.click();
		
		By member1 =By.xpath("//div[@class='plus right go-to-next-subcontent']");
		WebElement member = driver.findElement(member1);
		
		
		WebDriverWait wait=new WebDriverWait(driver, 20);	
		wait.until(ExpectedConditions.visibilityOfElementLocated(member1));
		member.click();
		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"addMember\"]")).click();
		Thread.sleep(2000);
		
		By dob1=By.xpath("//*[@id=\"travelDobMe\"]");
		WebElement dob = driver.findElement(dob1);
		dob.sendKeys("19/05/1982");
		driver.findElement(By.xpath("//*[@id=\"preQuoteTravelForm\"]/div[2]/div/ul/li[1]/div[3]/span")).click();  //Arrow
		Thread.sleep(3000);

		driver.findElement(By.xpath("//label[@for='annualTripRadio']")).click();
		//*[@id="travelStrtDate"]
		WebElement from = driver.findElement(By.xpath("//input[@id='travelStrtDate']"));
		from.sendKeys("02/03/2020");
		Thread.sleep(2000);

		WebElement till = driver.findElement(By.xpath("//input[@id='travelEndDate']"));
		till.sendKeys("01/03/2021");
		Thread.sleep(2000);
		
		WebElement duration = driver.findElement(By.xpath("//span[@id='coverageDaysSelectBoxIt']")); // dropdown
		duration.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"coverageDaysSelectBoxItOptions\"]/li[2]")).click();
		Thread.sleep(2000);
		
		WebElement getQuote = driver.findElement(By.xpath("//*[@id=\"preQuoteTravelForm\"]/div[3]/div[3]/div")); // dropdown
		getQuote.click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sr = ts.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFiles(sr,new File("C:/Users/Vishal/Pictures/Screenshots/Page123.jpg"));
	
				
		driver.findElement(By.xpath("//div[contains(text(),'DOWNLOAD PDF')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"downloadpdfclick\"]/div/div[2]/ul/li/label")).click();
		driver.findElement(By.xpath("//button[@id='downloadpdfbtn']")).click();
		Thread.sleep(5000);

		//Handling Window
		Set<String> handle = driver.getWindowHandles();

		for(String ele2 : handle) {
		driver.switchTo().window(ele2);
		}
		System.out.println(driver.getTitle());

		TakesScreenshot scrShot2 =((TakesScreenshot)driver);
		File SrcFile1=scrShot2.getScreenshotAs(OutputType.FILE);
		File DestFile1=new File("C:\\Users\\Vishal\\Pictures\\Screenshots\\"+LocalDateTime.now().getMinute()+".jpg");
	//	FileUtils.copyFile(SrcFile1, DestFile1);
		Thread.sleep(4000);
		driver.close();
	
	
		
		
	}
}
