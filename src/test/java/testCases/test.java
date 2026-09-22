package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

import net.bytebuddy.utility.RandomString;
import pageObjects.ContactForm;
import testBase.BaseClass;

public class test extends BaseClass {
	
	WebDriver driver;
	
 
	@Test
	public void contactfrom()
	{
		ContactForm f=new ContactForm(driver);
		f.clickreg();
		f.clickoncontact();
		String t=f.verify();
		Assert.assertEquals(t, "Contact Us");
		f.username(randomeString().toUpperCase());
		f.useremail(randomeString()+"@gmail.com");
		f.enq("randomAlphaNumeric()");
		f.submitbtn();
		f.continue2();
		
	}

}
