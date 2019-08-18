package HurtMePlentyTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Helpers {

    public static void waitUntilLocated(String locator, WebDriver driver) {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.cssSelector(locator)));
    }

    public static void waitTillIframeIsVisible(WebDriver driver) {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }
}
