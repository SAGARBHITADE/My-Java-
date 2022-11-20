package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	public static void SelectDate(String Month1, int Date1) {

		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");

		WebDriver ref = new ChromeDriver();
		ref.get("https://jqueryui.com/datepicker/");
		ref.manage().window().maximize();

		WebElement Frame = ref.findElement(By.xpath("//*[@class='demo-frame']"));
		ref.switchTo().frame(Frame);
		ref.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();

		while (true) {

			WebElement Ftext = ref.findElement(By.xpath("//*[@class=\"ui-datepicker-title\"]"));
			String Stext = Ftext.getText();
			// System.out.println(Stext);
			if (!Stext.equals(Month1)) {

				// ref.findElement(By.xpath("//*[@id='ui-datepicker-div']//div//a[@title='Prev']")).click();
				WebElement prevButton = ref
						.findElement(By.xpath("//*[@id='ui-datepicker-div']//div//a[@title='Prev']"));
				prevButton.click();
			} else {
				break;
		}
	}
		ref.findElement(By.xpath("//*[@id='ui-datepicker-div']//table//tbody//tr//td//a[text()='" + Date1 + "']"))
				.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SelectDate("June 2021", 20);
	}
  
}
     