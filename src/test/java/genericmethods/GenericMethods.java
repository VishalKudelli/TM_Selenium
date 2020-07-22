package genericmethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GenericMethods {
    public static WebDriver driver;

    /**
     * @Method name: launchBrowser
     * @param browserType,url
     * @Purpose: This method will launch the browser gievn by the user
     * @Return Type: NA
     */


    public void launchBrowser(String browserType, String url){

        switch(browserType.toUpperCase()){

            case "CHROME":
                //logic for chrome
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
                break;

            case "FF":
                //logic for firefox
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;

            case "EDGE":
                //logic for Edge
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                break;

            case "OPERA":
                //logic for Opera
                WebDriverManager.operadriver().setup();
                driver=new OperaDriver();
                break;

            default:
                System.out.println("Invalid Browser");
        }
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void waitForElementVisible (WebElement element, int seconds){

        //Get the element from the WebElement
        System.out.println(element);

        String xpath= element.toString();
        xpath= xpath.substring(xpath.lastIndexOf(" ")+1,xpath.length()-1);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
    }

    public void hoverAndClick(WebElement element){
        Actions acc=new Actions(driver);
        acc.moveToElement(element).click(element).build().perform();

    }

    public void forceClick(WebElement element)
    {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",element);
    }

}
