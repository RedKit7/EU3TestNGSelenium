package com.cybertek.tests.homeworks.VyTrack_Story2;

import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VyTrack_Test1 extends TestBase {


    /*
    1.Verify that Store manager or sales manager should be able to see all vehicle information
    once navigate to Vehicle page

     */


    @Test
    public void test1() throws InterruptedException {

        LoginPage loginPage = new LoginPage();

        loginPage.loginAsStoreManager();


        DashboardPage dashboardPage = new DashboardPage();


        dashboardPage.navigateToModule("Fleet", "Vehicles");


        Thread.sleep(5000);


        String actualurl = driver.getCurrentUrl();
        String expectedurl = "https://qa1.vytrack.com/entity/Extend_Entity_Carreservation";

        System.out.println(actualurl);
        System.out.println(expectedurl);

        Assert.assertEquals(actualurl,expectedurl);


    }


    @Test

    public void test2 () throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://qa2.vytrack.com/user/login");

        WebElement UsernameBox = driver.findElement(By.xpath("//input[@type=\"text\"]"));

        UsernameBox.sendKeys("storemanager51");

        WebElement PasswordBox = driver.findElement(By.xpath("//input[@type=\"password\"]"));

        PasswordBox.sendKeys("UserUser123");

        WebElement LogIn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));

        LogIn.click();


        Thread.sleep(5000);
        WebElement FleetButton = driver.findElement(By.xpath("(//span[@class=\"title title-level-1\"])[2]"));

        FleetButton.click();

        WebElement VehiclesButton = driver.findElement(By.xpath("(//span[@class=\"title title-level-2\"])[4]"));

        VehiclesButton.click();


        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://qa2.vytrack.com/entity/Extend_Entity_Carreservation";


        Assert.assertEquals(actualUrl,expectedUrl);

        Thread.sleep(5000);

        driver.quit();



    }





}
