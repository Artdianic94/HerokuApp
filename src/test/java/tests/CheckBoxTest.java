package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pagefactorypages.CheckBoxPage;

public class CheckBoxTest extends BaseTest {
    CheckBoxPage checkBoxPage;

    @BeforeMethod
    public void herokuCheckbox() {
        checkBoxPage = new CheckBoxPage(driver);
        checkBoxPage.openCheckboxPage();
    }

    @Test
    public void firstUncheckedTest() {
        boolean checkboxSelected = checkBoxPage.firstCheckboxIsSelected();
        Assert.assertFalse(checkboxSelected, "First checkbox is checked");
    }

    @Test
    public void firstCheckedTest() {
        checkBoxPage.firstCheckboxClick();
        boolean checkboxSelected = checkBoxPage.firstCheckboxIsSelected();
        Assert.assertTrue(checkboxSelected, "First checkbox is unchecked");
    }

    @Test
    public void secondCheckedTest() {
        boolean checkboxSelected = checkBoxPage.firstCheckboxIsSelected();
        Assert.assertTrue(checkboxSelected, "Second checkbox is unchecked");
    }

    @Test
    public void secondUncheckedTest() {
        checkBoxPage.firstCheckboxClick();
        checkBoxPage.secondCheckboxClick();
        boolean checkboxSelected = checkBoxPage.secondCheckboxIsSelected();
        Assert.assertFalse(checkboxSelected, "Second checkbox is checked");
    }
}
