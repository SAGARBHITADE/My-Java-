package TestNg;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");

		WebDriver ref = new ChromeDriver();
		ref.get("https://jqueryui.com/datepicker/");

		ref.manage().window().maximize();

		JavascriptExecutor jj = (JavascriptExecutor) ref;
		jj.executeScript("window.scrollBy(0,500)");

		WebElement ifr = ref.findElement(By.xpath("//*[@class=\"demo-frame\"]"));
		ref.switchTo().frame(ifr);

		ref.findElement(By.xpath("//*[@class=\"hasDatepicker\"]")).click();
		while (true) {

			WebElement dateText = ref.findElement(By.xpath("//*[@class=\"ui-datepicker-title\"]"));
			String st = dateText.getText();
			//System.out.println(st);
			if(!st.equalsIgnoreCase("July 2019")) {
				ref.findElement(By.xpath("//*[@title=\"Prev\"]")).click();
			}
			else {
				break;}
			
		} 

		ref.findElement(By.xpath("//*[@id='ui-datepicker-div']//table//tbody//tr//td//a[text()=\"16\"]")).click();
	
	}

}
