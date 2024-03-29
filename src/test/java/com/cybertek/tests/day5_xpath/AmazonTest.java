package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.*;

public class AmazonTest {

        /**
         * TASK
         * go to amazon.com
         * search for selenium
         * click search button
         * verify 1-48 of 304 results for "selenium"
         *
         */

        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = WebDriverFactory.getDriver("chrome");

            driver.get("https://www.amazon.co.uk/");

            WebElement searcBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

            searcBox.sendKeys("Selenium");


            //click the search button
            driver.findElement(By.xpath("//input[@value='Go']")).click();


            WebElement result = driver.findElement(By.xpath("//span[contains(text(), 'results for')]"));

            String resultText = result.getText();

            System.out.println("resultText = " + resultText );

            String expectedResult  = "resultText = 1-48 of over 1,000 results for";


            if (expectedResult.equals(resultText)){
                System.out.println("PASS");
            }else {
                System.out.println("FAIL");
                System.out.println("expextedResult = " + expectedResult);
                System.out.println("resultText = " + resultText);
            }


            Thread.sleep(3000);

            driver.quit();



    }
}
