package selenium;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import net.bytebuddy.asm.Advice.Argument;

public class WindoHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://vctcpune.com/selenium/practice.html");
		ref.manage().window().maximize();
		WebElement tab = ref.findElement(By.id("opentab"));

		JavascriptExecutor je = (JavascriptExecutor) ref;
		je.executeScript("arguments[0].scrollIntoView();", tab);

		String PrentTab = ref.getWindowHandle();
		System.out.println(PrentTab);
		tab.click();

		Set<String> SubTab = ref.getWindowHandles();
		System.out.println(SubTab);
		for (String id : SubTab) {

			if (!id.equals(PrentTab)) {

				ref.switchTo().window(id);
				String Tital = ref.getTitle();
				System.out.println(Tital);
			}
		}
		ref.switchTo().window(PrentTab);
		String PraentTital = ref.getTitle();
		System.out.println(PraentTital);
		ref.quit();

	}
}
