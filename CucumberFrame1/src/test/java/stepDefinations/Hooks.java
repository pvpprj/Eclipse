package stepDefinations;

import cucumberOption.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base{
	
	@After("@SeleniumTest,@SeleniumTest1")
	public void AfterSeleniunTest()
	{
		driver.close();
	}
		
	@Before("@MobileTest")
	public void beforevalidation()
	{
		System.out.println(" Mobile Before Hooks ");
	}
	
	@After("@MobileTest")
	public void afterWEBvalidation()
	{
		System.out.println("  After Mobile Before Hooks ");
	}
	
	@Before("@WebTest")
	public void beforeWEBvalidation()
	{
		System.out.println(" WEB Before Hooks ");
	}
	
	@After("@WebTest")
	public void aftervalidation()
	{
		System.out.println("  After WEB Before Hooks ");
	}
}