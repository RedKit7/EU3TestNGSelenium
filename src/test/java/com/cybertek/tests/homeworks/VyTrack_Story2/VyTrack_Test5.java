package com.cybertek.tests.homeworks.VyTrack_Story2;

import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class VyTrack_Test5 extends TestBase {



    @Test

      public void test1 () throws InterruptedException {

        LoginPage loginPage = new LoginPage();

        loginPage.loginAsStoreManager();


        DashboardPage dashboardPage = new DashboardPage();


        dashboardPage.navigateToModule("Fleet", "Vehicles");


        //dashboardPage.waitUntilLoaderScreenDisappear();

        Thread.sleep(5000);

        // click on create car button
        driver.findElement(By.xpath("//a[@class=\"btn main-group btn-primary pull-right \"]")).click();

/*
        //WebDriver driver = new ChromeDriver();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,1000)");

*/
        Thread.sleep(5000);


        driver.findElement(By.xpath("//*[@id=\"custom_entity-update\"]/div/div/ul/li[2]/a")).click();


        Thread.sleep(3000);


        //vehicle model add button
        driver.findElement(By.xpath("(//button[@type=\"button\"])[1]")).click();



        dashboardPage.waitUntilLoaderScreenDisappear();

        driver.findElement(By.xpath("(//input[@tabindex=\"-1\"])[9]")).click();

        driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();



        Thread.sleep(4000);



        //vehicle make add button

        driver.findElement(By.xpath("(//button[@type=\"button\"])[2]")).click();

        dashboardPage.waitUntilLoaderScreenDisappear();

        driver.findElement(By.xpath("(//input[@tabindex=\"-1\"])[9]")).click();

        driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();

        Thread.sleep(3000);

    }

}
