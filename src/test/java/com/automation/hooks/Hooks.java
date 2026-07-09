package com.automation.hooks;

import com.automation.driver.DriverFactory;
import com.automation.utils.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        DriverFactory.initializeDriver();
        DriverFactory
                .getDriver()
                .get(
                        ConfigReader.get("base.url")
                );
    }
    @After
    public void tearDown(){
        DriverFactory.quitDriver();
    }
}