package selenium;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AutometionPractice {

	public void screnshot1() throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://vctcpune.com/selenium/practice.html");
		ref.manage().window().maximize();
		TakesScreenshot tc=(TakesScreenshot)ref;
		
		File soure=tc.getScreenshotAs(OutputType.FILE);
		File fc=new File(System.getProperty("user.dir")+"\\ScrenShotP\\s6.png");
		FileHandler.copy(soure, fc);
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		AutometionPractice dd = new AutometionPractice();
		dd.screnshot1();
	}
}
