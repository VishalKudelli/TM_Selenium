package POJOMethods;

import genericmethods.GenericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RediffImplement {

    public static void main(String[] args) throws InterruptedException {

        Map<String, RediffPOJO> map = new HashMap<String, RediffPOJO>();

        GenericMethods genericMethods = new GenericMethods();
        genericMethods.launchBrowser("chrome", "https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
        WebElement stock= GenericMethods.driver.findElement(By.xpath("//th[text()='Company']/ancestor::table"));
        genericMethods.waitForElementVisible(stock,10);
        String rowXpath = "//th[text()='Company']/ancestor::table//tr";
        List<WebElement> rowCount = GenericMethods.driver.findElements(By.xpath(rowXpath));


        try{
            for (int r = 0; r <= rowCount.size() - 1; r++) {

                String colXpath = rowXpath + "[" + (r + 1) + "]/td";
                String col1 = GenericMethods.driver.findElement(By.xpath(colXpath + "[" + 1 + "]")).getText();
                String col2 = GenericMethods.driver.findElement(By.xpath(colXpath + "[" + 2 + "]")).getText();
                String col3 = GenericMethods.driver.findElement(By.xpath(colXpath + "[" + 3 + "]")).getText();
                String col4 = GenericMethods.driver.findElement(By.xpath(colXpath + "[" + 4 + "]")).getText();


                map.put(rowXpath, new RediffPOJO(col1, col2, col3, col4));
//            List<WebElement> colsCount = GenericMethods.driver.findElements(By.xpath(colXpath));
//
//            for (int c = 0; c <= colsCount.size() - 1; c++) {
//
//                String dataXpath = rowXpath + "[" + (r + 1) + "]/td[" + (c + 1) + "]";
//                String cellValue = GenericMethods.driver.findElement(By.xpath(dataXpath)).getText();
//                System.out.println(cellValue);
//            }
//
//        }

                for (Map.Entry<String, RediffPOJO> table : map.entrySet()) {

                    System.out.println(table.getValue().getGroup() + ":" + table.getValue().getPrevClose() + ":" + table.getValue().getCurrentPrice() + ":" + table.getValue().getPrcChange());
                }
            }
        }
        catch (Exception e){}
    }
}