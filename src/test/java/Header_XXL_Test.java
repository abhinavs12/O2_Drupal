
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by cts1 on 19/5/17.
 */
public class Header_XXL_Test {

    WebDriver driver_UAT;
    WebDriver driver_Live;
    DriverClass driverClass;
    Header_XXL_UAT header_xxl_uat;
    Header_XXL_Live header_xxl_live;


    @BeforeTest
    public void initDriver() {
        driverClass = new DriverClass();
        driver_UAT = driverClass.driver_UAT;
        driver_Live = driverClass.driver_Live;
    }

    @AfterTest
    public void closeDriver() {
        driver_UAT.close();
        driver_Live.close();
    }

    @Test
    public void verifyHeaderText() {
        /* Header Title */
        header_xxl_uat = new Header_XXL_UAT(driver_UAT);
        header_xxl_live = new Header_XXL_Live(driver_Live);
        String headerTextLive = header_xxl_live.checkHeaderText_Live();
        String headerTextUat = header_xxl_uat.checkHeaderText();
        Assert.assertEquals(headerTextUat, headerTextLive);

        System.out.println("Header Text Test Passed\n");

        String headerTextSecondaryUat = header_xxl_uat.checkSecondaryText();
        String headerTextSecondaryLive = header_xxl_live.checkSecondaryText_Live();
        System.out.println(headerTextSecondaryUat);
        System.out.println(headerTextSecondaryLive);
        Assert.assertEquals(headerTextSecondaryUat, headerTextSecondaryLive);
    }
}






