package com.cybertek.tests.homeworks;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;
public class HoverTest {

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
    /**
     * hover over each image in the website
     * verify each name:user text is displayed
     */
    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");
        List<WebElement> elements = driver.findElements(By.cssSelector("[alt='User Avatar']"));
        List<WebElement> users = driver.findElements(By.partialLinkText("/users/"));
        for (WebElement element : elements) {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).perform();
            Thread.sleep(2000);
            Assert.assertTrue(element.isDisplayed() , "Verify each name:user text is displayed");
        }
    }
}
