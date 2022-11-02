package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //you should put everything in curlu braces if you use more that plugins for example
        plugin = {"html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
               "me.jvt.cucumber.report.PrettyReports:target/cucumber"
                },
        features = "src/test/resources/features", //reference from content root
        glue = "com/cydeo/step_definitions", //from source root, because runner class and runner at the same level (in the same package com.cydeo)
        tags ="@femaleScientists",
       dryRun = false
       // dryRun = false //to check if there is something unimplemented left
        //should be false, to see the implementations
        //if you want to run all of them just put the tag above the feature
        //if you want to run some of them just put tag on top of some scenarious
)
public class CukesRunner { //controls our framework, everything






}

