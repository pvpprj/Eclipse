package Test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class Car {

	@Test
	public void ApiLoginCarLoan() {
		System.out.println("ApiLoginCarLoan");
		System.out.println("s");
	}

	@Test
	public void WebLoginCarLoan() {
		System.out.println("WebLoginCarLoan");
		// Assert.assertTrue(false); // To check fail listners is working or not.
	}

	@Test(groups = { "smoke" })
	public void MobileLoginCarLoan() {
		System.out.println("MobileLoginCarLoan");
	}

	@AfterTest
	public void LastExcution() {
		System.out.println("LastExcution");
	}

	@BeforeTest
	public void FisrstExcution() {
		System.out.println("First_Excution");
	}

}
