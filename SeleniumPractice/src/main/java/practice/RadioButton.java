package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButton {
    public static void main(String[] args)  throws Exception{
        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
           Thread.sleep(2000);
//        driver.findElement(By.xpath("//label[.=\"Yellow\"]/preceding-sibling::input")).click();

//
//        System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Green')]/preceding-sibling::input")).isEnabled());
//        driver.findElement(By.xpath("//label[contains(text(),'Green')]/preceding-sibling::input")).click();

        List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[type='radio']"));
        for (WebElement radioButton : radioButtons) {

            System.out.println(radioButton.getAttribute("name")+ "-" + radioButton.isEnabled());
        }
        Thread.sleep(2000);

        driver.close();

    }
}
