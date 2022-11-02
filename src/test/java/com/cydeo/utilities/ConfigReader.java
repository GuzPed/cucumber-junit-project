package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //or name  =  ConfigurationReader

    //create an Object for Properties class
    //we need Properties class to use methods coming from class like load(), getProperty()
    //it is static, because we use it in static method and n static block
    //it is private because i will be using it in this class
    private static Properties properties =new Properties();

    //we want to open properties file and load properties object only once before reading
    //having static block because static runs once
    static{
        try {
            //create an Object of FileInputStream
            // we need this object to open file as a stream in java memory
            FileInputStream file = new FileInputStream("config.properties");
            //load the properties object using FileInputStream object
            //Load "properties" object with the "file" we opened using FileInputStream
            properties.load(file);

            //close the file  after loading
            //if we do not close, it will stay in java memory like scanner
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //this method is used to read the value from the config.properties file
    //@param key --> key name in configuration.properties file
    //@return --> value for the key.returns null if key is not found
    //driver.get(configReader.getProrertiy("env"))

    public static String getProperty(String key){
        return properties.getProperty(key);
    }



}
