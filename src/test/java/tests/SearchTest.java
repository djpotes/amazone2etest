package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.ItemDetailPage;
import pages.SearchResultPage;
import utils.DriverInstance;
import utils.Waits;

public class SearchTest {
    private WebDriver driver;
    private String baseUrl = "https://www.amazon.com";

    @Before
    public void setup(){
        this.driver = DriverInstance.getWebDriver();
    }

    @Test
    public void testExample1(){
        this.driver.get(baseUrl);
        HomePage homePage = new HomePage(this.driver);
        homePage.search("Alexa");
        SearchResultPage searchResultPage = new SearchResultPage(this.driver);
        searchResultPage.navigateToPage(2);
        Waits.sleep(3000);
        searchResultPage.clickItem(3);
        Waits.sleep(3000);
        ItemDetailPage itemDetailPage = new ItemDetailPage(this.driver);
        assertTrue(itemDetailPage.isExistingBtnAddToCart());
    }

    @After
    public void tearDown(){
        this.driver.quit();
    }

}
