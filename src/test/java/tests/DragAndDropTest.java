package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypages.DragAndDropPage;

public class DragAndDropTest extends BaseTest {
    DragAndDropPage dragAndDropPage;

    @Test
    public void dragAndDropTest() {
        dragAndDropPage = new DragAndDropPage(driver);
        dragAndDropPage.openDragAndDropPage();
        dragAndDropPage.moveElement();
        dragAndDropPage.switchToFrame();
        String actualResult = dragAndDropPage.getTextFromDroppableElement();
        dragAndDropPage.defaultContent();
        Assert.assertEquals(actualResult, "Drop here", "Messages are not equal");
    }
}
