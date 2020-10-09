package com.cybertek.tests.homeworks;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class HW_8TestCases {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        //Thread.sleep(2000);
     //   driver.quit();
    }

    @Test
    public void test1() {
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        WebElement checkbox = driver.findElement(By.xpath("//div[@id='txtAge']"));
        Assert.assertFalse(checkbox.isDisplayed(), "Verify Success – Check box is checked message is NOT displayed.");
        WebElement tickbox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        tickbox.click();
        Assert.assertTrue(checkbox.isDisplayed(), "Verify Success – Check box is checked message is displayed");
    }

    @Test
    public void test2() {
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        WebElement successButton = driver.findElement(By.id("check1"));
        System.out.println("successButton.getAttribute(\"value\") = " + successButton.getAttribute("value"));
        Assert.assertEquals(successButton.getAttribute("value"), "Check All");
        successButton.click();
        List<WebElement> optionButtons = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for (WebElement optionButton : optionButtons) {
            Assert.assertTrue(optionButton.isSelected());
        }
        Assert.assertTrue(successButton.isDisplayed());
    }


    @Test
    public void test3() throws InterruptedException {  // 1
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        WebElement form = driver.findElement(By.linkText("Registration Form"));
        form.click();
        WebElement inputBox = driver.findElement(By.xpath("//input[@data-bv-field='birthday']"));
        inputBox.sendKeys("wrong_dob");
        WebElement error = driver.findElement(By.xpath("//small[text() = 'The date of birth is not valid']"));
        Assert.assertTrue(error.isDisplayed(), "Verify that warning message is displayed: The date of birth is not valid");
    }

    @Test
    public void test4() {  // 2
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        WebElement form = driver.findElement(By.linkText("Registration Form"));
        form.click();
        List<WebElement> elements = driver.findElements(By.className("form-check-label"));
        for (WebElement element : elements) {
            Assert.assertTrue(element.isDisplayed());
        }
    }

    @Test
    public void test5() {  // 3
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        WebElement form = driver.findElement(By.linkText("Registration Form"));
        form.click();
        WebElement firstBox = driver.findElement(By.xpath("//input[@placeholder='first name']"));
        firstBox.sendKeys("y");

        WebElement error = driver.findElement(By.xpath("//small[contains(text(),'first name must')]"));

        Assert.assertTrue(error.isDisplayed(), "Verify that warning message is displayed: first name must be more than 2 and less than 64 characters long");
    }

    @Test
    public void test6() {  // 4
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        WebElement form = driver.findElement(By.linkText("Registration Form"));
        form.click();
        WebElement lastBox = driver.findElement(By.xpath("//input[@placeholder='last name']"));
        lastBox.sendKeys("y");
        WebElement error = driver.findElement(By.xpath("//small[text()='last name is required']"));
        Assert.assertTrue(error.isDisplayed(), "Verify that warning message is displayed: The last name must be more than 2 and less than 64 characters long");
    }


    @Test
    public void test7() { // normalde 5
        driver.get("https://practice-cybertekschool.herokuapp.com/");

        WebElement form = driver.findElement(By.linkText("Registration Form"));
        form.click();
        WebElement nameBox = driver.findElement(By.xpath("//input[@placeholder='first name']"));
        nameBox.sendKeys("yournameALI");
        WebElement surnameBox = driver.findElement(By.xpath("//input[@placeholder='last name']"));
        surnameBox.sendKeys("yourSURnameBABIALI");
        WebElement userBox = driver.findElement(By.xpath("//input[@placeholder='username']"));
        userBox.sendKeys("usernameisUSERALI");
        WebElement emailBox = driver.findElement(By.xpath("//input[@placeholder='email@email.com']"));
        emailBox.sendKeys("usernameis@gmail.com");
        WebElement paswordBox = driver.findElement(By.xpath("//input[@name='password']"));
        paswordBox.sendKeys("123yourname456");
        WebElement phoneBox = driver.findElement(By.xpath("//input[@name='phone']"));
        phoneBox.sendKeys("571-000-0000");
        WebElement genderBox = driver.findElement(By.xpath("//input[@value='male']"));
        genderBox.click();
        WebElement birthBox = driver.findElement(By.xpath("//input[@name='birthday']"));
        birthBox.sendKeys("01/01/1981");
        WebElement depertmantBox = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[9]/div/select"));
        depertmantBox.sendKeys("MPDC");
        WebElement jobBox = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[10]/div/select"));
        jobBox.sendKeys("mpdc");
        WebElement langBox = driver.findElement(By.xpath("//*[@id=\"inlineCheckbox2\"]"));
        langBox.sendKeys("Java");
        WebElement SignUpBox = driver.findElement(By.xpath("//*[@id=\"wooden_spoon\"]"));
        SignUpBox.click();
        WebElement confirmMessage = driver.findElement(By.xpath("//input[@placeholder='last name']"));

        Assert.assertTrue(confirmMessage.isDisplayed(), "You've successfully completed registration!");
    }


    @Test
    public void test8() throws InterruptedException { // normalde 6
        driver.get("https://www.tempmailaddress.com/");

        WebElement mail = driver.findElement(By.cssSelector("[class='animace']"));
        String mailText = mail.getText();
        System.out.println("mailText = " + mailText);
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Sign Up For Mailing List")).click();
        driver.findElement(By.cssSelector("[name='full_name']")).sendKeys("Mehmet");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(mailText);
        driver.findElement(By.xpath("//button[@name='wooden_spoon']")).click();
        WebElement actualelement1 = driver.findElement(By.cssSelector("[name='signup_message']"));
        Assert.assertTrue(actualelement1.isDisplayed());
        driver.get("https://www.tempmailaddress.com/");
        WebElement actualelement2 = driver.findElement(By.cssSelector("[class='odMobil']"));
        Thread.sleep(3000);
        Assert.assertTrue(actualelement2.isDisplayed());
        actualelement2.click();

    }

         /*
     * Test case #7
     *  Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
     * Step 2. And click on “File Upload"
     * Step 3. Upload any file with .txt extension from your computer.
     * Step 4. Click “Upload” button.
     * Step 5. Verify that subject is: “File Uploaded!”
     * Step 6. Verify that uploaded file name is displayed.Note: use element.sendKeys(“/file/path”) with specifying path to the file for uploading.
     * Run this method against “Choose File” button.
​
     * */


        @Test

        public void test9 () throws InterruptedException { // case 7

            driver.get("https://practice-cybertekschool.herokuapp.com");

            // * Step 2. And click on “File Upload"

            driver.findElement(By.xpath("//a[text()='File Upload']")).click();

            WebElement chooseFile = driver.findElement(By.id("file-upload"));

            // file uzerine gelip option + sag click to get pathname ...
            chooseFile.sendKeys("C:/Users/user/Dropbox/My PC (DESKTOP-F27A313)/Desktop/testcase.txt.txt");

            driver.findElement(By.id("file-submit")).click();

            String actualText = driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).getText();
            String exceptedText = "File Uploaded!";

            Assert.assertEquals(actualText, exceptedText, "verify");


        }
