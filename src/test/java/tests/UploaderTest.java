package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypages.FileUploaderPage;
import staticdata.Constants;

public class UploaderTest extends BaseTest {
    FileUploaderPage fileUploaderPage;

    @Test
    public void fileUploaderTest() {
        fileUploaderPage = new FileUploaderPage(driver);
        fileUploaderPage.openUploaderPage();
        fileUploaderPage.selectFile(Constants.TEST_FILE);
        fileUploaderPage.uploadFile();
        String actualFileName = fileUploaderPage.getFileNameFromPage().replace(".docx", "");
        Assert.assertEquals(actualFileName, "For UploadTest", "Names are not equal");
    }
}
