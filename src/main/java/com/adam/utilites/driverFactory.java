package com.adam.utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class driverFactory<driver> {
    private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    //private Logger loggger;


    public WebDriver getDriver(String browser) {

        switch (browser.toLowerCase()) {
            case ("chrome"):
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
                driver.set(new ChromeDriver());
                break;
            default:
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
                driver.set(new ChromeDriver());
                System.out.println("Default Selected");


        }

        return driver.get();

    }

}
