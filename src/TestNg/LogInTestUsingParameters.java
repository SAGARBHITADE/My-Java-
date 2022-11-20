package TestNg;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import com.beust.jcommander.Parameter;
import dev.failsafe.internal.util.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
public class LogInTestUsingParameters {
	WebDriver ref;

	@Parameters("Browser")
	@BeforeTest
	public void Init(String BrowserName) {

		if (BrowserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");

			ref = new ChromeDriver();
			ref.get("https://opensource-demo.orangehrmlive.com/");
			ref.manage().window().maximize();
			
		} else {
			if (BrowserName.equals("Moz")) {
				System.setProperty("webdriver.gecko.driver",
						"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Mozilla\\geckodriver-v0.31.0-win64\\geckodriver.exe");
				ref = new FirefoxDriver();
				ref.get("https://opensource-demo.orangehrmlive.com/");
				ref.manage().window().maximize();
			}

		}
	}

	@Test
	public void Testc() {

		ref.findElement(By.id("txtUsername")).sendKeys("Admin");
		ref.findElement(By.id("txtPassword")).sendKeys("admin123");
		ref.findElement(By.className("button")).click();

	}

	@Test
	public void testc2() {
		String tl = ref.getTitle();
		System.out.println(tl);
		org.testng.Assert.assertEquals(tl,"OrangeHRM");
		
	}

	@AfterTest
	public void close() {
		ref.close();
	}

}
