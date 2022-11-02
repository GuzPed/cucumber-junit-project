package com.cydeo.step_definitions;

import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.awt.*;

public class WikiSearch_StepDef {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();
    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }
    @When("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
       wikiSearchPage.searchBox.sendKeys("Steve Jobs");
    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiSearchPage.submitBtn.click();
    }
    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        Assert.assertTrue("Title verification is failed",Driver.getDriver().getTitle().contains("Steve Jobs"));
    }

    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String searchWord) {
        wikiSearchPage.searchBox.sendKeys(searchWord);
    }
    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String expectedTitle) {
        Assert.assertTrue("Title verification is failed",Driver.getDriver().getTitle().contains(expectedTitle));
    }


    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String expectedHeader) {
        Assert.assertTrue(wikiSearchPage.headerWiki.getText().contains(expectedHeader));


    }

    @Then("User sees Steve Jobs is in the image header")
    public void userSeesSteveJobsIsInTheImageHeader() {
        Assert.assertTrue(wikiSearchPage.imageHeader.getText().contains("Steve Jobs"));
    }


}
