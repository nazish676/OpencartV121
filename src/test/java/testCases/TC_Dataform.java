package testCases;

import org.testng.annotations.Test;

import pageObjects.DataEntryForm;
import testBase.BaseClass;

public class TC_Dataform extends BaseClass {
	@Test(groups= {"Sanity","Master"})
	public void dataformentry() throws InterruptedException
	{
		
		DataEntryForm fb=new DataEntryForm(driver);
		
		fb.entername("Nazish Faiyaz");
		fb.enteremail("nazish.ele@gmail.com");
		fb.enterphone("8320101159");
		fb.enteraddress("nazis chackphool panapur dharampur hajipur vaishali");
		fb.clickonday();
		fb.clickonradio();
		fb.selectoncountry();
		//fb.selectoncolor();
		fb.senddt();
		Thread.sleep(2000);
		
		System.out.println("*****All done*******");
		
		
	}
	
	
	
	

}
