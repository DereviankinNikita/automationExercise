package pageObjects;

import Helpers.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPageElements extends DriverHolder {
    public OrderPageElements(WebDriver driver){
        super(driver);
    }

    public WebElement quantityInBasket() {
        return driver.findElement(By.xpath("//*[@id='nav-cart-count']"));
    }

    public WebElement getPriceField() {
        return driver.findElement(By.xpath("//*[@id='sc-subtotal-amount-activecart']/span"));
    }

    public String totalQuantityNotification() {
        return driver.findElement(By.xpath("//*[@id='sc-subtotal-label-activecart']")).getText();
    }
}
