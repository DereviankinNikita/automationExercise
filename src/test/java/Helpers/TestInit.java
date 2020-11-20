package Helpers;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestInit{
    public WebDriver driver;

    @BeforeClass
    public void setUp(){
        if(System.getProperty("os.name").toLowerCase().contains("mac")){
            System.setProperty(
                    "webdriver.chrome.driver",
                    "src/chromedriver"
            );
        }else if (System.getProperty("os.name").toLowerCase().contains("win")){
            System.setProperty(
                    "webdriver.chrome.driver",
                    "src/chromedriver_win.exe"
            );
        }else {
            new Exception("CURRENT SOLUTION IMPLEMENTED ONLY FOR MAC AND WINDOWS");
        }
        driver = new ChromeDriver();
    }

    public void waitForPageLoad() {
        new WebDriverWait(driver, 30).until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
    }

    @AfterTest
    public void close(){
        driver.quit();
    }

}
