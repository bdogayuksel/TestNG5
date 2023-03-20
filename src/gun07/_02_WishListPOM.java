package gun07;

import Gun06._03_PlaceOrderElements;
import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _02_WishListPOM extends BaseDriver {

    //POM-> Page Object Model

    @Test
    @Parameters("searchText")
    void addToWishList(String kelime){

        _03_PlaceOrderElements poe=new _03_PlaceOrderElements();

        poe.searchBox.sendKeys(kelime);
        poe.searchButton.click();

        _02_WishListElements wle=new _02_WishListElements();

        int randomSecim= Tools.RandomGen(wle.searchResult.size());
        String wishItemText=wle.searchResult.get(randomSecim).getText();
        wle.wishList.get(randomSecim).click();
        wle.wishBtnList.click();
        Tools.listContainsString(wle.wishTableNames, wishItemText);



    }

    
}
