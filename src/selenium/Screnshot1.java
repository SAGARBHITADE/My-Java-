package selenium;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Screnshot1 {

	public void screncapture() {
          
		System.setProperty("webdriver.chrome.driver","J:\\\\VELOCITY CLASS\\\\SELENIUM AUTO\\\\Chrome\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		ref.get("https://www.facebook.com/");
		
		ref.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)ref;
		js.executeScript("window.scrollBy(0,300)");
		
		
	  WebElement ee=ref.findElement(By.tagName("input"));
		
		ee.click();
		
		WebElement dd=ref.findElement(By.tagName("input"));
		dd.click();
	}
		
		
		
		
		public static void main(String[] args) {
			
			
			Screnshot1 ss=new Screnshot1();
			ss.screncapture();
					
			
		}		
		
		
   		
	

}
