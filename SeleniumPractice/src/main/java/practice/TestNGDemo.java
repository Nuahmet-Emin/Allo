package practice;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;


public class TestNGDemo {

    public void beforeSuite(){
        System.out.println("Before suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }

    @BeforeMethod
    public void setup(){
        System.out.println("Before method");
    }

    @Test
    public void test(){
        String word = "java";
        String word2 = "java";
        System.out.println("Test1");
        Assert.assertEquals(word,word2);
    }

    @Test(priority = 1)
    public void test2() {
        String word = "javascript";
        String word2 = "javascript";
        System.out.println("Test1");
        Assert.assertEquals(word, word2);
    }

    @Test
    public void test3() {
        Assert.assertTrue( 5 < 10);
    }

    @AfterMethod
    public void teardown(){
        System.out.println("After method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After test");
        throw new SkipException("Skip");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite");
    }

}
