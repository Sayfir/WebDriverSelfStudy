package bringitontest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BringItOn {
    WebDriver driver = new ChromeDriver();

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        driver.get("https://pastebin.com");
        driver.findElement(By.xpath("//textarea[@name='paste_code']")).sendKeys("git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force");
        Select syntaxHighlighting = new Select((driver.findElement(By.xpath("//select[@name='paste_format']"))));
        syntaxHighlighting.selectByVisibleText("Bash");
        Select expireDate = new Select((driver.findElement(By.xpath("//select[@name='paste_expire_date']"))));
        expireDate.selectByVisibleText("10 Minutes");
        driver.findElement(By.name("paste_name")).sendKeys("how to gain dominance among developers");
        driver.findElement(By.id("submit")).click();
    }
    @AfterClass(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }

}