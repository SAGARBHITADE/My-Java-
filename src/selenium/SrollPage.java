package selenium;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SrollPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		ref.get("https://mdbootstrap.com/docs/standard/forms/datepicker/");
		ref.manage().window().maximize();
		JavascriptExecutor jv=(JavascriptExecutor)ref;
		
		//ref.findElement(By.xpath("//*[@id='section-basic-example']//section//div//section//button[@type='button']")).click();
		
		
		jv.executeScript("window.shrollBy(0,800)");
		Thread.sleep(2000);
//		jv.executeScript("window.shrollBy(400,0)");
//		ref.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
		
		ref.close();

	}

}
