package com.adam.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class securePage extends basePage {

    public securePage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    private String pageUrl = "http://the-internet.herokuapp.com/secure";
    private By loginButton = By.xpath("//a[@class='button secondary radius']");
    private By message = By.id("flash-messages");

    /**
     * Get URL variable from PageObject
     */
    public String getPageUrl() {
        return pageUrl;
    }

    /**
     * Verification if logOutButton is visible on the page
     */

    public boolean isLogOutButtonVisible() {

        return driver.findElement(loginButton).isDisplayed();
    }


    /**
     * Return text from success message
     */

    public String getSuccessMessage() {
        return find(message).getText();
    }

}
