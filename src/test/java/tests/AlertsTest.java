package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypages.AlertsPage;

public class AlertsTest extends BaseTest {
    AlertsPage alertsPage;

    @Test
    public void alertJSAlertTest() {
        alertsPage = new AlertsPage(driver);
        alertsPage.openPage();
        alertsPage.clickOnButtonJSAlert();
        String actualText = alertsPage.getAlertText();
        alertsPage.acceptAlert();
        Assert.assertEquals(actualText, "I am a JS Alert", "Message isn't expected");
    }

    @Test
    public void alertJSConfirmTest() {
        alertsPage = new AlertsPage(driver);
        alertsPage.openPage();
        alertsPage.clickOnButtonJSConfirm();
        String actualText = alertsPage.getAlertText();
        alertsPage.dismissAlert();
        Assert.assertEquals(actualText, "I am a JS Confirm", "Message isn't expected");
    }

    @Test
    public void alertJSPromptTest() {
        alertsPage = new AlertsPage(driver);
        alertsPage.openPage();
        alertsPage.clickOnButtonJSPrompt();
        String expectedText = alertsPage.sendTextToPromptAlert("Hello World");
        alertsPage.closePromptAlert();
        String actualText = alertsPage.getTextFromPage().replace("You entered: ", "");
        Assert.assertEquals(actualText, expectedText, "Message isn't expected");
    }
}
