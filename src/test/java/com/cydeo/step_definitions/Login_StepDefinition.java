package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinition {
    @Given("user is on the library login page")  //the gherkin word does not matter which one we use.
    //the only important thing is sentence in the parenthesis MUST be the same as from feature file
    public void user_is_on_the_library_login_page() {
        System.out.println("user is on the library login page");
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("user enters librarian username");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password");
    }
    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("user should see dashboard");
    }

    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("user enters student username");
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("user enters student password");
    }

    @When("user enters Admin username")
    public void userEntersAdminUsername() {
        System.out.println("user enters Admin username");
    }

    @And("user enters Admin password")
    public void userEntersAdminPassword() {
        System.out.println("user enters Admin password");
    }
}
