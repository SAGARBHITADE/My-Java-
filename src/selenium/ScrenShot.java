package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrenShot {

	public void CaptureScren() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");

		WebDriver ref = new ChromeDriver();
		ref.get("https://vctcpune.com/selenium/practice.html");
		ref.manage().window().maximize();
		TakesScreenshot tc = (TakesScreenshot) ref;

		File source = tc.getScreenshotAs(OutputType.FILE);
		File f = new File(System.getProperty("user.dir") + "\\ScrenShotP\\s3.png");
		FileHandler.copy(source, f);

		ref.close();

//			File source=tss.getScreenshotAs(OutputType.FILE);

	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ScrenShot src = new ScrenShot();
		src.CaptureScren();
	}

}
