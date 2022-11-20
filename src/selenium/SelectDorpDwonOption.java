package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDorpDwonOption {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://vctcpune.com/selenium/practice.html");

		ref.manage().window().maximize();

		JavascriptExecutor jjj = (JavascriptExecutor) ref;
		jjj.executeScript("window.scrollBy(0,700)");

		// ref.findElement(By.id("confirmbtn")).click();
		WebElement DropDwon = ref.findElement(By.id("dropdown-class-example"));

		Select sel = new Select(DropDwon);

		// System.out.println();
		// sel.selectByVisibleText("Option1");
		// sel.selectByIndex(2);
		List<WebElement> list = sel.getOptions();

		for (WebElement ele : list) {

			String value = ele.getText();
			System.out.println(value);

			if (value.equals("Option3")) {
				ele.click();
			}
		}

		Thread.sleep(2000);
		ref.close();

	}
}
