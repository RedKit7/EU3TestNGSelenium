package com.cybertek.tests.day13_pom;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.CreateCalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatOptionTests extends TestBase {




        /*VERIFY RADIO BUTTONS
        Open browser
        Login as driver
        Go to Activities->Calendar Events
        Click on create calendar events
        Click on repeat
        Verify that repeat every days is checked
        verify that repeat weekday is not checked
        * */


        @Test
        public void test1(){


            LoginPage loginPage = new LoginPage();

            loginPage.loginAsDriver();


            DashboardPage dashboardPage = new DashboardPage();


            dashboardPage.navigateToModule("Activities", "Calendar Events");


            CalendarEventsPage calendarEventsPage = new CalendarEventsPage();


            calendarEventsPage.waitUntilLoaderScreenDisappear();
            BrowserUtils.waitForClickablility(calendarEventsPage.createCalendarEvent,5);
            calendarEventsPage.createCalendarEvent.click();


            CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();

            // Click on repeat
            createCalendarEventsPage.repeat.click();


            // Verify that repeat every days is checked

            Assert.assertTrue(createCalendarEventsPage.days.isSelected(),"Verify repeat days is selected");

            // Verify that repeat weekday is not checked

            Assert.assertFalse(createCalendarEventsPage.weekday.isSelected(),"Verify weekday is NOT selected");




         }



           /*
VERIFY REPEAT OPTIONS
   Open browser
   Login as driver
   Go to Activities->Calendar Events
   Click on create calendar events button
   Click on repeat checkbox
   Verify that repeat options are Daily, Weekly, Monthly,Yearly(in this order)
*/



    @Test
    public void test2(){

        LoginPage loginPage = new LoginPage();

        //Login as driver
        loginPage.loginAsDriver();

        DashboardPage dashboardPage = new DashboardPage();
        //Go to Activities->Calendar Events
        dashboardPage.navigateToModule("Activities","Calendar Events");

        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        //Click on create calendar events
        //wait for loader mask
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForClickablility(calendarEventsPage.createCalendarEvent,5);
        calendarEventsPage.createCalendarEvent.click();

        CreateCalendarEventsPage createCalendarEventsPage = new CreateCalendarEventsPage();
        // Click on repeat
        createCalendarEventsPage.repeat.click();

        Select repeatsDropdown = createCalendarEventsPage.repeatOptionsList();

        // Verify that repeat options are Daily, Weekly, Monthly,Yearly(in this order)
        List<String> expectedList = Arrays.asList("Daily","Weekly","Monthly","Yearly");

        List<String> actualList = new ArrayList<>();

        List<WebElement> actualOptions = repeatsDropdown.getOptions();
        for (WebElement option : actualOptions) {
            //get text of each element and add to actual List
            actualList.add(option.getText());
        }
        //ready method for getting text of list of web elements
        List<String> actualList2 = BrowserUtils.getElementsText(actualOptions);
        //Verify that repeat options are Daily, Weekly, Monthly,Yearly(in this order)
        Assert.assertEquals(actualList,expectedList,"Verify Daily weekly monthly yearly");





    }







}
