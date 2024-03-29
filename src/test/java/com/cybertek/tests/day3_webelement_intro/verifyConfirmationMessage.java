package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {

    public static void main(String[] args) throws InterruptedException {

     /*

        Verify confirmation message
        open browser
        go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        enter any email
        verify that email is displayed in the input box
        click on Retrieve password
        verify that confirmation message says ‘Your e-mail’s been sent!’
        */


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInput = driver.findElement(By.name("email"));

        String expectedEmail = "mike@cybertek.com";

        emailInput.sendKeys(expectedEmail);


        // somehow we should get text from web elements
        // two main ways to get txt from web elements
        // 1. getText() -- >> it will work %99 and it will return string
        // 2. getAttribute("value") -->> second way of getting text especially input boxes


        String actualEmail = emailInput.getAttribute("value");
        System.out.println("actualEmail = " + actualEmail);



        // verify that email is displayed in the input box

        if (expectedEmail.equals(actualEmail)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("expectedUrl = " + expectedEmail);
            System.out.println("actualUrl = " + actualEmail);
        }


        // click
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();



        // verify that confirmation message says "Your e-mail's been sent!"

        WebElement actualConfirmationMessage  = driver.findElement(By.name("confirmation_message"));


        System.out.println(actualConfirmationMessage.getText());


        // expected message
        String expectedMessage = "Your e-mail's been sent!";

        // actual message
        String actualMessage = actualConfirmationMessage.getText();


        if (expectedMessage.equals(actualMessage)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("expectedUrl = " + expectedMessage);
            System.out.println("actualUrl = " + actualMessage);
        }


        Thread.sleep(2000);

        driver.quit();


    }
}
