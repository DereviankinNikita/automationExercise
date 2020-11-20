package pageObjects;

import org.openqa.selenium.WebDriver;

public class OrderPageHelper extends OrderPageElements {
    public OrderPageHelper(WebDriver driver){
        super(driver);
    }

    public SearchPageHelper checkSum() {
        waitUntilElementsDisplayed(10, "//*[@id='nav-cart-count']");
        quantityInBasket().click();
        return new SearchPageHelper(driver);
    }
}
