package sample;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	public void onFinish(ITestContext arg0) {
		System.out.println("finnished");

	}

	public void onStart(ITestContext arg0) {
		System.out.println("Just started");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

	}

	public void onTestFailure(ITestResult arg0) {

	}

	public void onTestSkipped(ITestResult arg0) {

	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("Test started");

	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Test suceess");

	}

}
