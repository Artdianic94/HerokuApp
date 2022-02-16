package pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.Constants;

public class AlertsPage extends BasePage {
    @FindBy(xpath = "//button[text() = 'Click for JS Alert']")
    private WebElement buttonForJSAlert;

    @FindBy(xpath = "//button[text()='Click for JS Confirm']")
    private WebElement buttonForJSConfirm;

    @FindBy(xpath = "//button[text()='Click for JS Prompt']")
    private WebElement buttonForJSPrompt;

    @FindBy(xpath = "//p[@id='result']")
    private WebElement textOnPage;

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(Constants.HEROKU_APP_ALERTS_URL);
    }

    public void clickOnButtonJSAlert() {
        buttonForJSAlert.click();
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void clickOnButtonJSConfirm() {
        buttonForJSConfirm.click();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public void clickOnButtonJSPrompt() {
        buttonForJSPrompt.click();
    }

    public String sendTextToPromptAlert(String textInInput) {
        driver.switchTo().alert().sendKeys(textInInput);
        return textInInput;
    }

    public String getTextFromPage() {
        return textOnPage.getText();
    }

    public void closePromptAlert() {
        driver.switchTo().alert().accept();
    }
}
