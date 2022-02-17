package pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.Constants;

public class FileUploaderPage extends BasePage {
    @FindBy(id = "file-upload")
    private WebElement buttonSelectFile;

    @FindBy(id = "file-submit")
    private WebElement buttonUpload;

    @FindBy(id = "uploaded-files")
    private WebElement fileNameOnPage;

    public FileUploaderPage(WebDriver driver) {
        super(driver);
    }

    public void openUploaderPage() {
        driver.get(Constants.HEROKU_APP_UPLOADER);
    }

    public void selectFile(String fileFotTest) {
        buttonSelectFile.sendKeys(fileFotTest);
    }

    public void uploadFile() {
        buttonUpload.click();
    }

    public String getFileNameFromPage() {
        return fileNameOnPage.getText();
    }
}
