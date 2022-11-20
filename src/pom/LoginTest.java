package pom;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LoginTest {
WebDriver ref;
LoginPageElement lp;
@BeforeClass
 public void initObject() {
	lp=new LoginPageElement(ref);
}

	@BeforeSuite
	public void OpenWebPage() {

		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		ref=new ChromeDriver();
		ref.get("https://www.facebook.com/login/");
		ref.manage().window().maximize();
		ref.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void LoginCred() {
		lp.LoginCredintioal("xyz@gmail.com", "Sagar@");
		lp.button();
		
	}

	@AfterClass
	public void CloseWabPage() {
		
		ref.close();
	}

}
