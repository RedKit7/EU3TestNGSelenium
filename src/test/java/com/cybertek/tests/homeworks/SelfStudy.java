package com.cybertek.tests.homeworks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelfStudy {



    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }


    @Test
    public void test1() throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/checkboxes']")).click();

        WebElement checkBox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        checkBox1.click();



        WebElement checkBox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        checkBox2.click();



        //Thread.sleep(2000);
        Assert.assertTrue(checkBox1.isSelected());
        Assert.assertFalse(checkBox2.isSelected());



     /*
        Thread.sleep(2000);


        Assert.assertTrue(checkBox1.isSelected());


        Assert.assertFalse(checkBox2.isSelected());



      */


    }



}
