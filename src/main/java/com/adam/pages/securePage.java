package com.adam.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class securePage {

    private WebDriver driver;
    private Logger log;

    public securePage(WebDriver driver, Logger log) {
        this.driver = driver;
        this.log = log;
    }
}
