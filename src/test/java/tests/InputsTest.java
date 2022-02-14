package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pagefactorypages.InputsPage;

public class InputsTest extends BaseTest {
    InputsPage inputsPage;

    @BeforeMethod
    public void herokuInputs() {
        inputsPage = new InputsPage(driver);
        inputsPage.openInputPage();
    }

    @Test
    public void inputKeysUp() {
        inputsPage.inputClick();
        int numberOfClicks = 5;
        for (int i = 0; i < numberOfClicks; i++) {
            inputsPage.inputSendArrowUpKeys();
        }
        String numberOnPage = inputsPage.inputGetValue();
        Assert.assertEquals(numberOnPage, String.valueOf(numberOfClicks), "Keys(arrow-up) doesn't work correctly");
    }

    @Test
    public void inputKeysDown() {
        inputsPage.inputClick();
        int numberOfClicks = 4;
        for (int i = 0; i < numberOfClicks; i++) {
            inputsPage.inputSendArrowDownKeys();
        }
        String numberOnPage = inputsPage.inputGetValue();
        Assert.assertEquals(numberOnPage, String.valueOf(numberOfClicks * (-1)), "Keys(arrow-down) doesn't work correctly");
    }
}
