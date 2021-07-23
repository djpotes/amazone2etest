package tests;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.DriverInstance;

public class SearchTest {
    private WebDriver driver;

    @Before
    public void setup(){
        this.driver = DriverInstance.getWebDriver();
    }

    @Test
    public void testExample1(){
        this.driver.get("https://www.google.com");
    }

    @After
    public void tearDown(){
        this.driver.quit();
    }

}
