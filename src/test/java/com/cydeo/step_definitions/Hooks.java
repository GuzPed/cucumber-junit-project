package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

//    @Before
//    public void setupScenario(){
//        System.out.println("setting up browser using cucumber @Before each scenario");
    //  Driver.getDriver().get("url");
//    }


    @After
    public void tearDownScenario(Scenario scenario){
        // we will implement taking screenshot in this method
        // System.out.println("closing browser using cucumber @After each scenario");

        //picture has pixels, we will store them in bytes

        if(scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());

        }

        Driver.closeDriver();
    }

    //FOR taking a screenshot we use this HOOKS class, so we will use @After each scenario it will take a screenshot

}
