package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OprationClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
 
		WebDriver ref = new ChromeDriver();
		ref.get("https://demoqa.com/buttons");

		ref.manage().window().maximize();

		WebElement Doubleclick = ref.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		
		Actions ac=new Actions(ref);
		
		ac.doubleClick(Doubleclick).perform();
		
		

	}

}
