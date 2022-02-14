package pagefactorypages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.Constants;

public class InputsPage extends BasePage {
    @FindBy(xpath = "//input[@type='number']")
    private WebElement inputField;

    public InputsPage(WebDriver driver) {
        super(driver);
    }

    public void openInputPage() {
        driver.get(Constants.HEROKU_APP_INPUTS_URL);
    }

    public void inputClick() {
        inputField.click();
    }

    public void inputSendArrowUpKeys() {
        inputField.sendKeys(Keys.ARROW_UP);
    }

    public void inputSendArrowDownKeys() {
        inputField.sendKeys(Keys.ARROW_DOWN);
    }

    public String inputGetValue() {
        return inputField.getAttribute("value");
    }

}
