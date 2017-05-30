import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by cts1 on 19/5/17.
 */
public class Header_XXL_UAT {

    //Header Elements

    private By headerText = By.xpath("//div[@id='headersuperXXL-1']/div/div/div/h1");
    private By headerTextSecondary = By.xpath("//*[@id='headersuperXXL-1']/div/div/div/p");



    public WebDriver driver;

    public Header_XXL_UAT(WebDriver driver){

        this.driver=driver;

    }

    public String checkHeaderText(){


         return driver.findElement(headerText).getText();
    }

    public String checkSecondaryText(){

        return driver.findElement(headerTextSecondary).getText();
    }



}
