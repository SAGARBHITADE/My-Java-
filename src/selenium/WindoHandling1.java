package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import inheritance.Parents;

public class WindoHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://vctcpune.com/selenium/practice.html");
		ref.manage().window().maximize();

		WebElement tab = ref.findElement(By.xpath("//*[@id=\"opentab\"]"));

		JavascriptExecutor jv = (JavascriptExecutor) ref;
		jv.executeScript("arguments[0].scrollIntoView();", tab);

		String ParentTab = ref.getWindowHandle();
		System.out.println(ParentTab);
		tab.click();
		Set<String> SubTab = ref.getWindowHandles();
		System.out.println(SubTab);

		String PTital = ref.getTitle();
		System.out.println(PTital);

	}

}
