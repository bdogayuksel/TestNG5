package gun04;

import org.testng.annotations.*;

public class _01_Intro {
     /*
     @BeforeSuite
       @BeforeTest
         @BeforeGroup
           @BeforeClass
             @BeforeMethod
                 @Test1 method
                 @Test2 method
             @AfterMethod
           @AfterClass
         @AfterGroup
       @AfterTest
     @AfterSuite
   */


    @BeforeSuite
    void bSuite(){
        System.out.println("before suit");
    }
    @BeforeTest
    void bTest(){
        System.out.println("before test");
    }

    @BeforeGroups
    void bGroups(){
        System.out.println("before groups");
    }

    @BeforeClass
    void bClass(){
        System.out.println("before class");
    }
    @BeforeMethod

    void bMethod(){
        System.out.println("before method");
    }

    @Test
    void Intro1_Test1() {
        System.out.println("Intro_1-> Test1");
    }

    @Test
    void Intro1_Test2() {
        System.out.println("Intro_1-> Test2");
    }

    @AfterMethod

    void aMethod(){

        System.out.println("After method");
    }

    @AfterClass

    void aClass(){

        System.out.println("After class");
    }

    @AfterGroups

    void aGroups(){

        System.out.println("After groups");

    }

    @AfterTest

    void aTest(){

        System.out.println("After test");

    }

    @AfterSuite

    void aSuite(){

        System.out.println("After suite");

    }
}


