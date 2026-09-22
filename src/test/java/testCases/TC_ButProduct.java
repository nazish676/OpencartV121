package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.BuyProduct;
import testBase.BaseClass;





public class TC_ButProduct extends BaseClass { 
	
	String dte="2026-09-25";
	
	@Test
	public void buylaptop() throws InterruptedException
	{
		//logger.info("test start");
		BuyProduct buy1=new BuyProduct(driver);
		//
		
		buy1.search("hp");
		Thread.sleep(2000);
		buy1.click();
		
		buy1.Acart();
		Thread.sleep(2000);
		buy1.dat(dte);
		buy1.Aqty("2");
		
		buy1.Aacart();
		buy1.itemad();
		
		buy1.out();
		
		buy1.contbtn();
		
		
		
		
		
		buy1.Accountandbill();
		Thread.sleep(2000);
		buy1.selectctn();
		Thread.sleep(2000);
		buy1.zone();
		System.out.println("Passed test");
		//logger.info("test passed");
		
	}
	

}
