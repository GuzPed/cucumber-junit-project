package com.cydeo.pages.wytrack;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackLoginPage {

    public VyTrackLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (id = "prependedInput")
    public WebElement inputUsername;

    @FindBy (id = "prependedInput2")
    public WebElement inputPassword;

    @FindBy (id = "_submit")
    public WebElement submitButton;


 public void login(String username, String password){
     inputUsername.sendKeys(username);
     inputPassword.sendKeys(password);
     submitButton.click();
 }



}
