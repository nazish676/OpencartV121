package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_Account_page extends BaseClass {
	 
	//@Test(groups= {"Regression","Master"})
	@Test
	public void myaccount() throws InterruptedException
	{
		try
		{
		HomePage hp=new HomePage(driver);
		
		hp.clickMyaccont();
		hp.clickRegister();
		System.out.println("Passed test");
		logger.info("***** Starting TC001_AccountRegistrationTest  ****");
		logger.debug("This is a debug log message");
AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		Thread.sleep(2000);
		regpage.setFirstName(randomeString().toUpperCase());
		regpage.setLastName(randomeString().toUpperCase());
		regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
		regpage.setTelephone(randomNumeric());
		
		String password=randomAlphaNumeric();
		
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		Thread.sleep(5000);
		
		logger.info("Validating expected message..");
		String confmsg=regpage.getConfirmationMsg();
		Thread.sleep(2000);
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		
		logger.info("Test passed");
	} 
	catch (Exception e)
	{
		logger.error("Test failed: " + e.getMessage());
		Assert.fail("Test failed: " + e.getMessage());
	} 
	finally 
	{
	logger.info("***** Finished TC001_AccountRegistrationTest *****");
	}


		
		
	}

	private String randomNumeric() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
//	private String randomeString() {
//		String generatedstring=RandomStringUtils.randomAlphabetic(5);
//		return randomeString();
//	}
//	private String randomAlphaNumeric() {
//		String generatedstring=RandomStringUtils.randomAlphabetic(5);
//		String generatednumber=RandomStringUtils.randomNumeric(10);
//
//		return (generatedstring+generatednumber);
//	}
//
//	private String randomNumeric() {
//		String generatednumber=RandomStringUtils.randomNumeric(10);
//		return randomNumeric();
//	}
	
	}

			


