package com.cydeo.pages.hioscar;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HioscarPage {

    public HioscarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//button[contains(@class,'Button_button__1_TCE')]")
    public WebElement searchButton;

    @FindBy (xpath = "(//div[@class='DropdownOverlayAttachment_triggerContainer__129mH'])[1]")
    public WebElement optionYear;

    @FindBy (id = "unnamed-20")
    public List<WebElement> option2023Or2022;


    @FindBy (xpath = "(//div[@class='DropdownOverlayAttachment_triggerContainer__129mH'])[2]")
    public WebElement coverageAccess;

    @FindBy (id = "unnamed-22")
    public List<WebElement> optionsOfCoverageAccess;

    @FindBy (xpath = "(//div[@class='DropdownOverlayAttachment_triggerContainer__129mH'])[3]")
    public WebElement networkPartner;

    @FindBy (id = "unnamed-28")
    public List<WebElement> optionsOfNetworkPartner;

    @FindBy (xpath = "(//div[@class='DropdownOverlayAttachment_triggerContainer__129mH'])[4]")
    public WebElement coverageArea;

    @FindBy (xpath = "unnamed-30")
    public List<WebElement> optionsOfCoverageArea;

    @FindBy (xpath ="//span[.='Continue']")
    public WebElement continueButton;



}
