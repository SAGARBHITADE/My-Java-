package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://demoqa.com/buttons");
		ref.manage().window().maximize();

		WebElement clickbutton = ref.findElement(By.xpath("//*[ text() = 'Click Me' ]"));
		Actions c = new Actions(ref);
		c.click(clickbutton).perform();
		Thread.sleep(2000);
		ref.close();
	}

}
