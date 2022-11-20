package selenium;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"J:\\\\VELOCITY CLASS\\\\SELENIUM AUTO\\\\Chrome\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();

		ref.get("https://vctcpune.com/selenium/practice.html");
		ref.manage().window().maximize();
		  
		JavascriptExecutor js=(JavascriptExecutor)ref;
		js.executeScript("window.scrollby(0,300)");
		WebElement se = ref.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"));

		Select sc = new Select(se);
	
		
		if(sc.isMultiple()) {
			
			sc.selectByIndex(1);
			sc.selectByIndex(2);
			
		}else {
			System.out.println("dropdown is singal silected");
			sc.selectByIndex(0);
		}
		
		
		
		//sc.selectByIndex(2);
		
		ref.findElement(By.xpath("//*[@id=\"serviceid1\"]/div/div/div[1]/input[1]")).click();
		
		
		
		
	}

}
