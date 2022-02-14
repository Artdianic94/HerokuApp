package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypages.AddRemovePage;

import java.util.List;

public class AddRemoveTest extends BaseTest {
    AddRemovePage addRemovePage;

    @Test
    public void numberOfElementsTest() {
        addRemovePage = new AddRemovePage(driver);
        addRemovePage.openPage();
        addRemovePage.addNewElement();
        addRemovePage.addNewElement();
        List<WebElement> deleteElementsBeforeDelete = addRemovePage.countOfDeleteElements();
        int numberOfDeleteBeforeDelete = deleteElementsBeforeDelete.size();
        System.out.println(numberOfDeleteBeforeDelete);
        addRemovePage.deleteElement();
        List<WebElement> deleteElementsAfterDelete = addRemovePage.countOfDeleteElements();
        int numberOfDeleteAfterDelete = deleteElementsAfterDelete.size();
        System.out.println(numberOfDeleteAfterDelete);
        Assert.assertNotEquals(numberOfDeleteBeforeDelete, numberOfDeleteAfterDelete, "Something's wrong");
    }
}
