package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsPracticeCSS {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/registration_form");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Nurahmet");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Emin");
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("nurahmet");
        driver.findElement(By.cssSelector("input[placeholder='email@email.com']")).sendKeys("nemin@gmail.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("12394941");
        driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("510-861-7486");
        driver.findElement(By.cssSelector("input[value='male']")).click();
        driver.findElement(By.cssSelector("input[name='birthday']")).sendKeys("01/01/1989");



       Select select = new Select(driver.findElement(By.cssSelector("select[name='department']")));
       select.selectByVisibleText("Department of Engineering");

       Select jobTitleSelect = new Select(driver.findElement(By.cssSelector("select[name='job_title']")));
       jobTitleSelect.selectByVisibleText("SDET");

       driver.findElement(By.cssSelector("#inlineCheckbox2")).click();
       driver.findElement(By.cssSelector("#wooden_spoon")).click();

       Thread.sleep(3000);

        driver.close();


    }
}
