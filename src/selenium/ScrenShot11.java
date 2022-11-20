package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrenShot11 {

	public void takescrenshot() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://about.facebook.com/");
		ref.manage().window().maximize();

		TakesScreenshot tc = (TakesScreenshot) ref;
		File fc = tc.getScreenshotAs(OutputType.FILE);
		File sorce=new File(System.getProperty("user.dir")+"\\ScrenShotP\\p4.png");
		FileHandler.copy(fc, sorce);
		// "\\ScrenShotP\\s4.png");

	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ScrenShot11 ss = new ScrenShot11();
		ss.takescrenshot();
	}

}
