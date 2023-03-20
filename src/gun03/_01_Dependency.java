package gun03;

import org.testng.annotations.Test;

//dependsOnMethods-> bulunduğu testin çalışması bir koşula bağlı
//bağımlı bir testi çalıştırırsak bağımlı olduğuda çalışır (2 üste kadar)



public class _01_Dependency {

    @Test
    void startCar(){
        System.out.println("startCar");
    }

    @Test (dependsOnMethods = {"startCar"})
    void driveCar(){
        System.out.println("driveCar");

    }

    @Test (dependsOnMethods = {"startCar", "driveCar"})
    void parkCar(){
        System.out.println("parkCar");
    }


    //alwaysRun-> dependency olmasada çalışssın(hep çalışır)
    @Test (dependsOnMethods = {"parkCar"}, alwaysRun = true)
    void stopCar(){
        System.out.println("stopCar");
    }


}
