package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Waits {
    private WebDriver driver = null;

    public Waits(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static void sleep(long millis){
        try{
            Thread.sleep(millis);
        }
        catch(InterruptedException ie){
        }
    }
}
