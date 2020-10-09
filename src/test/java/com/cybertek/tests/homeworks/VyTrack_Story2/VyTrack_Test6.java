package com.cybertek.tests.homeworks.VyTrack_Story2;

import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class VyTrack_Test6 extends TestBase {



    @Test

    public void test1 () throws InterruptedException {

        LoginPage loginPage = new LoginPage();

        loginPage.loginAsStoreManager();

        DashboardPage dashboardPage = new DashboardPage();

        //dashboardPage.waitUntilLoaderScreenDisappear();
        
         Thread.sleep(5000);

        // new event button
        driver.findElement(By.xpath("(//*[@href=\"javascript:void(0);\"])[5]")).click();

        Thread.sleep(3000);

        //TITLE
        driver.findElement(By.xpath("(//*[@data-required=\"data-required\"])[1]")).sendKeys("COO");

/*
        Thread.sleep(2000);
        //Description
        driver.findElement(By.xpath("//*[@id=\"tinymce\"]")).sendKeys("Branches Coordination");
*/



        driver.findElement(By.xpath("(//*[@class=\"color\"])[5]")).click();

        //driver.findElement(By.xpath("//*[@id=\"oro_calendar_event_form_calendarUid-uid-5f798adc669bc\"]")).click();


        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();


        Thread.sleep(2000);
        dashboardPage.navigateToModule("Activities","Calendar Events");



    }

}
