package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import staticdata.Constants;

public class CheckBoxTest extends BaseTest {
    @BeforeMethod
    public void herokuCheckbox() {
        driver.get(Constants.HEROKU_APP_CHECKBOX_URL);
    }

    @Test
    public void firstUncheckedTest() {
        boolean checkboxSelected = driver.findElement(By.xpath("//text()[normalize-space()='checkbox 1']/preceding-sibling::input")).isSelected();
        Assert.assertFalse(checkboxSelected, "First checkbox is checked");
    }

    @Test
    public void firstCheckedTest() {
        driver.findElement(By.xpath("//text()[normalize-space()='checkbox 1']/preceding-sibling::input")).click();
        boolean checkboxSelected = driver.findElement(By.xpath("//text()[normalize-space()='checkbox 1']/preceding-sibling::input")).isSelected();
        Assert.assertTrue(checkboxSelected, "First checkbox is unchecked");
    }

    @Test
    public void secondCheckedTest() {
        boolean checkboxSelected = driver.findElement(By.xpath("//text()[normalize-space()='checkbox 1']/following-sibling::input")).isSelected();
        Assert.assertTrue(checkboxSelected, "Second checkbox is unchecked");
    }

    @Test
    public void secondUncheckedTest() {
        driver.findElement(By.xpath("//text()[normalize-space()='checkbox 1']/preceding-sibling::input")).click();
        driver.findElement(By.xpath("//text()[normalize-space()='checkbox 2']/preceding::br/following::input")).click();
        boolean checkboxSelected = driver.findElement(By.xpath("//text()[normalize-space()='checkbox 2']/preceding::br/following::input")).isSelected();
        Assert.assertFalse(checkboxSelected, "Second checkbox is checked");
    }
}
