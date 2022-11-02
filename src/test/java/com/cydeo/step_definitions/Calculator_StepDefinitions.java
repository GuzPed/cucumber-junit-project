package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Calculator_StepDefinitions {

    int actualResukt ;
    @Given("Calculator is open")
    public void calculator_is_open() {
        System.out.println("This is from Given");
    }
    @When("I add {int} with {int}")
    public void i_add_with(int int1, int int2) {
        System.out.println(" when i add " + int1 + " with " + int2 );
        actualResukt = int1+int2;
    }
    @Then("I should get {int}")
    public void i_should_get(int expectedResult) {
        System.out.println("Then I should get " + expectedResult);
        Assert.assertEquals(actualResukt, expectedResult);
    }


}
