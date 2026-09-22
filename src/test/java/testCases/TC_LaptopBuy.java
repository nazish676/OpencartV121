package testCases;


import org.testng.annotations.Test;

import pageObjects.Lap1;
import testBase.BaseClass;

public class TC_LaptopBuy extends BaseClass{
	@Test
	public void lappi()
	{
		
		
	Lap1 lappi=new Lap1(driver);
	
	lappi.clicklap();
	
		
		
	
		
	}

}
