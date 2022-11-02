package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTableViewAllOrdersPage extends  PageBase{

    @FindBy(xpath = "(//tbody//td[1])[1]")
    public WebElement tableViewAllOrders;

}
