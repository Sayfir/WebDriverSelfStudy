package hardcoretask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hardcore {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://cloud.google.com/");
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        HardcoreHelpers.clickOnFoundElementByXpath("//a[@href='https://cloud.google.com/products/' and @track-name='products']", driver);
        HardcoreHelpers.clickOnFoundElementByXpath("//a[@track-metadata-eventdetail='seeAllProducts']", driver);
        HardcoreHelpers.waitUntilClicable("//a[@href='https://cloud.google.com/pricing/' and @track-name='seePricing']", driver);
        HardcoreHelpers.clickOnFoundElementByXpath("//a[@href='https://cloud.google.com/pricing/' and @track-name='seePricing']", driver);
        HardcoreHelpers.waitUntilClicable("//a[@href='https://cloud.google.com/pricing/calculators']", driver);
        HardcoreHelpers.clickOnFoundElementByXpath("//a[@href='https://cloud.google.com/pricing/calculators']", driver);
        Thread.sleep(5000);
        driver.switchTo().frame(0);
        HardcoreHelpers.waitUntilClicable("//input[@id='input_52']", driver);
        HardcoreHelpers.clickOnFoundElementByXpath("//input[@id='input_52']", driver);
        HardcoreHelpers.typeTextInFoundTextFields("//input[@id='input_52']", driver, "4");
        HardcoreHelpers.waitUntilClicable("//md-select[@id='select_75']", driver);
        HardcoreHelpers.clickOnFoundElementByXpath("//md-select[@id='select_75']", driver);
        HardcoreHelpers.waitUntilClicable("//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']", driver);
        HardcoreHelpers.clickOnFoundElementByXpath("//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']", driver);
        HardcoreHelpers.clickOnFoundElementByCss("md-input-container > [aria-label='Add GPUs']", driver);
        HardcoreHelpers.clickOnFoundElementByXpath("//md-select[@placeholder='Number of GPUs']/md-select-value", driver);
        HardcoreHelpers.clickOnFoundElementByXpath("//*[@class='md-select-menu-container md-active md-clickable']//md-option[@value='1']", driver);
        HardcoreHelpers.waitUntilClicable("//md-select[@placeholder='GPU type']/md-select-value", driver);
        HardcoreHelpers.clickOnFoundElementByXpath("//md-select[@placeholder='GPU type']/md-select-value", driver);
        HardcoreHelpers.waitUntilClicable("//*[@value='NVIDIA_TESLA_V100']", driver);
        HardcoreHelpers.clickOnFoundElementByXpath("//*[@value='NVIDIA_TESLA_V100']", driver);
        HardcoreHelpers.waitUntilClicable("//md-select[@placeholder='Local SSD']/md-select-value", driver);
        HardcoreHelpers.clickOnFoundElementByXpath("//md-select[@placeholder='Local SSD']/md-select-value", driver);
        HardcoreHelpers.waitUntilClicable("//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='2']", driver);
        HardcoreHelpers.clickOnFoundElementByXpath("//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='2']", driver);
        HardcoreHelpers.waitUntilClicable("//md-select[@placeholder='Datacenter location']/md-select-value", driver);
        HardcoreHelpers.clickOnFoundElementByXpath("//md-select[@placeholder='Datacenter location']/md-select-value", driver);
        HardcoreHelpers.waitUntilClicable("//*[@class='md-select-menu-container md-active md-clickable']//*[@value='europe-west3']", driver);
        HardcoreHelpers.clickOnFoundElementByXpath("//*[@class='md-select-menu-container md-active md-clickable']//*[@value='europe-west3']", driver);
        HardcoreHelpers.waitUntilClicable("//md-select[@placeholder='Committed usage']/md-select-value", driver);
        HardcoreHelpers.clickOnFoundElementByXpath("//md-select[@placeholder='Committed usage']/md-select-value", driver);
        HardcoreHelpers.waitUntilClicable("//*[@class='md-select-menu-container md-active md-clickable']//*[@value='1']", driver);
        HardcoreHelpers.clickOnFoundElementByXpath("//*[@class='md-select-menu-container md-active md-clickable']//*[@value='1']", driver);
        HardcoreHelpers.clickOnFoundElementByXpath("//button[@class='md-raised md-primary cpc-button md-button md-ink-ripple']", driver);
        HardcoreHelpers.clickOnFoundElementByCss("#email_quote", driver);
        driver.get("https://10minutemail.com");
        String email = driver.findElement(By.xpath("//*[@id='copyAddress']")).getAttribute("data-clipboard-text");
        Thread.sleep(5000);
        driver.switchTo().window("https://cloud.google.com/products/calculator/").switchTo().frame(0);
        HardcoreHelpers.typeTextInFoundTextFields("#input_390", driver, email);

    }
}

