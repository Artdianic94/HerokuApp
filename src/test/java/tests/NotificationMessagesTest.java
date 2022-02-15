package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pagefactorypages.NotificationMessagesPage;

public class NotificationMessagesTest extends BaseTest {
    NotificationMessagesPage notificationMessagesPage;

    @BeforeMethod
    public void herokuMessages() {
        notificationMessagesPage = new NotificationMessagesPage(driver);
        notificationMessagesPage.openNotificationMessagesPage();
    }

    @Test
    public void notificationMessageTest() {
        notificationMessagesPage.clickToNewMessage();
        String actualAlertMessage = notificationMessagesPage.messageGetText();
        String expectedAlertMessage = "Action successful ×";
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage, "Messages are not equal");
    }

    @Test
    public void notificationTwoMessageTest() {
        driver.findElement(By.xpath("//a[text() = 'Click here']")).click();
        String actualAlertMessage = notificationMessagesPage.messageGetText();
        System.out.println(actualAlertMessage);
        String expectedAlertMessage = "Action unsuccessful, please try again ×";
        Assert.assertEquals(actualAlertMessage, expectedAlertMessage, "Messages are not equal");
    }

}
