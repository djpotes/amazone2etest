package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverInstance {
    public static WebDriver instance = null;
    public static WebDriver getWebDriver(){
        if(instance == null){
            String osName = System.getProperty("os.name").toLowerCase();
            if(osName.contains("mac")){
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
            }
            if(osName.contains("win")){
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            }
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            return new ChromeDriver(options);
        }else{
            return instance;
        }
    }
}
