package tests;

import org.junit.*;

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

    @BeforeClass
    public static void setup(){
        DriverInstance.init();
    }

    @Test
    public void itemAvailableForPurchase(){
        DriverInstance.driver.get(baseUrl);
        HomePage homePage = new HomePage(DriverInstance.driver);
        homePage.search("Alexa");
        SearchResultPage searchResultPage = new SearchResultPage(DriverInstance.driver);
        searchResultPage.navigateToPage(2);
        Waits.sleep(2000);
        searchResultPage.clickItem(3);
        Waits.sleep(2000);
        ItemDetailPage itemDetailPage = new ItemDetailPage(DriverInstance.driver);
        assertTrue(itemDetailPage.isExistingBtnAddToCart());
    }

    @AfterClass
    public static void tearDown(){
        DriverInstance.quit();
    }
}
