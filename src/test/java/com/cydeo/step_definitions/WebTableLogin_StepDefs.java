package com.cydeo.step_definitions;

import com.cydeo.pages.PageBase;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.pages.WebTableOrderPage;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLogin_StepDefs {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    WebTableOrderPage webTableOrderPage = new WebTableOrderPage();
    PageBase pageBase = new PageBase();
    @Given("user is on the login page of the web table app")
    public void user_is_on_the_login_page_of_the_web_table_app() {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
    }
    @When("user enters user name {string}")
    public void user_enters_user_name(String username) {
    webTableLoginPage.inputUsername.sendKeys(username);
    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
    webTableLoginPage.inputPassword.sendKeys(password);
    }
    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
    webTableLoginPage.loginButton.click();
    }
    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));

        pageBase.orderButtonNavItem.click();

    }

    @When("user enters user name {string} password {string} and logins")
    public void userEntersUserNamePasswordAndLogins(String username, String password) {
//        webTableLoginPage.inputUsername.sendKeys(username);
//        webTableLoginPage.inputPassword.sendKeys(password);
//        webTableLoginPage.loginButton.click();

        webTableLoginPage.login(username, password);


    }

    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map<String,String> credentials) {
//        webTableLoginPage.inputUsername.sendKeys(credentials.get("username"));
//        webTableLoginPage.inputPassword.sendKeys(credentials.get("password"));
//        webTableLoginPage.loginButton.click();

        webTableLoginPage.login(credentials.get("username"), credentials.get("password"));
    }
}
