package com.automation.pages;

import com.automation.driver.DriverFactory;
import com.automation.utils.ConfigReader;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        this.driver = DriverFactory.getDriver();
        this.wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(
                        ConfigReader.getInt("explicit.wait")
                )
        );
    }
    public void waitSeconds(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    protected void click(By locator) {
        wait.until(
                ExpectedConditions.elementToBeClickable(locator)
        ).click();
    }

    protected void write(By locator, String text) {
        WebElement element =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(locator)
                );
        element.clear();
        element.sendKeys(text);
    }

    protected String getText(By locator) {
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        ).getText();
    }

    protected boolean isDisplayed(By locator) {
        try {
            return wait.until(
                    ExpectedConditions.visibilityOfElementLocated(locator)
            ).isDisplayed();

        } catch (TimeoutException e) {
            return false;
        }
    }

    protected void openUrl(String url){
        driver.get(url);
    }

    protected String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    protected void refreshPage(){
        driver.navigate().refresh();
    }

    protected void scrollToElement(By locator){
        WebElement element =
                wait.until(
                        ExpectedConditions.presenceOfElementLocated(locator)
                );
        JavascriptExecutor js =
                (JavascriptExecutor) driver;
        js.executeScript(
                "arguments[0].scrollIntoView(true);",
                element
        );
    }
}