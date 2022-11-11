package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    //create private constractor, so we are closing the access to the object of this class
    //from outside code
    private Driver(){}

    //making our 'driver' instanve private, so that it is not reachable from outside the class
    //we are making it static, so we want it to run before anything else
    //also we will use it in static method
    private static InheritableThreadLocal <WebDriver> driverPool = new InheritableThreadLocal<>();

    //creae reusable utility method which will return same driver instance when we call it
    public static WebDriver getDriver(){
        if(driverPool.get()==null){
            String browser = ConfigReader.getProperty("browser");

            //depending on the browserType our switch statement will determine to open specific type of browser/driver
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":

                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

            }

        }
        //same driver instance will be returned every time we call Driver.getDriver() method
        return driverPool.get();
    }

    public static void closeDriver(){
        if (driverPool.get()!=null){
            driverPool.get().quit();
            driverPool.remove();
        }
}}

