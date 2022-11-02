package com.cydeo.pages.smartbear_project;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SmartBearPage {

    public SmartBearPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (linkText = "Order")
    public WebElement orderPage;

    @FindBy (xpath = "//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")
    public WebElement product;

    @FindBy (id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;

    @FindBy (id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerName;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement state;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zip;

    @FindBy (xpath = "//table[@id='ctl00_MainContent_fmwOrder_cardList']//label")
    public List<WebElement> visa;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumber;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement date;

    @FindBy (id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processBtn;

@FindBy (xpath = "//a[.='View all orders']")
    public WebElement viewAllOrderPage;

@FindBy (xpath = "//table[@id='ctl00_MainContent_orderGrid']//td[2]")
    public List<WebElement> allNamesInTable;


}
