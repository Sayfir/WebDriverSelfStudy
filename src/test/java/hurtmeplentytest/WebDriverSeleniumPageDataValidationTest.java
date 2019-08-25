package hurtmeplentytest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverSeleniumPageDataValidationTest extends BaseTest {

    @Test
    public void testGetCorrectEstimationValue() {
        Assert.assertEquals("Total Estimated Cost: USD 1,187.77 per 1 month", BaseTest.getEstimateResult());
    }

    @Test
    public void testGetVmClassCorrectValue() {
        Assert.assertEquals("VM class: regular", BaseTest.getVmClass());
    }

    @Test
    public void testGetInstanceTypeCorrectValue() {
        Assert.assertEquals("Instance type: n1-standard-8", BaseTest.getInstanceType());
    }

    @Test
    public void testGetRegionCorrectValue() {
        Assert.assertEquals("Region: Frankfurt", BaseTest.getRegion());
    }

    @Test
    public void testGetLocalSsdCorrectValue() {
        Assert.assertEquals("Total available local SSD space 2x375 GB", BaseTest.getLocalSsd());
    }

    @Test
    public void testGetCommitmentTermCorrectValue() {
        Assert.assertEquals("Commitment term: 1 Year", BaseTest.getCommitmentTerm());
    }
}
