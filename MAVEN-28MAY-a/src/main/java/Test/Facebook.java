package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {

	
	@FindBy (xpath = "//input[@id='email']")
	private WebElement username ;
	
	@FindBy (xpath = "//input[@id='pass']")
	private WebElement pass ;
	
	@FindBy (xpath = "//button[@name='login']")
	private WebElement login ;
	
	public Facebook(WebDriver driver123) throws InterruptedException {
		
		PageFactory.initElements(driver123, this);
		Thread.sleep(5000);
		
	}
	//use
	public void fbLogin () {
		username.sendKeys("nikhil");
		pass.sendKeys("123");
		login.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
