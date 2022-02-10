package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import staticdata.Constants;

public class InputsTest extends BaseTest {
    @BeforeMethod
    public void herokuInputs() {
        driver.get(Constants.HEROKU_APP_INPUTS_URL);
    }

    @Test
    public void inputKeysUp() {
        driver.findElement(By.xpath("//input[@type='number']")).click();
        int numberOfClicks = 5;
        for (int i = 0; i < numberOfClicks; i++) {
            driver.findElement(By.xpath("//input[@type='number']")).sendKeys(Keys.ARROW_UP);
        }
        String numberOnPage = driver.findElement(By.xpath("//input[@type='number']")).getAttribute("value");
        Assert.assertEquals(numberOnPage, String.valueOf(numberOfClicks), "Keys(arrow-up) doesn't work correctly");
    }

    @Test
    public void inputKeysDown() {
        driver.findElement(By.xpath("//input[@type='number']")).click();
        int numberOfClicks = 4;
        for (int i = 0; i < numberOfClicks; i++) {
            driver.findElement(By.xpath("//input[@type='number']")).sendKeys(Keys.ARROW_DOWN);
        }
        String numberOnPage = driver.findElement(By.xpath("//input[@type='number']")).getAttribute("value");
        Assert.assertEquals(numberOnPage, String.valueOf(numberOfClicks * (-1)), "Keys(arrow-down) doesn't work correctly");
    }
}
