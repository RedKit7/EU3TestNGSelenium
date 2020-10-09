

package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){ PageFactory.initElements(Driver.get(),this); }

    //driver.findElement(By.id("prependedInput"));
    //@FindBy means = we use to initialise web elements on page object model
    @FindAll({  // will have a look 1 of them if one of them is correct
            @FindBy(id = "prependedInput"),
            @FindBy(name ="_username")
    })

    public WebElement usernameInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    // driver. findelement(By.id("_submit"));
    @FindBy(id = "_submit")
    public WebElement loginBtn;



    public void login(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

    public void loginAsStoreManager(){

        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }


    public void loginAsDriver(){

        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }








}


