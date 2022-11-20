package selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionCassMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"J:\\\\VELOCITY CLASS\\\\SELENIUM AUTO\\\\Chrome\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://demoqa.com/menu/#");
		ref.manage().window().maximize();

		WebElement mc = ref.findElement(By.linkText("Main Item"));
		Actions ac=new Actions(ref);
		ac.moveToElement(mc);
		ref.findElement(By.xpath(null));
		
//		WebElement Frame = ref.findElement(By.className("demo-frame"));
//		ref.switchTo().frame(Frame);
//
//		WebElement drag = ref.findElement(By.xpath("//*[@id=\"slider\"]//span[@tabindex=\"0\"]"));
//
//		Actions ac = new Actions(ref);
//		ac.clickAndHold(drag).moveByOffset(150, 0).release().perform();
//		Thread.sleep(5000);
//		ac.clickAndHold(drag).moveByOffset(-150, 0).release().perform();
//		Actions as = new Actions(ref);
//		WebElement DubalClick = ref.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
//		as.doubleClick(DubalClick).perform();
//
//		WebElement rightClick = ref.findElement(By.id("rightClickBtn"));
//		as.contextClick(rightClick).perform();

//		WebElement frame = ref.findElement(By.xpath("//*[@class=\"demo-frame\"]"));
//		ref.switchTo().frame(frame);
//
//		WebElement drg = ref.findElement(By.id("draggable"));
//		WebElement drop2=ref.findElement(By.id("droppable"));
//		Actions ac=new Actions(ref);
//		ac.dragAndDrop(drg,drop2).build().perform();

	}

}
