package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ContactForm;
import testBase.BaseClass;

public class TC_ContactForm extends BaseClass {
	
	@Test(groups= {"Smoke"})
	public void verify_Contact_form() throws InterruptedException 
	{
		logger.info("testcase start");
		try
		{
		System.out.println("start test");
		
		ContactForm f=new ContactForm(driver);
		f.clickreg();
		logger.info("click on registration");
		f.clickoncontact();
		
		logger.info("form fill");
		
		f.username(randomeString().toUpperCase());
		f.useremail(randomeString()+"@gmail.com");
		f.enq("randomAlphaNumeric()");
		f.submitbtn();
		f.continue2();
		logger.info("test complated");
		}
		catch(Exception e)
		{
			logger.error("test fail ******");
			logger.debug("Debug logs");
			Assert.fail();
		}
		logger.info("finish test");
	}

}
