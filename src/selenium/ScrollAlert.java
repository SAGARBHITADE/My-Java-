package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"J:\\\\VELOCITY CLASS\\\\SELENIUM AUTO\\\\Chrome\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://vctcpune.com/selenium/practice.html");
		ref.manage().window().maximize();

		JavascriptExecutor je = (JavascriptExecutor) ref;
		je.executeScript("window.scrollBy(0,600)");

		Thread.sleep(2000);

		ref.findElement(By.xpath("//input[@onclick='displayAlert()']")).click();
		Thread.sleep(2000);
		ref.switchTo().alert().accept();
  		//ref.close();
	}

}
