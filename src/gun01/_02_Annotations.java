package gun01;

import org.testng.annotations.*;

public class _02_Annotations {


    @BeforeClass//driver başlatma
    public void beforeClass(){
        System.out.println("before class calisti");
    }

    @BeforeTest//ilk sırada çalışır
    public void beforeTest(){
        System.out.println("before test calisti");
    }

    @AfterTest
    public void afterTest(){

        System.out.println("after test çalisti");
    }

    @AfterClass//bekleKapat görevi
    public void afterClass(){

        System.out.println("after class çalisti");
    }
    @BeforeMethod//her methoddan önce çalışır
    public void beforeMethod(){
        System.out.println("before method calisti");
    }

    @Test

    public void Test1(){

        System.out.println("test1 çalisti");
    }

    @Test
    public void Test2(){

        System.out.println("test2 çalisti");
    }

    @AfterMethod//her methoddan sonra çalışır
    public void afterMethod(){

        System.out.println("after method çalisti");
    }

}
