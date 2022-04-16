package SampleCheck.Programcheck.multipleWindowSwitch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SwitchingBetweenWindow {
    static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
        driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
        driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
        driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
        Set<String> window = driver.getWindowHandles();
        List<String> hList = new ArrayList<>(window);
        switchToWindow("Twitter", hList);

    }

    public static boolean switchToWindow(String windowTitle, List<String> hList) {
        for (String e : hList) {
            String title = driver.switchTo().window(e).getTitle();
            if (title.contains(windowTitle)) {
                System.out.println("Navigated to Correct window");
                return true;
            }
        }
        return false;
    }
}
