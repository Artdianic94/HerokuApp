package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import staticdata.Constants;

public class TyposTest extends BaseTest {
    @BeforeMethod
    public void herokuTypos() {
        driver.get(Constants.HEROKU_APP_TYPOS_URL);
    }

    @Test
    public void typosTest() {
        String actualTextOnPage = driver.findElement(By.xpath("//div[@class='example']")).getText().replaceAll("\n"," ");
        String expectedTextOnPage = "Typos This example demonstrates a typo being introduced. It does it randomly on each page load. Sometimes you'll see a typo, other times you won't.";
        Assert.assertEquals(actualTextOnPage,expectedTextOnPage,"There is an error in the actual text on the page");
    }
}