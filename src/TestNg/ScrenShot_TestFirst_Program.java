package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(TestNg.ScrenShoutListener.class)
public class ScrenShot_TestFirst_Program {

 static	WebDriver ref;

	@BeforeClass

	public void WebPageLod() {
		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		ref = new ChromeDriver();
		ref.get("https://www.facebook.com/login/");
		ref.manage().window().maximize();
	}

	@Test
	public void FirstTest() {
		System.out.println("sagar");

	}

	@Test
	public void SecondTest() {
		
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(ref.getTitle(), "facebook");
		System.out.println("Nikita");
		sf.assertAll();
	}
	
@Test
public void T3() {
	Assert.assertFalse(true);
}
	@AfterClass
	public void CloseWebPage() {
		ref.close();
	}
}
