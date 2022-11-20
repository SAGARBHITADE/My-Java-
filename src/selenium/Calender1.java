package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender1 {
	public static void calender() {

		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");

		WebDriver ref = new ChromeDriver();
		ref.get("https://jqueryui.com/datepicker/");
		ref.manage().window().maximize();

		WebElement frem = ref.findElement(By.xpath("//*[@class=\"demo-frame\"]"));
		ref.switchTo().frame(frem);

		ref.findElement(By.xpath("//*[@class=\"hasDatepicker\"]")).click();

		while (true) {

			WebElement Fstring = ref.findElement(By.xpath("//*[@class=\"ui-datepicker-title\"]"));
			String t = Fstring.getText();

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calender();
	}

}
