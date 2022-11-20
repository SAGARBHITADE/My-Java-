package TestNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.AfterClass;

@Listeners(TestNg.ListenersAssertion.class)

public class AssertionProgram {
	static WebDriver ref;

	@BeforeClass
	public void OpenUrl() {
		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		ref = new ChromeDriver();
		ref.get("https://www.facebook.com/login/");

	}

	@Test
	public void Testcase1() {
		System.out.println(ref.getTitle());
		Assert.assertEquals(ref.getTitle(), "Log in to Facebook");

	}

//Hard assert-
	@Test
	public void TestCase2() {
		boolean Button = ref.findElement(By.xpath("//*[@id=\"loginbutton\"]")).isEnabled();
		Assert.assertTrue(Button);
		Assert.assertFalse(Button);
		
		
		System.out.println("Button Is Ebabled ");

	}

	@Test
	public void testcase3() {
		boolean Button = ref.findElement(By.xpath("//*[@id=\"loginbutton\"]")).isEnabled();
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(Button);
		soft.assertFalse(Button);
		System.out.println("Button Is Ebabled ");
		soft.assertAll();
	}

	@AfterClass
	public void CloseWeb() {
		ref.close();
	}

}
