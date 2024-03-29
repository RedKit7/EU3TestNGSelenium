package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tagNameLocator {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/sign_up");

        // send keys to fullname
        WebElement fullNameInput = driver.findElement(By.tagName("input"));
        fullNameInput.sendKeys("Mike S With tagElement");

        // send keys to email
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("Mike@S.com");

        //lazt one

      //  driver.findElement(By.name("input")).sendKeys("Mike@S.com");

        // lazy  way to click the button
        driver.findElement(By.tagName("button")).click();


        Thread.sleep(3000);

        driver.close();



    }
}
