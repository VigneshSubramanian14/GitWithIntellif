package SampleCheck.Programcheck.ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ExtentReporter1 {
    ExtentTest test;

    public void ExtentReportMethod() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ExtentReports report = new ExtentReports();
        String path = System.getProperty("user.dir");
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("/Users/balavigneshbalasubramanian/eclipse-workspace/SeleniumProject/target/Report1.html");
        report.attachReporter(sparkReporter);
        test = report.createTest("TC001-This is testCase");
        driver.get("https://www.hyrtutorials.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        test.log(Status.PASS, "WebPage is displayed successfully");
        report.flush();
        driver.quit();
    }

    public static void main(String[] args) {
        ExtentReporter1 obj = new ExtentReporter1();
        obj.ExtentReportMethod();
    }
}
