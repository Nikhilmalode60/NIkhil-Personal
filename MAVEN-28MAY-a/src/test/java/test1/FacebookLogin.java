package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Test.Facebook;

public class FacebookLogin {

	private WebDriver driver ;
	private Facebook amazonCheck ;
	
	@BeforeClass()
	public void setDriver() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil Malode\\OneDrive\\Desktop\\chromedriver.exe");
		
	}

	@BeforeMethod()
	public void driverOperations() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		amazonCheck = new Facebook(driver);
	}

	@Test()
	public void loginCheck()
	{
		amazonCheck.fbLogin();
	}

	@AfterMethod()
	public void closeDriver() {
		driver.close();
	}

	@AfterClass()
	public void nullOperations()
	{
		driver = null ;
		amazonCheck = null ;
		System.gc();
	}
}
