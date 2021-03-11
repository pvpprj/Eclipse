package TestNG;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class day3 {

	@Test
	public void WebLoginCarLoan()
	{
		System.out.println("WebLoginCarLoan");
	}
	
	@BeforeTest
	public void Before()
	{
		System.out.println("1st execute CarLoan");
	}
	
	
	@Test
	public void MobileLoginCarLoan()
	{
		System.out.println("MobileLoginCarLoan");
	}
	
	@Test(groups= {"smoke"})
	public void ChromeLoginCarLoan()
	{
		System.out.println("ChromeLoginCarLoan");
	}
	
	@Test
	public void ChromeALoginCarLoan()
	{
		System.out.println("AAAAChromeLoginCarLoan");
	}
	
	
}
