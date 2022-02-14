package pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.Constants;

public class CheckBoxPage extends BasePage {
    @FindBy(xpath = "//text()[normalize-space()='checkbox 1']/preceding-sibling::input")
    private WebElement checkBoxFirst;

    @FindBy(xpath = "//text()[normalize-space()='checkbox 2']/preceding::br/following::input")
    private WebElement checkBoxSecond;

    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    public void openCheckboxPage() {
        driver.get(Constants.HEROKU_APP_CHECKBOX_URL);
    }

    public boolean firstCheckboxIsSelected() {
        return checkBoxFirst.isSelected();
    }

    public boolean secondCheckboxIsSelected() {
        return checkBoxSecond.isSelected();
    }

    public void firstCheckboxClick() {
        checkBoxFirst.click();
    }

    public void secondCheckboxClick() {
        checkBoxSecond.click();
    }
}
