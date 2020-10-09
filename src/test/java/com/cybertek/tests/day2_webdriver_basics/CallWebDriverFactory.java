package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        
        driver.get("https://www.opheliaedu.com");

        String title = driver.getTitle();

        System.out.println("title = " + title);


        Thread.sleep(5000);

        driver.close();




    }
}
