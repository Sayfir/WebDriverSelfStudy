package ICanWinTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ICanWinTaskRunner{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://pastebin.com");
        driver.findElement(By.xpath("//textarea[@name='paste_code']")).sendKeys("Hello from WebDriver");
        Select expireDate = new Select(driver.findElement(By.xpath("//select[@name='paste_expire_date']")));
        expireDate.selectByVisibleText("10 Minutes");
        driver.findElement(By.name("paste_name")).sendKeys("helloweb");
        driver.findElement(By.id("submit")).click();
        driver.quit();
    }
}
