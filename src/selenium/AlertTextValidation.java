package selenium;

import java.awt.Window;
import java.sql.Ref;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTextValidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver.exe");
		
		WebDriver ref=new ChromeDriver();
		ref.get("https://vctcpune.com/selenium/practice.html");
		ref.manage().window().maximize();
		
		JavascriptExecutor jv=(JavascriptExecutor)ref;
		jv.executeScript("window.scrollBy(0,600)");
		
		ref.findElement(By.id("name")).sendKeys("sagar");
		ref.findElement(By.id("confirmbtn")).click();
		Thread.sleep(5000);
		
		if(ref.switchTo().alert().getText().equals("sagar1")) {
			Thread.sleep(5000);
			ref.switchTo().alert().accept();
			
			
		}else {
			ref.switchTo().alert().dismiss();
		}
		
		ref.close();

	}

}
