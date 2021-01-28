package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Base {
    WebDriver driver;

    @Test
    @Parameters({"webDriver","canal"})
    public void inicio(String webDriver, String canal){
        switch (webDriver){
            case "IE":
                System.setProperty("webdriver.ie.driver", "C:/WebDrivers/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                driver.manage().deleteAllCookies();
                break;
            case "Chrome":
                System.setProperty("webdriver.chrome.driver", "C:/WebDrivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "FireFox":
                System.setProperty("webdriver.gecko.driver", "C:/WebDrivers/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
        }
        driver.navigate().to("http://www.google.com/");
    }
}
