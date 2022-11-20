package TestNg;

import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Fail");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped");
	}

}