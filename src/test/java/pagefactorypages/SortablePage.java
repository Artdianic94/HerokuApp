package pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.Constants;

public class SortablePage extends BasePage {
    @FindBy(xpath = "//table[@id='table1']//td[text()='fbach@yahoo.com']/parent::tr/td[1]")
    private WebElement lNameOnPageInFirstTable;
    @FindBy(xpath = "//table[@id='table1']//td[text()='fbach@yahoo.com']/parent::tr/td[2]")
    private WebElement fNameOnPageInFirstTable;
    @FindBy(xpath = "//table[@id='table2']//td[text()='fbach@yahoo.com']/parent::tr/td[4]")
    private WebElement dueOnPageInSecondTable;
    @FindBy(xpath = "//table[@id='table2']//td[text()='fbach@yahoo.com']/parent::tr/td[5]")
    private WebElement webSiteOnPageInSecondTable;

    public SortablePage(WebDriver driver) {
        super(driver);
    }

    public void openSortablePage() {
        driver.get(Constants.SORTABLE_DATA_TABLES);
    }

    public String getLNameOnPage() {
        return lNameOnPageInFirstTable.getText();
    }

    public String getFNameOnPage() {
        return fNameOnPageInFirstTable.getText();
    }

    public String getDueOnPage() {
        return dueOnPageInSecondTable.getText();
    }

    public String getWebSiteOnPage() {
        return webSiteOnPageInSecondTable.getText();
    }
}
