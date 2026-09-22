package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class BaseClass {
	
public static WebDriver driver;
public Logger logger;
public Properties p;



	
	@BeforeClass(groups= {"Master","Sanity","Regression","Smoke"}) //this line should be Enable for group testing
	@Parameters({"os","browser"}) //this line should be Enable for without group testing
//	
	public void setup(String os,String br) throws IOException
	
	{
		
		FileReader file=new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		
		logger=(Logger) LogManager.getLogger(this.getClass());
		 //this is for logger
		
		if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			DesiredCapabilities capabilities=new DesiredCapabilities();
			if(os.equalsIgnoreCase("window"))
			{
				capabilities.setPlatform(Platform.WIN11);
				
				
			}else if(os.equalsIgnoreCase("mac"))
			{
				capabilities.setPlatform(Platform.MAC);
			}else
			{
				System.out.println("No match os");
				return;
			}
			
			switch(br.toLowerCase())
			{
			case "chrome" : capabilities.setBrowserName("chrome");break;
			case "edge" :capabilities.setBrowserName("MicrosoftEdge");break;
			default : System.out.println("no matching found");
			return;
			}
			driver =new RemoteWebDriver(new URL("https://localhost:4444/wd/hub"),capabilities);
			
			
		}
		
		if(p.getProperty("execution_env").equalsIgnoreCase("local"))
		{
		 
		switch(br.toLowerCase())
		{
		case "chrome" : driver=new ChromeDriver();
		break;
		
		case "firefox" :driver=new FirefoxDriver();
		break;
		
		case "edge" :driver=new EdgeDriver();
		break;
		default :System.out.println("invalid browser name....");
		return;
		}
		
		} 
		
		driver.get(p.getProperty("appURL")); 
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		
	}
	
	@AfterClass(groups= {"Sanity","Master","Regreesion","Smoke"})  //this line should be Enable for group testing
	//@AfterClass //this line should be Enable for without group testing
	public void tearDown()
	{
		driver.close();
	}
	
	@Test
	public String randomeString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	@Test
	public String randomeNumber()
	{
		String generatedString=RandomStringUtils.randomNumeric(10);
		return generatedString;
	}
	@Test
	public String randomAlphaNumeric()
	{
		String str=RandomStringUtils.randomAlphabetic(3);
		String num=RandomStringUtils.randomNumeric(3);
		
		return (str+"@"+num);
	}
	@Test
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;
	}
}



