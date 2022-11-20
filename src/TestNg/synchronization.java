package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class synchronization {
	WebDriver ref;

	@BeforeClass
	public void OpenWebPage() {
		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		ref = new ChromeDriver();
		ref.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		ref.manage().window().maximize();

		ref.manage().timeouts().implicitlyWait(Duration.ofMillis(10));

	}

	@Test
	public void TestCase1() throws InterruptedException {

		WebElement select = ref.findElement(By.id("alert"));
		select.click();

		WebDriverWait wait = new WebDriverWait(ref, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.alertIsPresent());
		ref.switchTo().alert().accept();
		ref.findElement(By.id("populate-text")).click();
		
		
		wait.wait(15);
		WebElement gt = ref.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
		String st = gt.getText();
		Assert.assertEquals(st, "Selenium Webdriver");

	}

	@Test
	public void test2() {
//		WebDriverWait wait1 = new WebDriverWait(ref, Duration.ofSeconds(15));
//		wait1.until(ExpectedConditions.alertIsPresent());
//		ref.findElement(By.id("display-other-button")).click();
//		//wait1.until(ExpectedConditions.alertIsPresent());
	}

	@AfterClass
	public void CloseWebPage() {
		// ref.close();

	}

}
