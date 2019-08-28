package com.adam.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class welcomePage extends basePage {

    public welcomePage(WebDriver driver, Logger log) {
        super(driver, log);

    }

    private String url = "http://the-internet.herokuapp.com/";
    By formAuthentication = By.linkText("Form Authentication");


    public void openPage(String url ){
        log.info("opening Page");
        System.out.println("Opening http://the-internet.herokuapp.com/");
        openUrl(url);
        System.out.println("Page Opened");
    }


    public loginPage clickFormAuthentication(){
        click(formAuthentication);
        System.out.println("Form authentication clicked");
        return new loginPage(driver,log);
    }


}

