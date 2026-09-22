package pageObjects;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DataEntryForm extends BasePage {
	
	
	
	public DataEntryForm(WebDriver driver) {
		super(driver);
		
	}
 @FindBy(id="name")
 WebElement txtname;
 
 @FindBy(id="email")
 WebElement txtemail;
 
 @FindBy(id="phone")
 WebElement txtphone;
 
 @FindBy(id="textarea")
 WebElement txtaddress;
 
 @FindBy(xpath="//input[@value='female']")
 WebElement clickongender;
 
 @FindBy(id="tuesday")
 WebElement clickonday;
 
 @FindBy(id="country")
 WebElement selecttcountry;
 
 @FindBy(id="color")
 WebElement selecttcolor;
 
 @FindBy(id="datepicker")
 WebElement selectdt;
 
 public void entername(String name)
 {
	 txtname.sendKeys(name);
 }
 public void enteremail(String email)
 {
	 txtemail.sendKeys(email);
 }
 public void enterphone(String number)
 {
	 txtphone.sendKeys(number);
 }
 public void enteraddress(String add)
 {
	 txtaddress.sendKeys(add);
 }
 public void clickonradio()
 {
	 clickongender.click();
 }
 public void clickonday()
 {
	 clickonday.click();
 }

 public void selectoncountry()
 {
	 Select sc=new Select(selecttcountry);
	 sc.selectByIndex(5);
 }

 public void senddt()
 {
	 selectdt.sendKeys("05/05/2025");
 }
 
	

}
