package test1234;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class NewTest {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil Malode\\OneDrive\\Desktop\\Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver() ;
		
	//	driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement input = driver.findElement(By.xpath("(//input[@class='RNmpXc'])[2]"));
		input.click();
		
		Thread.sleep(3000);
		
		WebElement drag = driver.findElement(By.xpath("//a[@id='about-link']"));
		WebElement drop = driver.findElement(By.xpath("//input[@name='q']"));
		
		Actions act = new Actions (driver);
		act.dragAndDrop(drag, drop).perform();
		
		//act.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
		//WebElement search = driver.findElement(By.xpath("(//input[@class='RNmpXc'])[2]")); 
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		WebElement ok = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		ok.click();
		
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		
		scroll.executeScript("window.scrollBy(300,0)");
		
		Thread.sleep(2000);
		
		scroll.executeScript("window.scrollBy(0,1000)");
		
		DateFormat dateForm = new SimpleDateFormat();
		
		Date date = new Date ();
		
		String currentDate = dateForm.format(date);
		
		TakesScreenshot take = (TakesScreenshot)driver;
		
		File src = take.getScreenshotAs(OutputType.FILE) ;
		
		File dest = new File("C:\\Users\\Nikhil Malode\\OneDrive\\Desktop\\Testing\\test1"+currentDate+".jpeg");
		
		FileHandler.copy(src, dest);
		
		
	}

}
