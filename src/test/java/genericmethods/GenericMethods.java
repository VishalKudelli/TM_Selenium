package genericmethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class GenericMethods {
    public static WebDriver driver;

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

}
