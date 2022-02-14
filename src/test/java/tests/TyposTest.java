package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pagefactorypages.TyposPage;

public class TyposTest extends BaseTest {
    TyposPage typosPage;

    @BeforeMethod
    public void herokuTypos() {
        typosPage = new TyposPage(driver);
        typosPage.openTyposPage();
    }

    @Test
    public void typosTest() {
        String actualTextOnPage = typosPage.getTextFromPage();
        String expectedTextOnPage = "Typos This example demonstrates a typo being introduced. It does it randomly on each page load. Sometimes you'll see a typo, other times you won't.";
        Assert.assertEquals(actualTextOnPage, expectedTextOnPage, "There is an error in the actual text on the page");
    }
}