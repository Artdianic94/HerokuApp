package pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.Constants;

public class TyposPage extends BasePage {
    @FindBy(xpath = "//div[@class='example']")
    private WebElement textOnPage;

    public TyposPage(WebDriver driver) {
        super(driver);
    }

    public void openTyposPage() {
        driver.get(Constants.HEROKU_APP_TYPOS_URL);
    }

    public String getTextFromPage() {
        return textOnPage.getText().replaceAll("\n", " ");
    }
}
