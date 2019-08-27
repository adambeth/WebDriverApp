package com.adam.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class welcomePage {
    private WebDriver driver;
    private String url = "http://the-internet.herokuapp.com/";
    private Logger log;

    By formAuthentication = By.linkText("Form Authentication");

    public welcomePage(WebDriver driver) {
        this.driver = driver;
        this.log = log;
    }


    public void openPage(String url){
        System.out.println("Opening http://the-internet.herokuapp.com/");
        driver.get(url);
        System.out.println("Page Opened");
    }


    public void clickFormAuthentication(){
        driver.findElement(formAuthentication).click();
        System.out.println("Form authentication clicked");
    }


}

