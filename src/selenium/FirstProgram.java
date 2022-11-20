package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver ref = new  ChromeDriver();
		ref.manage().window().maximize();
		ref.get("https://github.com/mozilla/geckodriver/releases");
		
		
		System.setProperty("webdriver.gecko.driver","J:\\VELOCITY CLASS\\SELENIUM AUTO\\Mozilla\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	}
}
