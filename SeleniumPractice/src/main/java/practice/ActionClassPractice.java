package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ActionClassPractice {

     WebDriver driver =BrowserFactory.getDriver("chrome");;
    @Test
    public void dragAndDropTest() throws InterruptedException {

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement dropTarget = driver.findElement(By.cssSelector("div[id='droptarget']"));

        Thread.sleep(2000);
        Actions actions= new Actions(driver);
        actions.dragAndDrop(draggable,dropTarget).perform();

        Thread.sleep(2000);
        Assert.assertEquals(dropTarget.getText(),"You did great!");

        driver.close();
    }
    @Test
    public void hoverTest(){
        driver.get("http://practice.cybertekschool.com/hovers");
        driver.manage().window().maximize();

        Actions actions  = new Actions(driver);

        WebElement img = driver.findElement(By.xpath("(//img)[1]"));

        WebElement img1Text =driver.findElement(By.xpath("//*[.='name: user1']"));

        actions.moveToElement(img).perform();
        Assert.assertTrue(img1Text.isDisplayed());

        List<WebElement>images = driver.findElements(By.tagName("img"));

        for (WebElement image : images) {
            actions.moveToElement(image).pause(2000).perform();
        }

        driver.close();

    }
}
