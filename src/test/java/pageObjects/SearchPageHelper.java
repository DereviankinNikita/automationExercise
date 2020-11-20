package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchPageHelper extends SearchPageElements {
    public SearchPageHelper(WebDriver driver){
        super(driver);
    }

    public Double getPrice() {
        return Double.parseDouble(driver.findElement(By.xpath("//*[@id='priceblock_ourprice']")).getText().substring(1));
    }

    public void addItemToCard(int quantity) {
        quantityOfElements(0, quantity);
        addToCardBtn().click();
    }

    public void quantityOfElements(int elementInList, int quantitySelector) {
        WebElement quantityElement = quantityList().get(elementInList);
        Select quantitySelect = new Select(quantityElement);
        quantitySelect.selectByValue(quantitySelector+"");
    }
}
