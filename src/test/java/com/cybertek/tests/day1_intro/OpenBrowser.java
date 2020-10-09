package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.WeakHashMap;

public class OpenBrowser {

    public static void main(String[] args) {

        // we have to enter this line every time we want to open chrome
        // HEY webdriver manager, can you make chrome ready for me for automation

        WebDriverManager.chromedriver().setup();

        // webdriver represents the browser
        // we are creating driver for browser
        // new chromedriver() -- >  this part will open chrome browser

        WebDriver driver = new ChromeDriver();

        // .get(url) method used for navigation to page
        driver .get("https://cybertekschool.com");



    /*
        //this line will allow selenium to automate firefox browser

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.facebook.com");


     */



    }


}
