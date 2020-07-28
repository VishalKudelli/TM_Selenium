package classroomtraining;

import genericmethods.GenericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTables {

    public static void main(String[] args) {

        GenericMethods genericMethods=new GenericMethods();
        genericMethods.launchBrowser("Opera","https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

        WebElement table=GenericMethods.driver.findElement(By.xpath("//th[text()='Company']/ancestor::table"));

        //Implicit Wait
       // GenericMethods.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        //Explicit wait
        genericMethods.waitForElementVisible(table,20);

        String rowXpath="//th[text()='Company']/ancestor::table//tr";
        List<WebElement> rowCount= GenericMethods.driver.findElements(By.xpath(rowXpath));

        for (int r=0;r<=rowCount.size()-1;r++){
            String colXpath=rowXpath+"["+(r+1)+"]/td";
            List<WebElement> colsCount=GenericMethods.driver.findElements(By.xpath(colXpath));

            for(int c=0;c<=colsCount.size()-1;c++){

                String dataXpath=rowXpath+"["+(r+1)+"]/td["+(c+1)+"]";
                String cellValue =GenericMethods.driver.findElement(By.xpath(dataXpath)).getText();
                System.out.println(cellValue);

            }

        }
    }
}
