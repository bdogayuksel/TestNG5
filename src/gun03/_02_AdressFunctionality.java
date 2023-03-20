package gun03;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class _02_AdressFunctionality extends BaseDriver {

    @Test
    void addAddress(){

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));

        WebElement address=driver.findElement(By.xpath("//a[text()='Address Book']"));
        address.click();

        WebElement newAddress=driver.findElement(By.xpath("//a[text()='New Address']"));
        newAddress.click();

        WebElement firstName=driver.findElement(By.xpath("//input[@id='input-firstname']"));
        firstName.sendKeys("Berk");

        WebElement lastName=driver.findElement(By.xpath("//input[@id='input-lastname']"));
        lastName.sendKeys("yuksel");

        WebElement addressLine=driver.findElement(By.xpath("//input[@id='input-address-1']"));
        addressLine.sendKeys("test deneme");

        WebElement city=driver.findElement(By.xpath("//input[@id='input-city']"));
        city.sendKeys("Istanbul");

        WebElement zipCode=driver.findElement(By.xpath("//input[@id='input-postcode']"));
        zipCode.sendKeys("34940");

        WebElement country=driver.findElement(By.xpath("//option[@value='215']"));
        country.click();


        /*

            1.seçenek
            wait.until(ExpectedConditions.elementToBeClickable(country));
            2.seçenek
            WebElement options=driver.findElement(By.cssSelector("select[id='input-zone']>option"));
             wait.until(ExpectedConditions.stalenessOf(options));

             alttaki yerine bunlar da kulanılabilir

         */

        wait.until(ExpectedConditions.visibilityOf(country));
        WebElement region=driver.findElement(By.xpath("//option[@value='3354']"));
        region.click();

        //WebElement defaultAddress=driver.findElement(By.xpath("//input[@value='1']"));
        //defaultAddress.click();

        WebElement continueBtn=driver.findElement(By.xpath("//input[@value='Continue']"));
        continueBtn.click();




    }

    @Test(dependsOnMethods = {"addAddress"})

    void editAddress(){

        WebElement address=driver.findElement(By.xpath("//a[text()='Address Book']"));
        address.click();

        List<WebElement> editAll=driver.findElements(By.linkText("Edit"));
        WebElement lastEdit=editAll.get(editAll.size()-1);
        lastEdit.click();


        WebElement firstName=driver.findElement(By.xpath("//input[@id='input-firstname']"));
        firstName.clear();
        firstName.sendKeys("Berk1");

        WebElement lastName=driver.findElement(By.xpath("//input[@id='input-lastname']"));
        lastName.clear();
        lastName.sendKeys("yuksel");

    }

    @Test(dependsOnMethods = {"editAddress"})

    void deleteAddress(){

        WebElement address=driver.findElement(By.xpath("//a[text()='Address Book']"));
        address.click();

        List<WebElement> editAll=driver.findElements(By.linkText("Delete"));
        WebElement deleteAddress=editAll.get(editAll.size()-2);//son kalanı sildirmiyor bu yüzden -2
        deleteAddress.click();

    }

}
