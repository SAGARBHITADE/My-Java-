package TestNg;

import org.testng.annotations.Test;

public class FirstTestNg {
	@Test (priority = 1)
	public void Login() {
		System.out.println("Log In Home Page");
	}
	@Test (priority = 2)
	public void HomePage() {
		System.out.println("Open Home Page ");

	}
	@Test(priority = 3)
	public void Recharge() {
		System.out.println("Recharge Page");
		
	}
}
