package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPage_Tital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		// System.out.println("sagar");
		ref.get("https://www.facebook.com/login/");

		String ActualTitle = ref.getTitle();

		System.out.println(ActualTitle);

		
		if (ActualTitle.equals("Log in to Facebook")) {
			System.out.println("Test case Pass");
		} else {
			System.out.println("Test Case Faild");
		}
		ref.close();
		
		ref.get("https://www.facebook.com/login/");
		String ActualUrl = ref.getCurrentUrl();
		System.out.println(ActualUrl);
		String MyUrl = "https://www.facebook.com/login/";
		
		if(ActualUrl.equals(MyUrl)) {
			System.out.println("URL Is Correct");
		}else {
			System.out.println("URL Is Not Correct");
		}
		
		ref.close();
			
	}

}
