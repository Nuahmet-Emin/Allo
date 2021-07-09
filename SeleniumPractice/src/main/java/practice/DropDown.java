package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDown {
    static WebDriver driver= BrowserFactory.getDriver("chrome");
    public static void main(String[] args) throws Exception {

        //selectByTextTest();
        //selectByValueTest();
        //selectByIndex();
        //multiSelectDropDown();
        nonSelectDropDown();
    }

    public static void setup(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS)  ;
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    public static void selectByTextTest() throws InterruptedException {
        setup();
        Select  select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 1");
        Thread.sleep(2000);
        driver.close();
    }

    public static void selectByValueTest() throws Exception{
        setup();
        Select stateSelect = new Select(driver.findElement(By.id("state")));
        stateSelect.selectByValue("CA");
        Thread.sleep(2000);
        driver.close();
    }

    public static void selectByIndex() throws Exception{
        setup();
        Select stateSelect = new Select(driver.findElement(By.id("state")));
        stateSelect.selectByIndex(1);
        Thread.sleep(2000);

        String expectedValue = "AL" ;
        String actualValue = stateSelect.getFirstSelectedOption().getAttribute("value");
        System.out.println(expectedValue.equals(actualValue));

        String expected = "Alabama";
        String actual = stateSelect.getFirstSelectedOption().getText();
        driver.close();
    }

    public static void multiSelectDropDown() throws Exception{
         setup();
         Thread.sleep(2000);

         Select select = new Select(driver.findElement(By.name("Languages")));
        List<WebElement> options = select.getOptions();

        for (WebElement option : options) {
            Thread.sleep(1000);
            //option.click(); works too
            select.selectByVisibleText(option.getText())    ;
        }

        Thread.sleep(1000);

        List<WebElement> selectedOptions = select.getAllSelectedOptions();

        for (WebElement selectedOption : selectedOptions) {
            System.out.println(selectedOption.getText());
        }

        select.deselectAll();
        Thread.sleep(1000);

        driver.close();
    }

    public static void nonSelectDropDown() throws InterruptedException {
        setup();

        WebElement dropdown = driver.findElement(By.id("dropdownMenuLink"));
        WebElement option = driver.findElement(By.xpath("//a[text()='Google']"));
        dropdown.click();
        Thread.sleep(1000);
        option.click();
        Thread.sleep(1000);
        driver.close();
    }
}
