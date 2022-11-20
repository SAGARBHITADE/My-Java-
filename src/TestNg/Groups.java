package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import java.sql.Ref;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class Groups {
	WebDriver ref;
	@BeforeClass

	public void geturl() {

		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		ref=new ChromeDriver();
		ref.get("https://www.facebook.com/login/");
		ref.manage().window().maximize();
	}

	@Test(groups = { "sanity"})
	public void FirstTest() {
		
		System.out.println("Fiend Tital of Url(sanity)");
		
		Assert.assertEquals(ref.getTitle(), "Log in to Facebook");
		
		
	}

	@Test (groups = {"sanity"})
	public void SecondTest() {
		System.out.println("Current Url ");
		ref.navigate().to("https://www.facebook.com/login/");
		Assert.assertEquals(ref.getCurrentUrl(),"https://www.facebook.com/login/");
	}
	
	@Test (groups = {"smok"})
	public void ThirdTest() {
		System.out.println("smock");
		ref.navigate().to("https://www.facebook.com/login/");
		Assert.assertEquals(ref.getCurrentUrl(),"https://www.facebook.com/login/");
	}
	@Test (groups = {"smok"})
	public void fourTest() {
		System.out.println("smock");
		ref.navigate().to("https://www.facebook.com/login/");
		Assert.assertEquals(ref.getCurrentUrl(),"https://www.facebook.com/login/");
	}
	@AfterClass
	public void CloseB() {
		ref.close();
	}

}
