package practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {

    @Test
    public void test(){
        Assert.assertEquals("apple","orange");
    }

    @Test
    public void softAssertion(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("apple","pear");
        softAssert.assertEquals("apple","apple");
        softAssert.assertNotEquals("apple","apple");

        softAssert.assertAll("End of test execution");
    }
}
