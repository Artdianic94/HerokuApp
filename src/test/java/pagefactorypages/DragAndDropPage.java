package pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import staticdata.Constants;

public class DragAndDropPage extends BasePage {
    @FindBy(xpath = "//div[@id='draggable']")
    private WebElement draggableElement;

    @FindBy(id = "//div[@id='droppable']")
    private WebElement droppableElement;

    @FindBy(xpath = "//iframe")
    private WebElement pathToFrame;

    @FindBy(xpath = "//div[@id='droppable']/p")
    private WebElement textFromFrame;

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    public void openDragAndDropPage() {
        driver.get(Constants.JQUERY_DRAG_AND_DROP);
    }

    public void moveElement() {
        Actions actions = new Actions(driver);
        actions.moveToElement(draggableElement)
                .clickAndHold(draggableElement)
                .moveToElement(droppableElement)
                .release()
                .build();
    }

    public void switchToFrame() {
        driver.switchTo().frame(pathToFrame);
    }

    public String getTextFromDroppableElement() {
        return textFromFrame.getText();
    }

    public void defaultContent() {
        driver.switchTo().defaultContent();
    }

}
