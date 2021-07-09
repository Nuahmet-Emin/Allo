package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsPracticeXPath {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");

        WebElement dropDownLink = driver.findElement(By.xpath("//a[text()='Drag and Drop']"));
        System.out.println(dropDownLink.getText());

        Thread.sleep(2000);



        WebElement headerText =driver.findElement(By.xpath("//span[@class='h1y']"));
        System.out.println(headerText.getText());

        driver.close();


    }
}
