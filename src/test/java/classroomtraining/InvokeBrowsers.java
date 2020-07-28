package classroomtraining;

import genericmethods.GenericMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InvokeBrowsers {

    public static void main(String[] args) throws InterruptedException {

        GenericMethods genericMethods=new GenericMethods();
        genericMethods.launchBrowser("edge","https://demo.nopcommerce.com");

        GenericMethods.driver.findElement(By.linkText("Register")).click();
        Thread.sleep(5000);

        WebElement gendermale=GenericMethods.driver.findElement(By.id("gender-male"));
        gendermale.click();
        System.out.println("Gender Male : "+gendermale.isSelected());

        GenericMethods.driver.findElement(By.id("FirstName")).sendKeys("Vishal");

        GenericMethods.driver.findElement(By.id("LastName")).sendKeys("K");

        //GenericMethods.driver.findElement(By.name("DateOfBirthDay")).sendKeys("3");
        WebElement dobDay=GenericMethods.driver.findElement(By.name("DateOfBirthDay"));
        genericMethods.selectDropDownByVisibleText(dobDay,"3");
        genericMethods.checkIfTheDropDownSelected(dobDay,"day");

        //GenericMethods.driver.findElement(By.name("DateOfBirthMonth")).sendKeys("August");
        WebElement dobMonth=GenericMethods.driver.findElement(By.name("DateOfBirthMonth"));
        genericMethods.selectDropDownByVisibleText(dobMonth,"August");

        //GenericMethods.driver.findElement(By.name("DateOfBirthYear")).sendKeys("1994");
        WebElement dobYear=GenericMethods.driver.findElement(By.name("DateOfBirthYear"));
        genericMethods.selectDropDownByVisibleText(dobYear,"1995");

//        GenericMethods.driver.findElement(By.id("Email")).sendKeys("something@gmail.com");
//
//        GenericMethods.driver.findElement(By.id("Company")).sendKeys("Company");
//
        WebElement newsLetter=GenericMethods.driver.findElement(By.id("Newsletter"));
        newsLetter.click();
        System.out.println("News Letter : "+newsLetter.isSelected());

//        GenericMethods.driver.findElement(By.id("Password")).sendKeys("Password");
//
//        GenericMethods.driver.findElement(By.id("ConfirmPassword")).sendKeys("Password");
//
//        GenericMethods.driver.findElement(By.id("register-button")).click();
    }
}
