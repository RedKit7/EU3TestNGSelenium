package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElements {



    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");


        WebElement greenRadioButton = driver.findElement(By.id("green"));

        greenRadioButton.click();

        // how to check any web element is enabled or NOT ?

        System.out.println("greenRadioButton = " + greenRadioButton);
        Assert.assertFalse(greenRadioButton.isEnabled(), "verify green radio button NOT enabled (disabled)");

        greenRadioButton.click();

    }

        @Test
        public void test2() throws InterruptedException {


            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();

            driver.get("http://practice.cybertekschool.com/dynamic_controls");

            WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input"));

            inputBox.sendKeys("some message");


            Thread.sleep(3000);
            driver.quit();



    }

}
