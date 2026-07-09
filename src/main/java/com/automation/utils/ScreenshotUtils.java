package com.automation.utils;

import com.automation.driver.DriverFactory;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class ScreenshotUtils {

    public static String takeScreenshot(String screenshotName){

        String folderPath = "target/screenshots/";
        String filePath = folderPath + screenshotName + ".png";
        try {

            File screenshot =
                    ((TakesScreenshot) DriverFactory.getDriver())
                            .getScreenshotAs(OutputType.FILE);

            Path destination =
                    Path.of(filePath);
            Files.createDirectories(destination.getParent());

            Files.copy(
                    screenshot.toPath(),
                    destination,
                    StandardCopyOption.REPLACE_EXISTING
            );
            return filePath;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}