package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.Constants;

import java.util.ArrayList;
import java.util.List;

public class SortableTest extends BaseTest{
    @Test
    public void nameAndLastNameTest (){
        driver.get(Constants.SORTABLE_DATA_TABLES);
        String lastNameOnPage = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']/parent::tr/td[1]")).getText();
        String firstNameOnPage = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']/parent::tr/td[2]")).getText();
        List<String> namesOnPage=new ArrayList<>();
        namesOnPage.add(0,lastNameOnPage);
        namesOnPage.add(1,firstNameOnPage);
        List<String> expectedNames=new ArrayList<>();
        expectedNames.add(0, "Bach");
        expectedNames.add(1,"Frank");
        Assert.assertEquals(namesOnPage,expectedNames,"Names are not equal");
    }
    @Test
    public void dueWebSiteTest (){
        driver.get(Constants.SORTABLE_DATA_TABLES);
        String dueOnPage = driver.findElement(By.xpath("//table[@id='table2']//td[text()='fbach@yahoo.com']/parent::tr/td[4]")).getText();
        String webSiteOnPage = driver.findElement(By.xpath("//table[@id='table2']//td[text()='fbach@yahoo.com']/parent::tr/td[5]")).getText();
        List<String> namesOnPage=new ArrayList<>();
        namesOnPage.add(0,dueOnPage);
        namesOnPage.add(1,webSiteOnPage);
        List<String> expectedDueAndWebSite=new ArrayList<>();
        expectedDueAndWebSite.add(0, "$51.00");
        expectedDueAndWebSite.add(1,"http://www.frank.com");
        Assert.assertEquals(namesOnPage,expectedDueAndWebSite,"Due and WebSite are not equal");
    }
}
