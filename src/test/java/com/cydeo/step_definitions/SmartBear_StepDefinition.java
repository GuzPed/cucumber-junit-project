package com.cydeo.step_definitions;

import com.cydeo.pages.smartbear_project.SmartBearLoginPage;
import com.cydeo.pages.smartbear_project.SmartBearPage;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SmartBear_StepDefinition {

    SmartBearPage smartBearPage = new SmartBearPage();
    SmartBearLoginPage smartBearLoginPage = new SmartBearLoginPage();


    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get(ConfigReader.getProperty("SmartBearURL"));
       smartBearLoginPage.login();

    }
    @When("User fills out the form as followed:")
    public void user_fills_out_the_form_as_followed() {
        smartBearPage.orderPage.click();
    }
    @When("User selects {string} from product dropdown")
    public void userSelectsFromProductDropdown(String selectOption){
        Select select = new Select(smartBearPage.product);
        select.selectByVisibleText(selectOption);

    }
    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String quantity) {
        smartBearPage.quantity.sendKeys(quantity);
    }
    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String customerName) {
        smartBearPage.customerName.sendKeys(customerName);
    }
    @When("User enters {string} to street")
    public void user_enters_to_street(String street) {
    smartBearPage.street.sendKeys(street);
    }
    @When("User enters {string} to city")
    public void user_enters_to_city(String city) {
    smartBearPage.city.sendKeys(city);
    }
    @When("User enters {string} to state")
    public void user_enters_to_state(String state) {
    smartBearPage.state.sendKeys(state);
    }
    @When("User enters {string}")
    public void user_enters(String zip) {
    smartBearPage.zip.sendKeys(zip);
    }
    @When("User selects {string} as card type")
    public void user_selects_visa_as_card_type(String cardType) {
    for (WebElement each: smartBearPage.visa){
        if (each.getText().equals(cardType)){
            each.click();
        }}}
    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String cardNumber) {
    smartBearPage.cardNumber.sendKeys(cardNumber);
    }
    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String date) {
    smartBearPage.date.sendKeys(date);
    }
    @When("User clicks process button")
    public void user_clicks_process_button() {
    smartBearPage.processBtn.click();
    }
    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String nameInTheList) {
        smartBearPage.viewAllOrderPage.click();
        List<String> names = new ArrayList<>();
        for (WebElement each: smartBearPage.allNamesInTable){
                names.add(each.getText());
            }
       Assert.assertTrue(names.contains(nameInTheList));
    }
    }
