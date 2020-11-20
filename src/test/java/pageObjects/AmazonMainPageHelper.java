package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonMainPageHelper extends AmazonMainPageElements {
//

    public AmazonMainPageHelper(WebDriver driver){
        super(driver);
    }

    public void goTo(){
        driver.get("https://www.amazon.com/");
    }

    public void inputSearchRequest(String search){
        WebElement searchField = searchFieldOnMainPage();
        searchField.clear();
        searchField.sendKeys(search);
    }



}
