package gun05;

import Utility.BaseDriver;
//import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

/*
      Senaryo ;
      1- Siteyi açınız.
      2- mac kelimeini göndererek aratınız.
      3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
      4- aynı işlemi samsung için de yapınız
    */
public class _01_SearchFunctionality extends Utility.BaseDriverParameter {


    @Test
    @Parameters("kelime")
    //artık kendi başına çalışmaz XML gerekli(10_search.xml)
    void Test1(String text) {

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='search']"));
        searchBox.sendKeys(text);
        WebElement enterBtn=driver.findElement(By.xpath("//span[@class='input-group-btn']//button[@type='button']"));
        enterBtn.click();


        List<WebElement> macList=driver.findElements(By.cssSelector("div[class='caption']>h4"));

        for (WebElement e:macList) {

            Assert.assertTrue(e.getText().toLowerCase().contains(text.toLowerCase()));

        }


    }


}
