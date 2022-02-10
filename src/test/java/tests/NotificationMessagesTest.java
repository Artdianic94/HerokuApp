package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import staticdata.Constants;

public class NotificationMessagesTest extends BaseTest {
    @BeforeMethod
    public void herokuMessages() {
        driver.get(Constants.HEROKU_APP_NOTIFICATION_MESSAGES_URL);
    }

    @Test
    public void notificationMessageTest() {
        driver.findElement(By.xpath("//a[text() = 'Click here']")).click();
        String actualAlertMessage = driver.findElement(By.id("flash")).getText().replaceAll("\n", " ");
        String expectedAlertMessage = "Action successful ×";
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage, "Messages are not equal");
    }

    @Test
    public void notificationTwoMessageTest() {
        driver.findElement(By.xpath("//a[text() = 'Click here']")).click();
        String actualAlertMessage = driver.findElement(By.id("flash")).getText().replaceAll("\n", " ");
        System.out.println(actualAlertMessage);
        String expectedAlertMessage = "Action unsuccessful, please try again ×";
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage, "Messages are equal");
    }

}
