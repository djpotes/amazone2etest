package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchResultPage {
    private WebDriver driver;

    @FindBy(xpath = "//a[text()='Next']")
    WebElement btnNextPage;

    @FindBy(xpath = "//div[@data-component-type='s-search-result']")
    List<WebElement> itemsList;

    //By btnNextPage = By.xpath("//a[text()='Next']");
    //By itemsList = By.xpath("//div[@data-component-type='s-search-result']");

    //By itemsList = By.xpath("//div[@data-component-type='s-search-result']");

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToPage(int pageNumber) {
        if (pageNumber >= 2) {
            for (int i = 1; i <= pageNumber - 1;i++) {
                this.clickNextPage();
            }
        }
    }

    private void clickNextPage(){
        btnNextPage.click();
    }

    public void clickItem(int index) {
        itemsList.get(index - 1).click();
    }
}
