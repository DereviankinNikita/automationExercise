package pageObjects;

import Helpers.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AmazonMainPageElements extends DriverHolder {
    public AmazonMainPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement searchFieldOnMainPage(){
        return driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    }

    public WebElement searchButton(){
        return driver.findElement(By.xpath("//span[contains(@id, 'nav-search-submit-text')]"));
    }





    public WebElement getPriceElement(){
        return driver.findElement(By.xpath(""));
    }

}
