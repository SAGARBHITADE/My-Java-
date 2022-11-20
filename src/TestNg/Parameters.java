package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameters {

	WebDriver ref;
	@BeforeTest
	 private void init() {
		
		
		
		System.setProperty("webdriver.chrome.driver","J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		ref=new ChromeDriver();
		
		ref.get("https://www.facebook.com/login/");
		
		ref.manage().window().maximize();
		
		
		
	}
	
  @Test (dataProvider = "testData")
  public void Loginfacebook( String login,String password) {
	    
	  ref.findElement(By.id("email")).sendKeys(login);
	  ref.findElement(By.id("pass")).sendKeys(password);
	  ref.findElement(By.id("loginbutton")).click();
	  ref.navigate().back();
	  ref.findElement(By.id("email")).clear();
	  
  }
  @DataProvider(name = "testData")
  public  String [][] getdata(){
	  
	  String [][] data= {{"sagar@gmail.com","jhjh6"},{"Nik@gmail.com","asddd123"}};
	  
	  return data;
	  
  }


@AfterTest
public void close() {
 
	ref.close();

}	
}