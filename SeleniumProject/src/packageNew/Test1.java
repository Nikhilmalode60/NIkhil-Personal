package packageNew;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test1 {
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil Malode\\OneDrive\\Desktop\\Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver() ;
		
		driver.get("https://www.google.com/");
		
		WebElement input = driver.findElement(By.xpath("(//input[@class='RNmpXc'])[2]"));
		input.click();
		
		DateFormat dateForm = new SimpleDateFormat();
		
		Date date = new Date ();
		
		String currentDate = dateForm.format(date);
		
		TakesScreenshot take = (TakesScreenshot)driver;
		
		File src = take.getScreenshotAs(OutputType.FILE) ;
		
		File dest = new File("C:\\Users\\Nikhil Malode\\OneDrive\\Desktop\\Testing\\test1"+currentDate+".jpeg");
		
		FileHandler.copy(src, dest);
		
		System.out.println(currentDate);
	}
}