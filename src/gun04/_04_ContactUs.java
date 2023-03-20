package gun04;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class _04_ContactUs extends BaseDriver {

    @Test
    @Parameters("mesaj")//xml'de farketmesi için
    void Test1(String gelenMesaj) {//bu string random olabilir

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement contactUs = driver.findElement(By.xpath("//a[text()='Contact Us']"));
        contactUs.click();


        WebElement enquiry = driver.findElement(By.xpath("//textarea[@name='enquiry']"));
        wait.until(ExpectedConditions.visibilityOf(enquiry));
        enquiry.sendKeys(gelenMesaj);

        WebElement submitBtn = driver.findElement(By.xpath("//input[@value='Submit']"));
        submitBtn.click();

        WebElement contBtn = driver.findElement(By.xpath("//a[text()='Continue']"));
        //contBtn.click();

        //WebElement conUs = driver.findElement(By.cssSelector("[id='content']>h1"));
        Assert.assertTrue(driver.getCurrentUrl().contains("success"));

    }
}
