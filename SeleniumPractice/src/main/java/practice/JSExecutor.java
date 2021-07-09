package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSExecutor {
    private WebDriver driver;


    @Test
    public void scrollingTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        WebElement link = driver.findElement(By.linkText("Cybertek School"));
        JavascriptExecutor js =(JavascriptExecutor) driver;

        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView(true);"+
                "arguments[0].click()", link);
        Thread.sleep(2000);

        driver.close();
    }
}
