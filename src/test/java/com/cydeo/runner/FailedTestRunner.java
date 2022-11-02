package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",  // I want to run this file, this is why we give path to it
        glue = "com/cydeo/step_definitions"
)
//first fix the issue then run failed once

public class FailedTestRunner {



}
