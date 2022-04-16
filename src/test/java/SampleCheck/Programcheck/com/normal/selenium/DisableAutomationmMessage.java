package SampleCheck.Programcheck.com.normal.selenium;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisableAutomationmMessage {
	
	
	public void disableMessage() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://file-examples.com");
		
		
	}

	public static void main(String[] args) {
		DisableAutomationmMessage obj = new DisableAutomationmMessage();
		obj.disableMessage();
		
	}

}
