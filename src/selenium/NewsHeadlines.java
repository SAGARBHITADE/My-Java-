package selenium;

import java.awt.Color;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsHeadlines {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		  "J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.espncricinfo.com/");
	      // identify text
	      WebElement t = driver.findElement(By.xpath("//*[@class=\"ds-bg-fill-navbar\"]"));
	      //obtain color in rgba
	      String s = t.getCssValue("background-color");
	      // convert rgba to hex
	      // String c =t.getText();
	    		  //fromString(s).asHex();
	     System.out.println("Color is :" + s);
	     String ss=t.getText();
	     
	     
	     
	      ///System.out.println("Hex code for color:" + c);
	      driver.quit();
	}

}
