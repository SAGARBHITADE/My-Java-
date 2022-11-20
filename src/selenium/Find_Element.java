package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
//		 //ref.get("https://www.instagram.com/accounts/login/");
		ref.get("https://www.facebook.com/login/");
//		ref.manage().window().maximize();
//
//		//WebElement UserName = ref.findElement(By.name("email"));
//		ref.findElement(By.name("email")).sendKeys("sagarbhitade143@gmail.com");
//		//UserName.sendKeys("sagarbhitade143@gmail.com");
//		 ref.findElement(By.id("pass")).sendKeys("sagar@9696");
//		//UserPassword.sendKeys("Sagar@9696");
//		 ref.findElement(By.name("login")).click();
////		WebElement ClickButton = ref.findElement(By.name("login"));
////		ClickButton.click();
//		
//		Thread.sleep(1000);
//		ref.close();
		ref.get("https://www.instagram.com/accounts/login/");
		WebElement Username = ref.findElement(By.name("username"));
		WebElement Pass = ref.findElement(By.name("Password"));
//		ref.findElement(By.name("username")).sendKeys("8308189696");
//		ref.findElement(By.name("password")).sendKeys("Sagar@9696");
		
		ref.findElement(By.xpath("//div[text()='Log In']")).click();

	}

}
