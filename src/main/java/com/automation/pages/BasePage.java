package com.automation.pages;

import com.automation.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import org.openqa.selenium.WebElement;


import java.time.Duration;

public class BasePage {

    protected WebDriverWait wait;

    public BasePage(){
        wait = new WebDriverWait(
                DriverFactory.getDriver(),
                Duration.ofSeconds(10)
        );
    }

    protected WebElement find(By locator){

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        );
    }

    protected void click(By locator){
        wait.until(
                ExpectedConditions.elementToBeClickable(locator)
        ).click();
    }

    protected void write(By locator, String text){
        WebElement element = find(locator);
        element.clear();
        element.sendKeys(text);
    }

    protected String getText(By locator){
        return find(locator)
                .getText();
    }

    protected boolean isDisplayed(By locator){

        try{
            return wait.until(
                    ExpectedConditions
                            .visibilityOfElementLocated(locator)
            ).isDisplayed();
        }catch(Exception e){
            return false;
        }
    }

    protected WebDriver getDriver() {
        return DriverFactory.getDriver();
    }

    protected List<WebElement> findAll(By locator) {
        return getDriver().findElements(locator);
    }

    public void waitSeconds(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}