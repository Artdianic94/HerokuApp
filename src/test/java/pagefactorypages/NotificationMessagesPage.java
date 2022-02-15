package pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.Constants;

public class NotificationMessagesPage extends BasePage {
    @FindBy(xpath = "//a[text() = 'Click here']")
    private WebElement linkToNewMessage;

    @FindBy(id = "flash")
    private WebElement messageText;

    public NotificationMessagesPage(WebDriver driver) {
        super(driver);
    }

    public void openNotificationMessagesPage() {
        driver.get(Constants.HEROKU_APP_NOTIFICATION_MESSAGES_URL);
    }

    public void clickToNewMessage() {
        linkToNewMessage.click();
    }

    public String messageGetText() {
        return messageText.getText().replaceAll("\n", " ");
    }
}
