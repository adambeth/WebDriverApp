package com.adam.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class welcomePage extends basePage {

    public welcomePage(WebDriver driver, Logger log) {
        super(driver, log);

    }

    private String url = "http://the-internet.herokuapp.com/";
    private By formAuthentication = By.linkText("Form Authentication");
    private By checkBoxes = By.xpath("//div[@id='content']/ul//a[@href='/checkboxes']");
    private By dropDown = By.xpath("//div[@id='content']/ul//a[@href='/dropdown']");

    public void openPage( ){
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

    public checkBoxPage clickCheckBox(){

        click(checkBoxes);
        return new checkBoxPage(driver,log);
    }

    public dropDownPage clickDropDown(){
        click(dropDown);
        return new dropDownPage(driver,log);
    }



}

