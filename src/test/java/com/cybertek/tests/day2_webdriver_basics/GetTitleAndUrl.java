package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {


    public static void main(String[] args) {


        // Task open chorome and navigate to


       WebDriverManager.chromedriver().setup();

       WebDriver driver = new ChromeDriver();

       driver.get("http://practice.cybertekschool.com");

        // getting title with selenium
        // shortcut for creating variable
        // option or ALT +enter enter
        // getTitle() get you title of the page

       String title = driver.getTitle();

       
       // soutv + enter to print variable name and value
       System.out.println("title = " + title);


       // getCurrentUrl -- > get the url from browser
        // short get --> option ++ 2 enter
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);




       // get pageSource ()--> get source of the page
       String pageSource = driver.getPageSource();
       System.out.println("pageSource = " + pageSource);







    }

}
