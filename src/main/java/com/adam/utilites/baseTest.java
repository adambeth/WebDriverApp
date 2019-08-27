package com.adam.utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class baseTest {


    protected WebDriver driver;


    //set up before every test
    @Parameters({"browser"})
    @BeforeMethod(alwaysRun = true)
    public void setUp(@Optional("chrome") String browser) {

        driverFactory factory = new driverFactory(browser);
        driver = factory.createDriver();

    }

    //tear down after every test
    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        System.out.println("Close driver");
        // Close browser
        driver.quit();
    }


}
