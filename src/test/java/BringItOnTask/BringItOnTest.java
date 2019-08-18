package BringItOnTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.Color.fromString;


public class BringItOnTest extends BringItOn{

        @Test
        public void testGetCorrectPageHeaderName() {
            Assert.assertEquals(driver.findElement(By.xpath("//div[@class='paste_box_line1']/h1")).getText(),"how to gain dominance among developers");
        }
     //Todo
        @Test
        public void testCorrectElementsHighlighted(){
            WebElement element = new WebDriverWait(driver, 4).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='kw2']")));
            Assert.assertEquals(fromString(element.getCssValue("color")).asHex(), "#c20cb9");
        }
        @Test
        public void testCorrectTextIsPresent(){
           Assert.assertEquals(driver.findElement(By.xpath("//textarea[@id='paste_code']")).getText(), "git config --global user.name  \"New Sheriff in Town\"\n" +
                   "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                   "git push origin master --force");
        }
    }

