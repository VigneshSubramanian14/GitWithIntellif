package SampleCheck.Programcheck.listofwebelements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ListOfWebElementMethod {
    WebDriver driver;

    public void driverSetup(){
        WebDriverManager.chromedriver().setup();
        driver  = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
    }

    public List<WebElement> webElementSendKeys(){
        List<WebElement> value = driver.findElements(By.xpath("//input[@name='name']"));
        value.get(0).sendKeys("Vignesh");
        value.get(1).sendKeys("Bala");
        return value;
    }

    public static void main(String[] args) {

        ListOfWebElementMethod obj = new ListOfWebElementMethod();
        obj.driverSetup();
        List<WebElement> value = obj.webElementSendKeys();
    }
}
