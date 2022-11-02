package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_StepDefinition {
 EtsyPage etsyPage = new EtsyPage();

    @Given("User is on Etsy homepage")
    public void user_is_on_etsy_homepage() {
        Driver.getDriver().get("https://www.etsy.com ");
    }
    @When("User sees title is as expected Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone")
    public void user_sees_title_is_as_expected_etsy_shop_for_handmade_vintage_custom_and_unique_gifts_for_everyone() {
        Assert.assertEquals("Failed title verification", "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone", Driver.getDriver().getTitle() );
    }


    @When("User enters Wooden Spoon in search box")
    public void user_enters_wooden_spoon_in_search_box() {
        etsyPage.searchBox.sendKeys("Wooden Spoon");
    }
    @When("User clicks submit button")
    public void user_clicks_submit_button() {
        etsyPage.submitBtn.click();
    }
    @Then("User sees Wooden Spoon in the title")
    public void user_sees_wooden_spoon_in_the_title() {
        Assert.assertTrue("Failed verification", Driver.getDriver().getTitle().contains("Wooden spoon"));
    }

    @When("User enters {string} in search box")
    public void user_enters_in_search_box(String searchWord) {
        etsyPage.searchBox.sendKeys(searchWord);
    }


    @Then("User sees {string} in the title")
    public void userSeesInTheTitle(String expectedTitle) {
        Assert.assertTrue("Failed verification", Driver.getDriver().getTitle().contains(expectedTitle));
    }
}
