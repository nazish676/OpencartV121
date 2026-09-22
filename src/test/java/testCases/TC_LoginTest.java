package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Login;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

import org.testng.Assert;
import pageObjects.HomePage;

import pageObjects.MyAccountPage;
import testBase.BaseClass;
public class TC_LoginTest extends BaseClass{
	@Test(groups= {"Sanity","Master"})
	public void verify_login() {
	
		logger.info("*****************Login page start*******************");
	try {	
		//Homepage
	HomePage hp=new HomePage(driver);
	hp.clickMyaccont();
	hp.clicklogin();
	
	//LoginPage
	Login lp=new Login(driver);
	lp.setEmail(p.getProperty("email"));
	lp.setPassword(p.getProperty("password"));
	lp.clickLogin();
		
	//Myaccountpage
	
	MyAccountPage macc= new MyAccountPage(driver);
	

	boolean targetPage=macc.isMyAccountPageExists();
	System.out.println("login test passed");
	
	//Assert.assertEquals(targetPage, true,"Login Failed");
	Assert.assertTrue(targetPage);
	macc.clickLogout();
	
	}
	
	catch(Exception e)
	{
		Assert.fail();
	}
	
	
	logger.info("**********Complete Logout****************");
	
	}
	
	}


