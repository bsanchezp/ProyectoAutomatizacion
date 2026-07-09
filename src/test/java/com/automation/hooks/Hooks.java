package com.automation.hooks;

import com.automation.driver.DriverFactory;
import com.automation.utils.ConfigReader;

import com.automation.utils.ScreenshotUtils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

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
    public void tearDown(Scenario scenario){

        if(scenario.isFailed()){
            String screenshotName =
                    scenario.getName()
                            .replace(" ", "_");

            byte[] screenshot =
                    ((org.openqa.selenium.TakesScreenshot)
                            DriverFactory.getDriver())
                            .getScreenshotAs(
                                    org.openqa.selenium.OutputType.BYTES
                            );
            scenario.attach(
                    screenshot,
                    "image/png",
                    screenshotName
            );

            ScreenshotUtils.takeScreenshot(
                    screenshotName
            );
        }

        DriverFactory.quitDriver();
    }
}