package SampleCheck.Programcheck.com.normal.selenium;

import java.io.File;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {
	static WebDriver driver;

	public void driverInitialization() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://file-examples.com/");
	}

	public static void takeScreenshotFunction(String filename) throws Exception {
		TakesScreenshot obj = (TakesScreenshot) driver;
		File value = obj.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(value, new File("./src/test/resources/Screenshot/" + filename + ""));
	}
	
	public static void screenshot() throws Exception {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./src/test/resources/Screenshot/Screenshot1.png"));
	}

	public static void main(String[] args) throws Exception {
		
		TakeScreenshot value = new TakeScreenshot();
		value.driverInitialization();
		takeScreenshotFunction("FileName.png");
		screenshot();
	}
}
