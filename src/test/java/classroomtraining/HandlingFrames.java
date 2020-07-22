package classroomtraining;

import genericmethods.GenericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames {

    public static void main(String[] args) throws InterruptedException {
        GenericMethods genericMethods = new GenericMethods();

        genericMethods.launchBrowser("opera", "https://www.timesjobs.com/");
Thread.sleep(10000);
        //Using Implicit wait
        //GenericMethods.driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

        WebElement iframe = GenericMethods.driver.findElement(By.xpath("(//iframe)[4]"));

        GenericMethods.driver.switchTo().frame(iframe);

        String header = GenericMethods.driver.findElement(By.xpath("//h2[text()='From Around The Web']")).getText();

        System.out.println(header);

        GenericMethods.driver.switchTo().defaultContent();
    }
}
