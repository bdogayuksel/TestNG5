package gun01;

import org.testng.annotations.Test;


//TestNG Alfabetik sırda çalıştırır bunu engellemek için priority verilir
public class _01_Giris {

    @Test(priority = 1)

    public void Test1(){

        System.out.println("1");


    }

    @Test(priority = 2)

    public void Test3(){

        System.out.println("2");

    }

    @Test(priority = 3)

    public void Test2(){

        System.out.println(3);


    }


}
