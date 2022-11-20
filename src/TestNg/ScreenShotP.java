package TestNg;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;

//import java.util.logging.FileHandler;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotP {

	public void screenshotm(WebDriver ref, String name) throws IOException   {
		TakesScreenshot tc = (TakesScreenshot) ref;

		File source = tc.getScreenshotAs(OutputType.FILE);
		File file =new File(System.getProperty("user.dir")+"\\ScrenShot\\"+name+".png");
		FileHandler.copy(source, file);
	
	     
	
	}

	public static void main(String[] args) {
		
	}

}
