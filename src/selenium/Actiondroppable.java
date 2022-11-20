package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiondroppable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();

		ref.get("https://jqueryui.com/droppable/");
		ref.manage().window().maximize();

		WebElement fream = ref.findElement(By.xpath("//*[@class=\"demo-frame\"]"));
		ref.switchTo().frame(fream);

//		WebElement drag = ref.findElement(By.xpath("//*[@class=\"ui-widget-content ui-draggable ui-draggable-handle\"]"));
//		WebElement drop = ref.findElement(By.xpath("//*[@class=\"ui-widget-header ui-droppable\"]"));
		WebElement drag = ref.findElement(By.id("draggable"));
		WebElement drop = ref.findElement(By.id("droppable"));
		Actions objectAction = new Actions(ref);

		objectAction.dragAndDrop(drag, drop).perform();

		Thread.sleep(2000);

		ref.close();

	}

}
