package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Login;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;



/*Data is valid  - login success - test pass  - logout
Data is valid -- login failed - test fail

Data is invalid - login success - test fail  - logout
Data is invalid -- login failed - test pass
*/

public class TC_003LoginDDT extends BaseClass
{ 

	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void verify_loginDDT(String email, String password, String exp)
	{
		logger.info("**** Starting TC_003_LoginDDT *****");
		
		try {
	
		//Home page
			HomePage hp=new HomePage(driver);
			hp.clickMyaccont();
			hp.clicklogin();
		 //Login link under MyAccount
				
			//Login page
			Login lp=new Login(driver);
			lp.setEmail(email);
			lp.setPassword(password);
			lp.clickLogin();
				
			//My Account Page
			MyAccountPage macc=new MyAccountPage(driver);
			boolean targetPage=macc.isMyAccountPageExists();
			
			if(exp.equalsIgnoreCase("Valid"))
			{
				if(targetPage==true)
				{
					macc.clickLogout();
					Assert.assertTrue(true);
					System.out.println("Test passed DDT");
				}
				else
				{
					Assert.assertTrue(false);
					System.out.println("Test FAILED DDT");
				}
			}
			
			if(exp.equalsIgnoreCase("Invalid"))
			{
				if(targetPage==true)
				{
					macc.clickLogout();
					Assert.assertTrue(false);
					System.out.println("Test passed DDT");
				}
				else
				{
					Assert.assertTrue(true);
					System.out.println("Test FAILED DDT");
				}
			}
		}
		catch(Exception e)
		{
			Assert.fail("An exception occurred: " + e.getMessage());
		}
			
		logger.info("**** Finished TC_003_LoginDDT *****");
	}
	
}








