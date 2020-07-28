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
import org.openqa.selenium.support.ui.Select;
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

    //Selecting the Drop down

    /**
     * @method selectDropDownByVisibleText
     * @purpose selects an option from the dropdown by using the Visible Text given by the user
     * @param element
     * @param selectOption
     */
    public void selectDropDownByVisibleText(WebElement element, String selectOption){

        Select option= new Select(element);
        option.selectByVisibleText(selectOption);
    }

    /**
     * @method selectDropDownByValue
     * @purpose selects an option from the dropdown by using the Visible Text given by the user
     * @param element
     * @param selectOption
     */
    public void selectDropDownByValue(WebElement element, String selectOption){

        Select option= new Select(element);
        option.selectByValue(selectOption);
    }

    /**
     * @method selectDropDownByIndex
     * @purpose selects an option from the dropdown by using the Visible Text given by the user
     * @param element
     * @param selectOption
     */
    public void selectDropDownByIndex(WebElement element, int selectOption){

        Select option= new Select(element);
        option.selectByIndex(selectOption);
    }

    /**
     * @method checkIfTheDropDownSelected
     * @param element
     * @param valueToCompare
     * @return
     */
    public boolean checkIfTheDropDownSelected(WebElement element,String valueToCompare){

        boolean selected=false;
        Select dropDownOption=new Select(element);
        String dropDownValue=dropDownOption.getFirstSelectedOption().getText();

        // check if the dropdown option is not --select--. or length is 0 or string is empty
        if(!(dropDownValue.equalsIgnoreCase(valueToCompare) || dropDownValue.length()==0 || dropDownValue.isEmpty())){
            System.out.println("Drop Down is selected");
            selected=true;
        }
        else {
            System.out.println("Drop Down is not selected with any option");
        }
        return selected;
    }


    /**
     * @method waitForElementVisible
     * @param element
     * @param seconds
     */
    public void waitForElementVisible (WebElement element, int seconds){

        //Get the element from the WebElement
        System.out.println(element);

        String xpath= element.toString();
        xpath= xpath.substring(xpath.lastIndexOf(" ")+1,xpath.length()-1);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    /**
     * @method hoverAndClick
     * @param element
     */
    public void hoverAndClick(WebElement element){
        Actions acc=new Actions(driver);
        acc.moveToElement(element).click().build().perform();
    }


    /**
     * @method forceClick
     * @param element
     */
    public void forceClick(WebElement element)
    {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",element);
    }

    /**
     * @method dragAndDrop
     * @param element1
     * @param element2
     */
    public void dragAndDrop(WebElement element1,WebElement element2){

        Actions drag= new Actions(driver);
        drag.dragAndDrop(element1, element2);
    }

}
