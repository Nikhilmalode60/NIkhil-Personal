package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	private WebDriver driver123;
	WebDriverWait wait = new WebDriverWait(driver123, 20 );
	
	@FindBy (xpath = "//span[text()='.in']")
	private WebElement logoCheck ;
	
	@FindBy (xpath = "//span[text()='All']")
	private WebElement allButton ;
		
	@FindBy (xpath = "//div[@class='nav-sprite hmenu-close-icon']") 
	private WebElement allButttonClose  ;
	
	@FindBy (xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchBar  ;
	
	@FindBy (xpath = "//input[@type='submit']")
	private WebElement SearchBarInput ;
	
	@FindBy (xpath = "(//a[@class='nav-a  '])[3]")
	private WebElement todaysDealButton ;
	
	@FindBy (xpath = "(//span[@class='nav-a-content'])[5]")
	private WebElement couponsButton ;
	
	public Base(WebDriver driver123)
	{
		PageFactory.initElements(driver123, this);
		
	}
	
	public void input() {
		searchBar.sendKeys("mobile");
		
	}
	
	public void seach () {
		SearchBarInput.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
