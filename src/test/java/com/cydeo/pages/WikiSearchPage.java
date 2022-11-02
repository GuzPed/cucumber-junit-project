package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiSearchPage {

    public WikiSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "searchInput")
    public WebElement searchBox;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement submitBtn;

    @FindBy (xpath = "//h1[@id='firstHeading']//span")
    public WebElement headerWiki;

    @FindBy (xpath = "//div[@class='fn']")
    public WebElement imageHeader;



}
