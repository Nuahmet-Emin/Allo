package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    @Test(description = "Verify page title",dataProvider = "testData")
    public void test1(String url, String title){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        Assert.assertTrue(driver.getTitle().contains(title));
        driver.quit();

    }

    @DataProvider(name = "testData")
    public Object[][] testData(){
        return new Object[][]{{"https://google.com","Google"},
                            {"https://amazon.com",  "Amazon"},
                            {"https://etsy.com",    "Etsy"},
                            {"https://ebay.com",    "Ebay"},

        };
    }
}
