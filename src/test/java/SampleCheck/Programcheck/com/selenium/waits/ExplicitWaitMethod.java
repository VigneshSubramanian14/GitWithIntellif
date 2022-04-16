package SampleCheck.Programcheck.com.selenium.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitMethod {
WebDriver driver;
	
	
	public void driverInitialization() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://phptravels.com/");
	}
	
	public void registerPage() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(""))));
	}
}
