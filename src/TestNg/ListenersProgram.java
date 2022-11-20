package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.AfterTest;

//import org.testng.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNg.ListenerClass.class)

public class ListenersProgram {
	WebDriver ref;

	@BeforeTest
	public void FirstStep() {
		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		ref = new ChromeDriver();
		ref.manage().window().maximize();
		ref.get("https://www.facebook.com/login/");

	}

	@Test(priority = 1)
	public void VerifyTheTitle() {

		System.out.println("verify the Titel");

		// assertEquals(ref.getTitle(),"Facebook – log in or sign up");

		Assert.assertEquals(ref.getTitle(), "Log in to Facebook");
	}

	@Test(priority = 2)
	public void VerifyUrl() {
		System.out.println("Verify the url");
		Assert.assertEquals(ref.getCurrentUrl(), "https://www.facebook.com/login/");

	}
	
	@AfterTest
	public void closeWeb() {
		ref.close();
	}

}
