package com.cybertek.tests.homeworks.VyTrack_Story2;

import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VyTrack_Test4 extends TestBase {




    @Test
    public void test1() throws InterruptedException {

        LoginPage loginPage = new LoginPage();

        loginPage.loginAsStoreManager();


        DashboardPage dashboardPage = new DashboardPage();


        dashboardPage.navigateToModule("Fleet", "Vehicles");


        dashboardPage.waitUntilLoaderScreenDisappear();

        // click on a car line to see a spesific car information
        driver.findElement(By.xpath("(//td[@class=\"string-cell grid-cell grid-body-cell grid-body-cell-LicensePlate\"])[1]")).click();


        // dashboardPage.waitUntilLoaderScreenDisappear();

        Thread.sleep(5000);

        // click on the "Edit" button
        driver.findElement(By.xpath("//a[@title=\"Edit Car\"]")).click();


      //  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Thread.sleep(5000);

        // click on the "Delete" button
        driver.findElement(By.xpath("//a[@title=\"Delete Car\"]")).click();


       // dashboardPage.waitUntilLoaderScreenDisappear();
        Thread.sleep(5000);

        // click on the "Yes Delete" button
        driver.findElement(By.xpath("/html/body/div[7]/div[3]/a[2]")).click();





    }

}
