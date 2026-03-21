package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import base.BaseClass;
import utils.ExtentManager;
import utils.ScreenshotUtil;

public class TestListener implements ITestListener {

    ExtentReports extent = ExtentManager.getReport();
    ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {

        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        test.get().pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.get().fail(result.getThrowable());

        try {

            String path = ScreenshotUtil.capture(
                    BaseClass.driver,
                    result.getMethod().getMethodName()
            );

            if (path != null) {

                test.get().addScreenCaptureFromPath(path);
            }

        } catch (Exception e) {

            System.out.println("Unable to attach screenshot");
        }
    }

    @Override
    public void onFinish(ITestContext context) {

        extent.flush();
    }
}