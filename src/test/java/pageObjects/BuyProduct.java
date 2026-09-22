package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BuyProduct extends BasePage {
	
	
	public BuyProduct(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	 @FindBy(xpath=" //input[@placeholder='Search']")
	 WebElement Sbtn;
	 
	 @FindBy(xpath ="//button[@class='btn btn-default btn-lg']" )
	 WebElement sicon;
	 
	 @FindBy(xpath="//span[text()='Add to Cart']")
	 WebElement Addcart;
	 
	 @FindBy(xpath = "(//input[@id='input-quantity'])[1]")
	 WebElement Qty;
	 
	 @FindBy(id="input-option225")
	 WebElement date;
	 
	 @FindBy(id="button-cart")
	 WebElement AddtoCart;
	 
	 @FindBy(id="cart-total")
	 WebElement itemAdd;
	 
	 @FindBy(xpath="//strong[normalize-space()='Checkout']")
	 WebElement checkout;
	 
	 @FindBy(css="#button-account")
	 WebElement ctbtn;
	 
	 @FindBy(id="input-payment-firstname")
	 WebElement fname;
	 @FindBy(id="input-payment-lastname")
	 WebElement lname;
	 @FindBy(id="input-payment-email")
	 WebElement email;
	 @FindBy(id="input-payment-telephone")
	 WebElement tel;
	 @FindBy(id="input-payment-password")
	 WebElement pwd;
	 @FindBy(id="input-payment-confirm")
	 WebElement cpwd;
	 
	 @FindBy(id="input-payment-address-1")
	 WebElement add1;
	 @FindBy(id="input-payment-city")
	 WebElement city;
	 
	 @FindBy(id="input-payment-postcode")
	 WebElement postcode;
	 @FindBy(id="input-payment-country")
	 WebElement country;
	 @FindBy(id="input-payment-zone")
	 WebElement zone;
	 
	 @FindBy(xpath="(//input[@name='agree'])[1]")
	 WebElement check;
	 

	 @FindBy(id="button-register")
	 WebElement conbtn;
	 
	 
	
	public void search(String lname) throws InterruptedException
	{
		
		Sbtn.sendKeys(lname);
	}
	public void click()
	{
		
		sicon.click();
	}
	public void Acart()
	{
		
		Addcart.click();
	}
	public void Aqty(String no) {
		Qty.clear();
		Qty.sendKeys(no);
	}
	public void dat(String dt)
	{
		date.clear();
		date.sendKeys(dt);
		
	}
	public void Aacart()
	{
		AddtoCart.click();
	}
	public void itemad() {
		itemAdd.click();
	}
	public void out()
	{
		checkout.click();
	}
	public void contbtn()
	{
		ctbtn.click();
	}
	
	public void Accountandbill()
	{
		fname.sendKeys("Nazis");
		lname.sendKeys("Faiyaz");
		tel.sendKeys("8320101147");
		email.sendKeys("abd@gmail.com");
		add1.sendKeys("Hajipur bihar");
		city.sendKeys("Hajipur");
		postcode.sendKeys("844102");
		
	}
	public void selectctn()
	{
		country.click();
		Select sc=new Select(country);
		sc.selectByIndex(2);
	}
	public void zone()
	{
		zone.click();
		Select sc=new Select(zone);
		sc.selectByIndex(2);
		check.click();
		conbtn.click();
	}
		
		
	

}
