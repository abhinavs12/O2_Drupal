import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by cts1 on 22/5/17.
 */
public class Header_XXL_Live {

    private By headerText = By.xpath("//div[@id='$params.id']/div/div/div/h1");
    private By headerTextSecondary = By.xpath("//div[@id='$params.id']/div/div/div/p");

    public WebDriver driver;

    public Header_XXL_Live(WebDriver driver) {

        this.driver = driver;
    }

    public String checkHeaderText_Live() {


        return driver.findElement(headerText).getText();
    }

    public String checkSecondaryText_Live() {

        return driver.findElement(headerTextSecondary).getText();

    }
}
