package gun02;

import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {

    @Test

    void EqualOrnek(){

        String s1="Merhaba";

        String s2="Merhaba";

        //SYNTAX: Actual, expected, message

        Assert.assertEquals(s1, s2, "basarisiz");

    }

    @Test

    void NotEqualOrnek(){

        int s1=55;
        int s2=74;

        //SYNTAX: Actual, expected, message

        Assert.assertNotEquals(s1, s2, "maalesef eşit");//eşit istemiyoruz  eğer eşitse mesaj çıkıcak

    }

    @Test

    void trueOrnek(){

        int s1=55;
        int s2=55;

        Assert.assertTrue(s1==s2,"eşit değil");//mesajlar sadece hata olunca gözükür
    }

    @Test

    void nullOrnek(){

        String s1=null;

        Assert.assertNull(s1,"Null değil");
    }


}
