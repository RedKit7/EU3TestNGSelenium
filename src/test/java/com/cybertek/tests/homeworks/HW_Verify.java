package com.cybertek.tests.homeworks;

import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW_Verify extends TestBase {



    /**
     * open the chrome
     * go to qa1.vytrack
     * login as a sales manager
     * navigate to customers ->contacts
     * click on email mbrackstone9@example.com
     * verify that full name is Mariam Brackstone
     * verify that email is mbrackstone9@example.com
     * verify that phone number is +18982323434
     */


    @Test
    public void test1() throws InterruptedException {

        LoginPage loginPage = new LoginPage();

        loginPage.loginAsStoreManager();


        DashboardPage dashboardPage = new DashboardPage();


        dashboardPage.navigateToModule("Customers", "Contacts");

        dashboardPage.waitUntilLoaderScreenDisappear();

        // click the email
        driver.findElement(By.xpath("(//*[@data-column-label=\"First name\"])[5]")).click();

        WebElement name = driver.findElement(By.xpath("//h1[@class=\"user-name\"]"));

        System.out.println(name);

        Assert.assertTrue(name.isDisplayed(),"verify that name is displayed");
    }
}
