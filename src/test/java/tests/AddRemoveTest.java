package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.Constants;

import java.util.List;

public class AddRemoveTest extends BaseTest {
    @Test
    public void numberOfElementsTest() {
        driver.get(Constants.HEROKU_APP_URL);
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        List<WebElement> deleteElementsBeforeDelete = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
        int numberOfDeleteBeforeDelete = deleteElementsBeforeDelete.size();
        System.out.println(numberOfDeleteBeforeDelete);
        driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).click();
        List<WebElement> deleteElementsAfterDelete = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
        int numberOfDeleteAfterDelete = deleteElementsAfterDelete.size();
        System.out.println(numberOfDeleteAfterDelete);
        Assert.assertNotEquals(numberOfDeleteBeforeDelete,numberOfDeleteAfterDelete,"Something's wrong");
    }
}
