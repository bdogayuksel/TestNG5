package gun02;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_Ornek extends BaseDriver {

    @Test

    void loginTest(){

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement email= driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("test97@test.com");

        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("Do0omy97");

        WebElement loginBtn= driver.findElement(By.xpath("//input[@value='Login']"));
        loginBtn.click();

        Assert.assertTrue(driver.getTitle().equals("My Account"));


    }
}
