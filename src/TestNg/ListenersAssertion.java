package TestNg;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersAssertion extends AssertionProgram implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test is Start ");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is Success ");
	}

	@Override
	public void onTestFailure(ITestResult result) {

		String name = result.getName();
		
		ScreenShotP sc=new ScreenShotP();
		try {
			sc.screenshotm(ref, name);
		} catch (IOException e1) {
			
		}
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is Skip ");
	}

}
