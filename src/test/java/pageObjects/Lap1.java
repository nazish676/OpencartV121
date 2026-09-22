package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Lap1 extends BasePage{

	public Lap1(WebDriver driver) {
		super(driver);
		
	}
	
	

	@FindBy(xpath="(//a[text()='Laptops & Notebooks'])[1]")
	WebElement laptop;
	
	@FindBy(xpath="(//a[text()='Show AllLaptops & Notebooks'])[1]")
	WebElement ShowAlllaptop;
	
	@FindBy(xpath="(//span[text()='Add to Cart'])[1]")
	WebElement Addcart;
	
	@FindBy(id="input-quantity")
	WebElement qty;
	
	@FindBy(id="button-cart")
	WebElement Acart;
	
	@FindBy(id="#cart-total")
	WebElement item;
	
	@FindBy(linkText = "Checkout")
	WebElement chkout;
	
	
	public void clicklap()
	{
		laptop.click();
		ShowAlllaptop.click();
		Addcart.click();
		qty.sendKeys("4");
		Acart.click();
		item.click();
		chkout.click();
	}

}
