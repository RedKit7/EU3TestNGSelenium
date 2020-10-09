package com.cybertek.tests.day6_css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssLocator {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver( "chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");


        //"#" (hash) button and provide the id value ..
        WebElement dontClick = driver.findElement(By.cssSelector("#disappearing_button"));
        System.out.println(dontClick.getText());

        Thread.sleep(1000);
        driver.quit();





    }
}
