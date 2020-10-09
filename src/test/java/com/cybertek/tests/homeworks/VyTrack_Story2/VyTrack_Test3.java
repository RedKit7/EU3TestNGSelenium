package com.cybertek.tests.homeworks.VyTrack_Story2;

import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VyTrack_Test3 extends TestBase {





    @Test
    public void test1() throws InterruptedException {

        LoginPage loginPage = new LoginPage();

        loginPage.loginAsStoreManager();


        DashboardPage dashboardPage = new DashboardPage();


        dashboardPage.navigateToModule("Fleet", "Vehicles");


        dashboardPage.waitUntilLoaderScreenDisappear();

        // click on create car button
        driver.findElement(By.xpath("//a[@class=\"btn main-group btn-primary pull-right \"]")).click();

        // click on cancel button

        dashboardPage.waitUntilLoaderScreenDisappear();

        driver.findElement(By.xpath("//a[@title=\"Cancel\"]")).click();



        //driver.navigate();

        // Thread.sleep(7000);

        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);






    }


}
