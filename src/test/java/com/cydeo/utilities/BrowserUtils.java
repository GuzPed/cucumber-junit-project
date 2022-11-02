package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    public static void sleep(int seconds) {
        //in utility classes it's better to use try/catch for exceptions
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("Exception happened in sleep method");
        }
    }

    public static void verifytitle( String expectedTitle){
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

    public static void  loginToSmartBear(){
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        WebElement userName = Driver.getDriver().findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        userName.sendKeys("Tester");

        WebElement passwrod = Driver.getDriver().findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        passwrod.sendKeys("test");

        WebElement loginBtn = Driver.getDriver().findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        loginBtn.click();

    }

    /**
     * THis method will accept dropdown as webElement and return all the options and return all the options text in a List of String
     * @return List<String>
     */
    public static List<String> dropdownOptionsAsString(WebElement dropdown){
        Select select= new Select(dropdown);
        List<WebElement> actualOptionsAsWebElement = select.getOptions();

        List<String> actualOptionsAsString = new ArrayList<>();

        for (WebElement each: actualOptionsAsWebElement){
            actualOptionsAsString.add(each.getText());
        }
        return actualOptionsAsString;
    }

    /**
     * This method will accept a group of radio buttons as a List<WebElements>
     *     it will loop through the List, and click the radioButton with provided attribute value
     * </WebElements>
     * @param radioButtons
     * @param attributeValue
     */
    public static void clickRadioButton( List<WebElement> radioButtons ,String attributeValue ) {
        for( WebElement each: radioButtons){
            if (each.getText().equalsIgnoreCase(attributeValue)){
                each.click();
            }
        }
    }







}
