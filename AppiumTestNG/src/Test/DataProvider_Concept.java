package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Concept {
	
	@Test
	public void pass3()
	{
		System.out.println("Pass3");
	}
	
	@ DataProvider
	public Object[][] GetData()
	{
		Object[][] data=new Object[3][2];
		
		data[0][0]="Username1";
		data[0][1]="Password1";
		
		data[1][0]="Username2";
		data[1][1]="Password2";
		
		data[2][0]="Username";
		data[2][1]="Password1";
		
		return data;
	}
		
@Test(dataProvider="GetData")
public void pass2(String username,String password)
{
	System.out.println(".....dataProvider....");
	System.out.println(username);
	System.out.println(password);
}


}