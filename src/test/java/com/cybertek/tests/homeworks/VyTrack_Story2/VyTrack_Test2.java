package com.cybertek.tests.homeworks.VyTrack_Story2;

import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VyTrack_Test2 extends TestBase {




    @Test
    public void test1() throws InterruptedException {

        LoginPage loginPage = new LoginPage();

        loginPage.loginAsStoreManager();


        DashboardPage dashboardPage = new DashboardPage();


        dashboardPage.navigateToModule("Fleet", "Vehicles");


        Thread.sleep(5000);




        driver.findElement(By.xpath("//a[@class=\"btn main-group btn-primary pull-right \"]")).click();

        //dashboardPage.waitUntilLoaderScreenDisappear();
        //driver.navigate();

       // Thread.sleep(7000);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("LR11XDD");

        WebElement seniorCheckBox = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]"));

        seniorCheckBox.click();

        Thread.sleep(3000);

        //System.out.println(seniorCheckBox);
        Assert.assertTrue(seniorCheckBox.isSelected());

        driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys("Red Kit");

        driver.findElement(By.xpath("(//input[@type=\"text\"])[4]")).sendKeys("London");

        driver.findElement(By.xpath("(//input[@type=\"number\"])[1]")).sendKeys("382944058");

        driver.findElement(By.xpath("(//input[@type=\"text\"])[5]")).sendKeys("2020");

        driver.findElement(By.xpath("(//input[@type=\"number\"])[2]")).sendKeys("80000");


        // Immatriculation Date :

        // First Contract Date :

        // Catalog Value (VAT Incl.) ($) :

        driver.findElement(By.xpath("(//input[@type=\"text\"])[10]")).sendKeys("25000");


        driver.findElement(By.xpath("(//input[@type=\"number\"])[3]")).sendKeys("5");

        driver.findElement(By.xpath("(//input[@type=\"number\"])[4]")).sendKeys("4");


        driver.findElement(By.xpath("(//input[@type=\"text\"])[11]")).sendKeys("Red");

/*
        driver.findElement(By.xpath("(//span[@class=\"select2-chosen\"])[1]")).click();


        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class=\"select2-result-label\"])[2]")).click();


        Thread.sleep(3000);
*/

        // Transmission :

        // Fuel Type :


        driver.findElement(By.xpath("//input[@name=\"custom_entity_type[CO2Emissions]\"]")).sendKeys("500");

        driver.findElement(By.xpath("(//input[@type=\"number\"])[5]")).sendKeys("4000");

        driver.findElement(By.xpath("//input[@name=\"custom_entity_type[HorsepowerTaxation]\"]")).sendKeys("100");

        driver.findElement(By.xpath("(//input[@type=\"number\"])[6]")).sendKeys("5000");


















    }

}
