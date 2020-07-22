package classroomtraining;

import genericmethods.GenericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ActionsClassTesting {

    public static void main(String[] args) throws IOException {

        GenericMethods genericMethods=new GenericMethods();

        genericMethods.launchBrowser("chrome","https://www.talentzing.com/");

        WebElement register=GenericMethods.driver.findElement(By.xpath("//span[text()='Register']"));

        genericMethods.waitForElementVisible(register,10);

        genericMethods.hoverAndClick(register);

        WebElement jobSeeker=GenericMethods.driver.findElement(By.xpath("//span[@id='lblJsRegister']"));
        genericMethods.forceClick(jobSeeker);

        WebElement chooseFile=GenericMethods.driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_flUpdResume']"));
        genericMethods.waitForElementVisible(chooseFile,15);
        genericMethods.hoverAndClick(chooseFile);
        String filePath="C:\\Users\\hanshik\\Downloads\\Information.docx";
        Runtime.getRuntime().exec("Fileupload.exe"+" "+filePath);

    }

}
