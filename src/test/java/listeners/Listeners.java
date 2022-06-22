package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import extentreport.ExtentReportNG;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import base.Base;

import java.io.IOException;

public class Listeners implements ITestListener {

    ExtentReports extent = ExtentReportNG.getReportObject("Ruan Araújo");
    private final Base base = new Base();
    private ExtentTest test;
    public static Logger log = LogManager.getLogger(Listeners.class.getName());
    private ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult iTestResult) {
        test = extent.createTest(iTestResult.getMethod().getMethodName());
        extentTest.set(test);
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        extentTest.get().log(Status.PASS, "Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

        extentTest.get().fail(iTestResult.getThrowable());
        //Screenshot
        String testMethodName = iTestResult.getMethod().getMethodName();

        try {
            extentTest.get()
                    .addScreenCaptureFromPath(base.getScreenShotPath(testMethodName),
                            iTestResult.getMethod().getMethodName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        log.error(iTestResult.getMethod().getMethodName() + " Teste falhou");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        log.error(iTestResult.getMethod().getMethodName() + " Teste pulou");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        log.error(iTestResult.getMethod().getMethodName() + " Teste rodou parcialmente");
    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        extent.flush();
    }
}
