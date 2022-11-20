package basicjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderProgram {
	
	public void m1(String Month, int Date) {
		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://jqueryui.com/datepicker/");
		ref.manage().window().maximize();
		WebElement frem1 = ref.findElement(By.xpath("//*[contains(@class,'demo-f')]"));
		ref.switchTo().frame(frem1);
		ref.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		while (true) {
			WebElement selectText = ref.findElement(By.xpath("//*[@class=\"ui-datepicker-title\"]"));
			String Text = selectText.getText();
			System.out.println(Text);
			if (!Text.equals(Month)) {
				WebElement prv = ref.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]//div//a[@title=\"Prev\"]"));
				prv.click();
			} else {
				break;
			}
		}
		ref.findElement(By.xpath("//*[@class=\"ui-datepicker-calendar\"]//tbody//tr//td//a[text()='"+Date+"']")).click();

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalenderProgram cc=new CalenderProgram();
		cc.m1("August 2019",20);
			}
}