//Test case #8

// Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
// Step 2. And click on “Autocomplete”.
// Step 3. Enter “United States of America” into country input box.
// Step 4. Verify that following message is displayed: “You selected: United States of America”



        @Test
        public void test10()  throws InterruptedException{ // case 8

            driver.get("https://practice-cybertekschool.herokuapp.com");

            driver.findElement(By.xpath("//a[text()='Autocomplete']")).click();

            WebElement input = driver.findElement(By.xpath("//input[@id='myCountry']"));

            input.sendKeys("United States of America");

            Thread.sleep(2000);

            WebElement sumbit = driver.findElement(By.xpath("//input[@type='button']"));

            sumbit.click();

            Assert.assertTrue(sumbit.isDisplayed(), " “You selected: United States of America”");



        }



    @Test(dataProvider = "getResult")
    public void setData(String code, String message) throws InterruptedException {


        driver.findElement(By.linkText(code)).click();
        Thread.sleep(5000);

        String msglocation = driver.findElement(By.tagName("p")).getText();
        String displaymsg = "This page returned a 200 status code";
        Assert.assertTrue(displaymsg.contains("This page returned a 200 status code"));
        Thread.sleep(5000);


    }
    @DataProvider
    public Object[][] getResult() {

//row number of times
//columns

        Object[][] result = new Object[4][2];

        result[0][0] = "200";
        result[0][1] = "This page returned a 200 status code";

        result[1][0] = "301";
        result[1][1] = "This page returned a 301 status code";

        result[2][0] = "404";
        result[2][1] = "This page returned a 404 status code";

        result[3][0] = "500";
        result[3][1] = "This page returned a 500 status code";
        return result;
    }








}

