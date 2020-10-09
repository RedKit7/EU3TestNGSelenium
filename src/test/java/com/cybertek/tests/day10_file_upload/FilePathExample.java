package com.cybertek.tests.day10_file_upload;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FilePathExample {


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

    // i am getting my project location dinamicly
    // the dinamic path who want to use same project with me ...

    @Test
    public void test1(){
   //  /Users/ercancotenoglu/IdeaProjects/EU3TestNGSelenium/src/test/resources/textfile.txt
        System.out.println(System.getProperty("name.os"));

        System.out.println(System.getProperty("user.dir"));

        // getting my project from this part
        String projectPath = System.getProperty("user.dir");

        // this is the static part ...
        String filePath =  "src/test/resources/textfile.txt";

        // this is fullpath dinamicly for you
        String fullPath = projectPath+"/"+filePath;

        System.out.println(fullPath);

    }












}
