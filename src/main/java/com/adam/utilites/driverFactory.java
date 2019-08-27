package com.adam.utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class driverFactory<driver> {
    private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    private String browser;

    public driverFactory(String browser) {
        this.browser = browser;
    }

    public WebDriver createDriver() {

        switch (this.browser.toLowerCase()) {
            case ("chrome"):
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
                driver.set(new ChromeDriver());
                break;
            case ("firefox"):
                System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
                driver.set(new FirefoxDriver());
                break;
            default:
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
                driver.set(new ChromeDriver());
                System.out.println("Default Selected");

        }

        return driver.get();

    }

}
