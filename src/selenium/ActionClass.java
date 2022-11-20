package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();

		ref.get("https://jqueryui.com/draggable/");
		ref.manage().window().maximize();

//		WebElement frame=ref.findElement(By.className("demo-frame"));
//		ref.switchTo().frame(frame);
		WebElement frame = ref.findElement(By.xpath("//*[@class='demo-frame']"));
		ref.switchTo().frame(frame);
		WebElement drag = ref.findElement(By.xpath("//*[@id=\"draggable\"]"));
		Actions ActionObject = new Actions(ref);

		ActionObject.dragAndDropBy(drag, 100, 0).perform();

	}

}
