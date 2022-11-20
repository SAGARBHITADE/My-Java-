package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrenShotPractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.manage().window().maximize();
		ref.get("https://jqueryui.com/datepicker/");

		JavascriptExecutor js1=(JavascriptExecutor)ref;
		
		js1.executeScript("window.scrollBy(0,600)");//window.scrollBy(0,600)
		

		TakesScreenshot td = (TakesScreenshot) ref;
		File so = td.getScreenshotAs(OutputType.FILE);
		File file=new File(System.getProperty("user.dir")+"\\SC\\g4.png");
		FileHandler.copy(so, file);

	}

}
