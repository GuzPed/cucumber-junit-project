package com.cydeo.step_definitions;

import com.cydeo.pages.hioscar.HioscarPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hioscar_SetDefs {
 HioscarPage hioscarPage = new HioscarPage();
    Actions actions = new Actions(Driver.getDriver());

 WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30);

    @Given("user on the homepage")
    public void user_on_the_homepage() {
        Driver.getDriver().get("https://www.hioscar.com/care-options");
    }
    @When("user clicks Search button")
    public void user_clicks_search_button() {
        hioscarPage.searchButton.click();

    }
    @When("from Coverage year dropdown Select {int} option")
    public void from_coverage_year_dropdown_select_option(Integer int1) {

        actions.moveToElement(hioscarPage.optionYear).click().build().perform();
     //   wait.until(ExpectedConditions.elementToBeClickable(hioscarPage.optionYear)).click();

        for (WebElement each: hioscarPage.option2023Or2022){

            if (each.getText().equalsIgnoreCase(String.valueOf(int1))){
               // actions.moveToElement(each).click().perform();
                wait.until(ExpectedConditions.visibilityOf(each)).click();
            }
        }
    }
    @And("from Coverage access dropdown Select {string} option")
    public void fromCoverageAccessDropdownSelectOption(String arg0) {

       actions.moveToElement(hioscarPage.coverageAccess).click().build().perform();
      //  wait.until(ExpectedConditions.elementToBeClickable(hioscarPage.coverageAccess)).click();

        for (WebElement each: hioscarPage.optionsOfCoverageAccess){

            if (each.getText().equalsIgnoreCase(arg0)){
               // actions.moveToElement(each).click().perform();
                wait.until(ExpectedConditions.visibilityOf(each)).click();
            }
        }

    }

    @And("from Network partner dropdown Select {string}")
    public void fromNetworkPartnerDropdownSelect(String arg0) {

        actions.moveToElement(hioscarPage.networkPartner).click().build().perform();

      //  wait.until(ExpectedConditions.elementToBeClickable(hioscarPage.networkPartner)).click();
       // BrowserUtils.sleep(2);
        for (WebElement each: hioscarPage.optionsOfNetworkPartner){

            if (each.getText().equalsIgnoreCase(arg0)){
                //actions.moveToElement(each).click().perform();
                wait.until(ExpectedConditions.visibilityOf(each)).click();
            }
        }
    }

    @And("from Coverage area dropdown Select {string}")
    public void fromCoverageAreaDropdownSelect(String arg0) {
        actions.moveToElement(hioscarPage.coverageArea).click().build().perform();

        for (WebElement each: hioscarPage.optionsOfCoverageArea){

            if (each.getText().equalsIgnoreCase(arg0)){
                //actions.moveToElement(each).click().perform();
                wait.until(ExpectedConditions.visibilityOf(each)).click();
            }
        }
    }
    @When("click Continue button")
    public void click_continue_button() {
        hioscarPage.continueButton.click();

    }
    @Then("verify title contains “Oscar”")
    public void verify_title_contains_oscar() {

    }



}
