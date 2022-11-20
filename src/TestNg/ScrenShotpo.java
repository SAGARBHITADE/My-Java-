package TestNg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrenShotpo {

	public void methodSC(WebDriver ref,String name) throws IOException {

		TakesScreenshot tc = (TakesScreenshot) ref;
		File so = tc.getScreenshotAs(OutputType.FILE);
		File file=new File(System.getProperty("user.dir")+"\\ScrenShot\\"+name+".png");
		FileHandler.copy(so, file);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//	public void MethodScreenShot(WebDriver ref, String name) {
//		// TODO Auto-generated method stub
//		
//	}

}
