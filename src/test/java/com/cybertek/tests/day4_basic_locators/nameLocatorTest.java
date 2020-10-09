package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //make browser fullscreen
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput = driver.findElement(By.name("full_name"));

        fullNameInput.sendKeys("ercan taylor");



       // Thread.sleep(2000);

       // driver.close();

        // put some email and click sign up button.


       // driver.get("http://practice.cybertekschool.com/sign_up");

    //    WebElement email = driver.findElement(By.name("email"));

     //   email.sendKeys("ercan_taylor@gmail.com");


        //lazy way
        driver.findElement(By.name("email")).sendKeys("ercan_taylor@gmail.com");


    //    // click
     //   WebElement clickTheButton = driver.findElement(By.name("wooden_spoon"));
    //    clickTheButton.click();


        //lazy way

        driver.findElement(By.name("wooden_spoon")).click();






    }
}
