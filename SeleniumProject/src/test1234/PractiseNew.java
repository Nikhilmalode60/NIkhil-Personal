package test1234;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseNew {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nikhil Malode\\OneDrive\\Desktop\\Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement logIn = driver.findElement(By.xpath("//a[text()='Log in']"));
		logIn.click();
		
		WebElement signUp = driver.findElement(By.xpath("//span[text()=' Sign up']"));
		signUp.click();
		
		WebElement emailSignUp = driver.findElement(By.xpath("//input[@id='modalusername']"));
		emailSignUp.sendKeys("nikhilmalode60@gmail.com");
		
		WebElement passWord = driver.findElement(By.xpath("//input[@id='new-password']"));
		passWord.sendKeys("Master@12345");
		
		WebElement checkBox = driver.findElement(By.xpath("//div[@id='emailConsentCheckBox-wrapper']"));
		checkBox.click();
		
		WebElement loginButton = driver.findElement(By.xpath("//span[text()='Sign up for free']"));
		loginButton.click();
		
		WebElement firstNameInput = driver.findElement(By.xpath("//input[@id='modal_first_name']"));
		firstNameInput.sendKeys("Nikhil");
		WebElement lastNameInput = driver.findElement(By.xpath("//input[@id='modal_last_name']"));
		lastNameInput.sendKeys("Malode");
		
		WebElement continueButton = driver.findElement(By.xpath("//span[text()='Continue']"));
		continueButton.click();
		
		
		
		
		
		
	}
}