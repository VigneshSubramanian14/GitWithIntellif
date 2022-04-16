package SampleCheck.Programcheck.com.normal.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsInSelenium {

	// To locate an element using some identification properties we use locators.

	// ID,Name,ClassName,TagName,Xpath,CSS selector,Linktext and partial link text

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setAcceptInsecureCerts(true);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("disable-notifications");
		options.merge(cap);

		driver = new ChromeDriver(options);

		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		
		WebElement idValue =driver.findElement(By.id("firstName"));
		idValue.sendKeys("BalaVignesh");
		
		idValue.clear();
		
		WebElement nameValue = driver.findElement(By.name("lName"));
		nameValue.sendKeys("Vignesh");
		
		
		
		WebElement classNameValue = driver.findElement(By.className("bcTextBox"));
		classNameValue.sendKeys("Balavignesh");
		
//		WebElement linkValue = driver.findElement(By.linkText("Click here to navigate to the home page"));
//		linkValue.click();
		
		
		//To select all the checkboxes:
		
		List<WebElement> box = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		box.forEach(num->num.click());
		
		
		

}
	
}
