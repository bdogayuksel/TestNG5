package gun02;

import Utility.Tools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _01_Enable {
    //public olması zorunlu değil(JUnt de zorunlu)

    @Test

    void test1(){

        System.out.println("test1");

    }

    @Test(enabled = false)//disable eder

    void test2(){

        System.out.println("test2");

    }

    @Test

    void test3(){

        System.out.println("test3");

    }

    public static WebDriver driver;
    @BeforeClass
    void baslangicIslemleri(){

        System.out.println("başlangic islemleri yapiliyor");

        Logger logger= Logger.getLogger(""); // sisteme ait bütün logları üreten objeye/servise ulaştım ""
        logger.setLevel(Level.SEVERE); // Sadece errorları göster
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

        driver = new ChromeDriver();

        driver.manage().window().maximize();//tam ekran


        //30 saniye yüklenmesini bekle olmazsa kapat
        //30 saniyeden önce açılırsa 30 sn beklemez
        Duration dr=Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);


        // Bütün weblementlerin element bazında, elemente özel işlem yapılmadan önce
        // hazır hale gelmesi verilen mühlet yani süre.
        // eğer 2 sn yüklerse 30 sn. beklemez.
        driver.manage().timeouts().implicitlyWait(dr);

    }

    @AfterClass
    void bitisIslemleri(){
        System.out.println("bitis islemleri");

        Tools.Bekle(3);
        driver.quit();
    }

}
