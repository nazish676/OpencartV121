package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	//span[normalize-space()='My Account']
	
	
	//a[normalize-space()='Register']
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	
	WebElement lnkMyaccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	@FindBy(linkText = "Login")
	WebElement loginbtn;
	
	public void clickMyaccont()
	{
		lnkMyaccount.click();
		
	}
	public void clickRegister()
	{
		lnkRegister.click();
	}
	public void clicklogin()
	{
		loginbtn.click();
	}
	

}
