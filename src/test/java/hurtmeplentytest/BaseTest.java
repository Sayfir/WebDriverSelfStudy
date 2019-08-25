package hurtmeplentytest;

import hurtmeplentytask.Helpers;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Helpers {

    @BeforeTest
    public static void setUp() {
        Helpers.driver.get("https://cloud.google.com/products/calculator/");
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Helpers.clickOnFoundElementByXpath("//*[@class='md-select-menu-container md-active md-clickable']//*[@value='europe-west3']", driver);
        Helpers.waitUntilClicable("//md-select[@placeholder='Committed usage']/md-select-value", driver);
        Helpers.clickOnFoundElementByXpath("//md-select[@placeholder='Committed usage']/md-select-value", driver);
        Helpers.waitUntilClicable("//*[@class='md-select-menu-container md-active md-clickable']//*[@value='1']", driver);
        Helpers.clickOnFoundElementByXpath("//*[@class='md-select-menu-container md-active md-clickable']//*[@value='1']", driver);
        Helpers.clickOnFoundElementByXpath("//button[@class='md-raised md-primary cpc-button md-button md-ink-ripple']", driver);
    }

    public static String getEstimateResult() {
        String estimateResult = driver.findElement(By.xpath("//*[@id='resultBlock']//*[@class='md-title']/b")).getText();
        return estimateResult;
    }

    public static String getVmClass() {
        String vmClass = driver.findElement(By.xpath("//*[@id='compute']/md-list/md-list-item[2]/div")).getText();
        return vmClass;
    }

    public static String getInstanceType() {
        String instanceType = driver.findElement(By.xpath("//*[@id='compute']/md-list/md-list-item[3]/div")).getText();
        return instanceType;
    }

    public static String getRegion() {
        String region = driver.findElement(By.xpath("//*[@id='compute']/md-list/md-list-item[4]/div")).getText();
        return region;
    }

    public static String getLocalSsd() {
        String localSsd = driver.findElement(By.xpath("//*[@id='compute']/md-list/md-list-item[5]/div")).getText();
        return localSsd;
    }

    public static String getCommitmentTerm() {
        String commitmentTerm = driver.findElement(By.xpath("//*[@id='compute']/md-list/md-list-item[6]/div")).getText();
        return commitmentTerm;
    }


    @AfterTest
    public static void teardown() {
        driver.quit();
    }
}