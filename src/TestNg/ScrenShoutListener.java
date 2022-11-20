package TestNg;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScrenShoutListener extends ScrenShot_TestFirst_Program implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Strat Test Case");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		
		ScrenShotpo sc=new ScrenShotpo();
		try {
			sc.methodSC(ref, name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped");
	}

	public static void main(String[] args) {

	}

}
