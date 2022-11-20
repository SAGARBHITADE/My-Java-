package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://vctcpune.com/selenium/practice.html");
		ref.manage().window().maximize();
		WebElement xx = ref.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"));
		xx.click();

		Select dd = new Select(xx);
		dd.selectByIndex(2);

	WebElement cv=	dd.getFirstSelectedOption();
	System.out.println(cv.getText());
	
//		List<WebElement> ff = dd.getOptions();
//
//		for (WebElement cc : ff) {
//
//			String fc = cc.getText();
//			System.out.println(fc);
//		}

	}

}
