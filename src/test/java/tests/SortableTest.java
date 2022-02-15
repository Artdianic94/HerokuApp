package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypages.SortablePage;

import java.util.ArrayList;
import java.util.List;

public class SortableTest extends BaseTest {
    SortablePage sortablePage;

    @Test
    public void nameAndLastNameTest() {
        sortablePage = new SortablePage(driver);
        sortablePage.openSortablePage();
        String lastNameOnPage = sortablePage.getLNameOnPage();
        String firstNameOnPage = sortablePage.getFNameOnPage();
        List<String> namesOnPage = new ArrayList<>();
        namesOnPage.add(0, lastNameOnPage);
        namesOnPage.add(1, firstNameOnPage);
        List<String> expectedNames = new ArrayList<>();
        expectedNames.add(0, "Bach");
        expectedNames.add(1, "Frank");
        Assert.assertEquals(namesOnPage, expectedNames, "Names are not equal");
    }

    @Test
    public void dueWebSiteTest() {
        sortablePage = new SortablePage(driver);
        sortablePage.openSortablePage();
        String dueOnPage = sortablePage.getDueOnPage();
        String webSiteOnPage = sortablePage.getWebSiteOnPage();
        List<String> namesOnPage = new ArrayList<>();
        namesOnPage.add(0, dueOnPage);
        namesOnPage.add(1, webSiteOnPage);
        List<String> expectedDueAndWebSite = new ArrayList<>();
        expectedDueAndWebSite.add(0, "$51.00");
        expectedDueAndWebSite.add(1, "http://www.frank.com");
        Assert.assertEquals(namesOnPage, expectedDueAndWebSite, "Due and WebSite are not equal");
    }
}
