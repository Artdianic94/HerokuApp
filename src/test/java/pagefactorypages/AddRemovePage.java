package pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.Constants;

import java.util.List;

public class AddRemovePage extends BasePage {
    @FindBy(xpath = "//button[@onclick='addElement()']")
    private WebElement elementAdd;
    @FindBy(xpath = "//button[@onclick='deleteElement()']")
    private WebElement elementDelete;
    @FindBy(xpath = "//button[@onclick='deleteElement()']")
    private List<WebElement> listOfElementsDelete;

    public AddRemovePage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(Constants.HEROKU_APP_URL);
    }

    public void addNewElement() {
        elementAdd.click();
    }

    public void deleteElement() {
        elementDelete.click();
    }

    public List<WebElement> countOfDeleteElements() {
        return listOfElementsDelete;
    }
}
