package reports;

import org.testng.*;
import org.testng.xml.XmlSuite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class CustomReporter implements ITestListener, IReporter {
    private List<ITestNGMethod> passedTests = new ArrayList<ITestNGMethod>();
    private List<ITestNGMethod> failedTests = new ArrayList<ITestNGMethod>();
    private List<ITestNGMethod> skippedTests = new ArrayList<ITestNGMethod>();


    @Override
    public void onTestSuccess(ITestResult result) {
        passedTests.add(result.getMethod());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        failedTests.add(result.getMethod());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        skippedTests.add(result.getMethod());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

    @Override
    public void generateReport(List<XmlSuite> list, List<ISuite> list1, String s) {

        for (ISuite suite : list1) {

            Map<String, ISuiteResult> suiteResults = suite.getResults();
            PrintWriter passedTestWriter = null;
            PrintWriter failedTestWriter = null;
            PrintWriter skippedTestWriter = null;
            PrintWriter emailTestReportWriter = null;


            String passedTestFilePath = "src/main/java/reports/ReportPages/passed-tests.html";
            String failedTestFilePath = "src/main/java/reports/ReportPages/failed-tests.html";
            String skippedTestFilePath = "src/main/java/reports/ReportPages/skipped-tests.html";
            String emailTestReportFilePath = "src/main/java/reports/ReportPages/email-report.html";


            try {
                passedTestWriter = new PrintWriter(new File(passedTestFilePath));
                passedTestWriter.write(HtmlUtil.startHtmlPassedTest);
                failedTestWriter = new PrintWriter(new File(failedTestFilePath));
                failedTestWriter.write(HtmlUtil.startHtmlFailedTest);
                skippedTestWriter = new PrintWriter(new File(skippedTestFilePath));
                skippedTestWriter.write(HtmlUtil.startHtmlSkippedTest);
                emailTestReportWriter = new PrintWriter(new File(emailTestReportFilePath));
                emailTestReportWriter.write(HtmlUtil.startHtmlEmailReportTest);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            emailTestReportWriter.write(HtmlUtil.startHtmlEmailPassedTest);

            for (ISuiteResult sr : suiteResults.values()) {
                ITestContext tc = sr.getTestContext();
                for (ITestResult iTestResult : tc.getPassedTests().getAllResults()) {
                    Object[] object = iTestResult.getParameters();
                    long time = iTestResult.getEndMillis() - iTestResult.getStartMillis();
                    String timeFormed = time + "ms";
                    if (passedTestWriter != null) {
                        passedTestWriter.write("<tr><td>" + object[1] + "</td> <td>" + iTestResult.getMethod().getMethodName() + "</td> <td>" + timeFormed + "</td></tr>");
                    }
                    emailTestReportWriter.write("<tr><td>" + object[1] + "</td> <td>" + iTestResult.getMethod().getMethodName() + "</td> <td>" + timeFormed + "</td></tr>");
                }
                emailTestReportWriter.write(HtmlUtil.endHtmlEmailPassedTest);
                emailTestReportWriter.write(HtmlUtil.startHtmlEmailFailedTest);

                for (ITestResult iTestResult : tc.getFailedTests().getAllResults()) {
                    Object[] object = iTestResult.getParameters();
                    long time = iTestResult.getEndMillis() - iTestResult.getStartMillis();
                    String timeFormed = time + "ms";
                    assert failedTestWriter != null;
                    failedTestWriter.write("<tr><td>" + object[1] + "</td> <td>" + iTestResult.getMethod().getMethodName() + "</td><td>" + iTestResult.getThrowable().getMessage() + "</td> <td>" + timeFormed + "</td></tr>");
                    emailTestReportWriter.write("<tr><td>" + object[1] + "</td> <td>" + iTestResult.getMethod().getMethodName() + "</td><td>" + iTestResult.getThrowable().getMessage() + "</td> <td>" + timeFormed + "</td></tr>");
                }
                emailTestReportWriter.write(HtmlUtil.endHtmlEmailFailedTest);
                emailTestReportWriter.write(HtmlUtil.startHtmlEmailSkippedTest);

                for (ITestResult iTestResult : tc.getSkippedTests().getAllResults()) {
                    Object[] object = iTestResult.getParameters();
                    long time = iTestResult.getEndMillis() - iTestResult.getStartMillis();
                    String timeFormed = time + "ms";
                    if (skippedTestWriter != null) {
                        skippedTestWriter.write("<tr><td>" + object[1] + "</td> <td>" + iTestResult.getMethod().getMethodName() + "</td> <td>" + timeFormed + "</td></tr>");
                        emailTestReportWriter.write("<tr><td>" + object[1] + "</td> <td>" + iTestResult.getMethod().getMethodName() + "</td> <td>" + timeFormed + "</td></tr>");
                    }
                }
                emailTestReportWriter.write(HtmlUtil.endHtmlEmailSkippedTest);

            }
            emailTestReportWriter.write(HtmlUtil.endHtmlEmailReportTest);
            if (passedTestWriter != null) {
                passedTestWriter.write(HtmlUtil.endHtml);
            }
            if (failedTestWriter != null) {
                failedTestWriter.write(HtmlUtil.endHtml);
            }
            if (skippedTestWriter != null) {
                skippedTestWriter.write(HtmlUtil.endHtml);
            }

            if (emailTestReportWriter != null) {
                emailTestReportWriter.close();
            }
            if (passedTestWriter != null) {
                passedTestWriter.close();
            }
            if (failedTestWriter != null) {
                failedTestWriter.close();
            }
            if (skippedTestWriter != null) {
                skippedTestWriter.close();
            }

        }
    }
}
