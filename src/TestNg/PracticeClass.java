package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class PracticeClass {

	@BeforeSuite
	public void WebDriverMethod() {
		System.out.println("First");
	}
	@Parameters("Br")
	@BeforeTest
	public void beforeTest1(String s) {
		
		
		
		if(s.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver ref = new ChromeDriver();
		ref.get("https://www.facebook.com/login/");
		ref.manage().window().maximize();
		ref.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
			}
		else {
			if(s.equals("cr")) {
				System.setProperty("webdriver.chrome.driver",
						"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
			WebDriver ref = new ChromeDriver();
				ref.get("Google");
				ref.manage().window().maximize();
			}
		}
	}
	@BeforeClass
	public void beforeClass() {
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@Test(priority = 1)
	public void firstTest() {

		System.out.println("first1");
	}

	@Test(groups = "Sanity", priority = 2)
	public void firstTesttttt() {

		System.out.println("first2");
		//Assert.fail();
	}

	@Test(groups = "Smoke", priority = 3)
	public void firstTestttttyyy() {

		System.out.println("first3");
	}

	@AfterMethod
	public void afterMethod() {
	}

	@AfterClass
	public void afterClass() {
	}

	@AfterTest
	public void afterTest() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}
