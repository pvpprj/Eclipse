package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PASS {
	
		@Parameters({"URL"})
	@Test
	public void pass1(String s)
	{
		System.out.println("Pass1");
		System.out.println(s);
	}
		
	
	
	@Test
	public void pass3()
	{
		System.out.println("Pass3");
	}
	
	
	
	
	
	
}
