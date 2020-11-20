package Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DriverHolder {
    protected WebDriver driver;

    public DriverHolder(WebDriver driver) {
        this.driver = driver;
    }



    public void waitForElementToBeClickable(WebElement element) {
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilElementsDisplayed(int seconds, String locator) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
    }

}
