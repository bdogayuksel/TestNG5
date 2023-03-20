package gun02;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_SubscribeNewsLetter extends BaseDriver {


By link=By.linkText("Newsletter");

By subYes=By.xpath("//input[@value='1']");

By conBtn= By.xpath("//input[@value='Continue']");

    @Test

    void subscribeFuncYes(){

        WebElement newsletter= driver.findElement(link);
        newsletter.click();

        WebElement yesBtn= driver.findElement(subYes);
        yesBtn.click();

        WebElement contBtn= driver.findElement(conBtn);
        contBtn.click();


        Tools.successMessageValidation();
    }


    @Test

    void unsubscribe(){



        WebElement newsletter= driver.findElement(By.linkText("Newsletter"));
        newsletter.click();

        WebElement yesBtn= driver.findElement(By.xpath("//input[@value='0']"));
        yesBtn.click();

        WebElement contBtn= driver.findElement(By.xpath("//input[@value='Continue']"));
        contBtn.click();

        WebElement message= driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(message.getText().toLowerCase().contains("success"));



    }

    @Test

    void statusCheck(){


        WebElement newsletter= driver.findElement(By.linkText("Newsletter"));
        newsletter.click();

        WebElement yesBtn= driver.findElement(By.xpath("//input[@value='0']"));
        WebElement noBtn= driver.findElement(By.xpath("//input[@value='0']"));


        if (yesBtn.isSelected()){
            noBtn.click();
        }

        else
            yesBtn.click();

        WebElement contBtn= driver.findElement(By.xpath("//input[@value='Continue']"));
        contBtn.click();


    }
}
