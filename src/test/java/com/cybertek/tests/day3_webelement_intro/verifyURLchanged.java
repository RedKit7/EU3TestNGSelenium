package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.WeakHashMap;

public class verifyURLchanged {

    public static void main(String[] args) {


        /* Verify URL changed
        -open chrome browser
        -go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        - enter any email
        -click on Retrieve password
        -verify that url changed to http://practice.cybertekschool.com/email_sent
    */

        // open the browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // go to the page
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any email
        WebElement emailInputBox = driver.findElement(By.name("email"));


        //sendKeys() -- > send keybord action to the webelement
        emailInputBox.sendKeys("mike@cybertek.com");


        // click
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();
        

        // save actual url after click the button
        String actualUrl = driver.getCurrentUrl();




        // -verify that url changed to http://practice.cybertekschool.com/email_sent

         String expectedUrl = "http://practice.cybertekschool.com/email_sent";





        // -verify that url did not change

        if (expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("expectedUrl = " + expectedUrl);
            System.out.println("actualUrl = " + actualUrl);
        }


       driver.quit();


    }
}
