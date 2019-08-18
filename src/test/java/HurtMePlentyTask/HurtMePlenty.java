package HurtMePlentyTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class HurtMePlenty extends Helpers{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://cloud.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@href='https://cloud.google.com/products/' and @track-name='products']")).click();
        driver.findElement(By.xpath("//a[@track-metadata-eventdetail='seeAllProducts']")).click();
        Helpers.waitUntilLocated(".cloud-button__set .cloud-button--secondary", driver);
        driver.findElement(By.xpath("//a[@href='https://cloud.google.com/pricing/' and @track-name='seePricing']")).click();
        Helpers.waitUntilLocated(".cloud-jump-menu__links>ul :nth-child(3)", driver);
        driver.findElement(By.xpath("//a[@href='https://cloud.google.com/pricing/calculators']")).click();
       // Helpers.waitTillIframeIsVisible(driver);
        Thread.sleep(3000);
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@id='input_52']")).click();
                driver.findElement(By.xpath("//input[@id='input_52']")).sendKeys("4");
        driver.findElement(By.xpath("//md-select[@id='select_75']")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#select_option_216")).click();

        driver.findElement(By.cssSelector("md-input-container > [aria-label='Add GPUs']")).click();
        Thread.sleep(5000);
      //  driver.findElement()
        driver.findElement(By.cssSelector("#select_option_361")).click();
    }
}