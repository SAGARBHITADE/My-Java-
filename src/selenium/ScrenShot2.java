package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrenShot2 {

	public void method1() throws IOException {

		
		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://www.facebook.com/login/");
		ref.manage().window().fullscreen();

		TakesScreenshot tc = (TakesScreenshot) ref;
		File sourc = tc.getScreenshotAs(OutputType.FILE);
		File fc=new File(System.getProperty("user.dir")+ "\\ScrenShot\\s5.png");
		FileHandler.copy(sourc, fc);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ScrenShot2 ss=new ScrenShot2();
		ss.method1();
	}

}
