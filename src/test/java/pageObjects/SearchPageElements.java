package pageObjects;

import Helpers.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.List;

public class SearchPageElements extends DriverHolder {
    public SearchPageElements(WebDriver driver){
        super(driver);
    }

    public WebElement firstItem(){
        return driver.findElements(By.xpath("//*[contains(@class, 'a-section aok-relative')]")).get(0);
    }

    public List<WebElement> quantityList(){
        return  driver.findElements(By.xpath("//*[@name='quantity']"));
    }

    public WebElement addToCardBtn() {
        return driver.findElement(By.xpath("//*[@id='add-to-cart-button']"));
    }
}
