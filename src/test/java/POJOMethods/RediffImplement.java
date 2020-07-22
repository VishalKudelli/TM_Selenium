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
        genericMethods.launchBrowser("Opera", "https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

        Thread.sleep(10000);
        String rowXpath = "//th[text()='Company']/ancestor::table//tr";
        List<WebElement> rowCount = GenericMethods.driver.findElements(By.xpath(rowXpath));

        map.put(rowXpath,new RediffPOJO("Axis Bank Ltd.",));

//        for (int r = 0; r <= rowCount.size() - 1; r++) {
//            String colXpath = rowXpath + "[" + (r + 1) + "]/td";
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

        for (Map.Entry<String,RediffPOJO> table: map.entrySet()){

            System.out.println(table.getValue().getGroup());
        }
    }
}
