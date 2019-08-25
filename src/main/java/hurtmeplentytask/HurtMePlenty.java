package hurtmeplentytask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HurtMePlenty extends Helpers {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://cloud.google.com/");
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Helpers.clickOnFoundElementByXpath("//a[@href='https://cloud.google.com/products/' and @track-name='products']", driver);
        Helpers.clickOnFoundElementByXpath("//a[@track-metadata-eventdetail='seeAllProducts']", driver);
        Helpers.waitUntilClicable("//a[@href='https://cloud.google.com/pricing/' and @track-name='seePricing']", driver);
        Helpers.clickOnFoundElementByXpath("//a[@href='https://cloud.google.com/pricing/' and @track-name='seePricing']", driver);
        Helpers.waitUntilClicable("//a[@href='https://cloud.google.com/pricing/calculators']", driver);
        Helpers.clickOnFoundElementByXpath("//a[@href='https://cloud.google.com/pricing/calculators']", driver);
        Thread.sleep(5000);
        driver.switchTo().frame(0);
        Helpers.waitUntilClicable("//input[@id='input_52']", driver);
        Helpers.clickOnFoundElementByXpath("//input[@id='input_52']", driver);
        Helpers.typeTextInFoundTextFields("//input[@id='input_52']", driver, "4");
        Helpers.waitUntilClicable("//md-select[@id='select_75']", driver);
        Helpers.clickOnFoundElementByXpath("//md-select[@id='select_75']", driver);
        Helpers.waitUntilClicable("//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']", driver);
        Helpers.clickOnFoundElementByXpath("//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']", driver);
        Helpers.clickOnFoundElementByCss("md-input-container > [aria-label='Add GPUs']", driver);
        Helpers.clickOnFoundElementByXpath("//md-select[@placeholder='Number of GPUs']/md-select-value", driver);
        Helpers.clickOnFoundElementByXpath("//*[@class='md-select-menu-container md-active md-clickable']//md-option[@value='1']", driver);
        Helpers.waitUntilClicable("//md-select[@placeholder='GPU type']/md-select-value", driver);
        Helpers.clickOnFoundElementByXpath("//md-select[@placeholder='GPU type']/md-select-value", driver);
        Helpers.waitUntilClicable("//*[@value='NVIDIA_TESLA_V100']", driver);
        Helpers.clickOnFoundElementByXpath("//*[@value='NVIDIA_TESLA_V100']", driver);
        Helpers.waitUntilClicable("//md-select[@placeholder='Local SSD']/md-select-value", driver);
        Helpers.clickOnFoundElementByXpath("//md-select[@placeholder='Local SSD']/md-select-value", driver);
        Helpers.waitUntilClicable("//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='2']", driver);
        Helpers.clickOnFoundElementByXpath("//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='2']", driver);
        Helpers.waitUntilClicable("//md-select[@placeholder='Datacenter location']/md-select-value", driver);
        Helpers.clickOnFoundElementByXpath("//md-select[@placeholder='Datacenter location']/md-select-value", driver);
        Helpers.waitUntilClicable("//*[@class='md-select-menu-container md-active md-clickable']//*[@value='europe-west3']", driver);
        Helpers.clickOnFoundElementByXpath("//*[@class='md-select-menu-container md-active md-clickable']//*[@value='europe-west3']", driver);
        Helpers.waitUntilClicable("//md-select[@placeholder='Committed usage']/md-select-value", driver);
        Helpers.clickOnFoundElementByXpath("//md-select[@placeholder='Committed usage']/md-select-value", driver);
        Helpers.waitUntilClicable("//*[@class='md-select-menu-container md-active md-clickable']//*[@value='1']", driver);
        Helpers.clickOnFoundElementByXpath("//*[@class='md-select-menu-container md-active md-clickable']//*[@value='1']", driver);
        Helpers.clickOnFoundElementByXpath("//button[@class='md-raised md-primary cpc-button md-button md-ink-ripple']", driver);
    }
}