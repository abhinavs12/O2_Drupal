import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Created by cts1 on 17/5/17.
 */
public class DriverClass {

    public WebDriver driver_UAT = new FirefoxDriver();
    public WebDriver driver_Live = new FirefoxDriver();

    public DriverClass(){

        System.setProperty("webdriver.chrome.driver","/home/cts1/Downloads/MVP/chromedriver");


        driver_UAT.manage().window().maximize();

        driver_Live.manage().window().maximize();

        String baseUrl_UAT = "http://o2uat.prod.acquia-sites.com/business/insights/uber";

        String baseUrl_Live = "http://o2.co.uk/business/insights/uber";

        driver_UAT.get(baseUrl_UAT);

        driver_Live.get(baseUrl_Live);
    }

}
