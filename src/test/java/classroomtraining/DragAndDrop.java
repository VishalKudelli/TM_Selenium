package classroomtraining;

import genericmethods.GenericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DragAndDrop {

    public static void main(String[] args) throws InterruptedException {

        GenericMethods genericMethods=new GenericMethods();
        genericMethods.launchBrowser("opera","https://jqueryui.com/droppable/");

        WebElement iframe = GenericMethods.driver.findElement(By.xpath("//iframe"));

        //Explicit wait
        //genericMethods.waitForElementVisible(iframe,10);

        GenericMethods.driver.switchTo().frame(iframe);

        WebElement element1 = GenericMethods.driver.findElement(By.xpath("//p[text()='Drag me to my target']"));

        System.out.println(element1);

        WebElement element2 = GenericMethods.driver.findElement(By.xpath("//p[text()='Drop here']"));

        System.out.println(element2);
        Thread.sleep(30000);
        // genericMethods.waitForElementVisible(element1,10);
        genericMethods.dragAndDrop(element1,element2);

        GenericMethods.driver.switchTo().defaultContent();
    }
}
