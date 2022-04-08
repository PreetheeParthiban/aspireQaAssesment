package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {
    public void onStart(ITestContext instance) {
        System.out.println("Execution starts" + instance.getName());

    }


    public void onFinish(ITestContext instance) {
        System.out.println("Execution ends" + instance.getName());
    }


    public void onTestFailure(ITestResult result) {
        System.out.println("On test failure" + result.getName());

    }


    public void onTestSuccess(ITestResult result) {
        System.out.println("On test success" + result.getName());
    }


    public void onTestSkipped(ITestResult result) {
        System.out.println("When test skipped" + result.getName());

    }


    public void onTestStart(ITestResult result) {
        System.out.println("On test start" + result.getName());
    }
}
