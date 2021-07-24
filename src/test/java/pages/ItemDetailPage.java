package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ItemDetailPage {

    @FindBy(id = "add-to-cart-button")
    private List<WebElement> btnAddToCart;

    private WebDriver driver = null;

    public ItemDetailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isExistingBtnAddToCart(){
        return btnAddToCart.size()>0;
    }
}
