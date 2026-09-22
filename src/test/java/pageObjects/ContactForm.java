package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactForm extends BasePage {
		
	public ContactForm(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	 @FindBy (xpath = "//a[@title='My Account']")
	 WebElement reg;
	
	 @FindBy(xpath="//a[@href='https://tutorialsninja.com/demo/index.php?route=information/contact']")
	 
	 WebElement form;
	
	@FindBy(id="input-name")
	WebElement yourname;
	
	@FindBy(id="input-email") 
	WebElement email;
	
	@FindBy(linkText = "Contact Us")
	WebElement us;
	
	@FindBy(id="input-enquiry")
	WebElement enquiry;
	
	@FindBy(xpath="//input[@value='Submit']")
	WebElement submit;
	
	@FindBy(xpath="//a[text()='Continue']")
	WebElement cont;
	
	public void clickreg()
	{
		reg.click();
	}
	public void clickoncontact()
	{
		form.click();
	}
	
	public String verify()
	{
		try {
			return(us.getText());
			
		} catch (Exception e) {
			// TODO: handle exception
			return e.getMessage();
			
		}
		
		
	}
	public void username(String name)
	{
		yourname.sendKeys(name);
	}
	public void useremail(String useremail)
	{
		email.sendKeys(useremail);
	}
	public void enq(String myenquery)
	{
		enquiry.sendKeys(myenquery);
	}
	public void submitbtn()
	{
		submit.click();
	}
	
	public void continue2()
	{
		cont.click();
	}
}
