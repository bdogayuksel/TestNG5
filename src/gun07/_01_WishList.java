package gun07;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _01_WishList extends BaseDriver {

    @Test
    @Parameters("searchText")
    void addToWishList(String kelime){

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='search']"));
        searchBox.sendKeys(kelime);
        WebElement enterBtn=driver.findElement(By.xpath("//span[@class='input-group-btn']//button[@type='button']"));
        enterBtn.click();

        List<WebElement> searchResult=driver.findElements(By.cssSelector("div[class='caption']>h4>a"));

        int randSecim= Tools.RandomGen(searchResult.size());
        String wishItemText=searchResult.get(randSecim).getText();//tıklatılacak elementin ismini aldık


        List<WebElement> wishList= driver.findElements(By.xpath("//button[@data-original-title='Add to Wish List']"));

        wishList.get(randSecim).click();//random elementin wishlistine tıkladık

        WebElement wishBtnList= driver.findElement(By.id("wishlist-total"));
        wishBtnList.click();

        List<WebElement> wishTableNames=driver.findElements(By.cssSelector("[class='text-left']>a"));

        Tools.listContainsString(wishTableNames, wishItemText);



    }
}
