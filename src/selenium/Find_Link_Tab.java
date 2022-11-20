package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Link_Tab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://opensource-demo.orangehrmlive.com/");
		ref.manage().window().maximize();
		
		List<WebElement> FindLink=ref.findElements(By.tagName("a"));
		System.out.println(FindLink);
		
		int no=FindLink.size();
		System.out.println(no);
			
		for(WebElement LinkText:FindLink) {
			String LText=LinkText.getText();
			
			if(LText.equals("Forgot your password?")) {
				
				//LinkText.click();
				System.out.println("Text Macth");
				
			}else {
				System.out.println("Text Not Macth");
			}
			
			//System.out.println(LText);
		}
		
		
		Thread.sleep(10000);
		
		ref.close();

	}

}
