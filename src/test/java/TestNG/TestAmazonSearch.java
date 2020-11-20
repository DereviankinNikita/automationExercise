package TestNG;

import org.testng.Assert;
import pageObjects.AmazonMainPageHelper;
import Helpers.TestInit;
import org.testng.annotations.Test;
import pageObjects.OrderPageHelper;
import pageObjects.SearchPageHelper;

public class TestAmazonSearch extends TestInit {

    @Test
    public void amazonSearchTest(){
        AmazonMainPageHelper amazon = new AmazonMainPageHelper(driver);
        amazon.goTo();
        waitForPageLoad();

        amazon.inputSearchRequest("hats for men");
        amazon.waitForElementToBeClickable(amazon.searchButton());
        amazon.searchButton().click();

        SearchPageHelper searchResult = new SearchPageHelper(driver);
        searchResult.waitForElementToBeClickable(searchResult.firstItem());
        amazon.waitForElementToBeClickable(searchResult.firstItem());
        searchResult.firstItem().click();
        Double result = searchResult.getPrice();
        searchResult.addItemToCard(2);

        OrderPageHelper total = new OrderPageHelper(driver);
        total.checkSum();
        Double price = result *2;
        Assert.assertTrue(total.getPriceField().getText().contains(price+""));
        Assert.assertTrue(total.totalQuantityNotification().contains("2 items"));


        amazon.goTo();
        waitForPageLoad();

        amazon.inputSearchRequest("hats for women");
        amazon.waitForElementToBeClickable(amazon.searchButton());
        amazon.searchButton().click();

        searchResult.waitForElementToBeClickable(searchResult.firstItem());
        amazon.waitForElementToBeClickable(searchResult.firstItem());
        searchResult.firstItem().click();
        Double secondResult = searchResult.getPrice();
        searchResult.addItemToCard(1);

        total.checkSum();
        price += secondResult;
        Assert.assertTrue(total.getPriceField().getText().contains(price+""));
        Assert.assertTrue(total.totalQuantityNotification().contains("3 items"));

    }
}