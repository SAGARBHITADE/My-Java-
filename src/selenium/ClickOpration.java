package selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickOpration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://demoqa.com/buttons");
		ref.manage().window().maximize();

		WebElement RightClick = ref.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
		Actions rc = new Actions(ref);
		rc.contextClick(RightClick).perform();
		WebElement texte = ref.findElement(By.xpath("//*[@id=\"rightClickMessage\"]"));

		String t = texte.getText();
		if(t.equals("You have done a right click")) {
			
			System.out.println("Test Case Pass ");
			
		}
		else {
			System.out.println("Test Case Not pass");
		}
		
		System.out.println(t);
	}

}
