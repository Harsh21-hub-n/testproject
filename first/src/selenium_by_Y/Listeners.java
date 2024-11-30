package selenium_by_Y;

import org.testng.ITestListener;
import org.testng.ITestResult;

// ITestlistener interface which implements TestNG listeners
/*
 * The Listeners interface in TestNG allows you to monitor and modify the behavior of your tests.
 * Listeners are useful for tracking the progress and results of test execution, customizing test workflows,
 * and generating custom reports or logs.
 */

public class Listeners implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
      //  System.out.println("Test Started: " + result.getName());
        System.out.println("start_me");
    }
	
	@Override
	public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
        
        System.out.println("passed_S");
    }
	
	@Override
	public void onTestFailure(ITestResult result) {
       // System.out.println("Test Failed: " + result.getName());
        
        System.out.println("failed _ with ");
        // Code to capture a screenshot on failure (example)
    }
	
}
