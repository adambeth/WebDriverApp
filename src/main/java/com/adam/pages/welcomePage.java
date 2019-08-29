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
    private By checkBoxes = By.xpath("//a[@href='/checkboxes']");
    private By dropDown = By.xpath("//a[@href='/dropdown']");
    private By javaScriptAlerts = By.xpath("//a[@href='/javascript_alerts']");
    private By multiWindow = By.xpath("//div[@id='content']/ul//a[@href='/windows']");


    public void openPage( ){
        log.info("opening Page");
        System.out.println("Opening http://the-internet.herokuapp.com/");
        openUrl(url);
        System.out.println("Page Opened");
    }


    public loginPage openFormAuthentication(){

        click(formAuthentication);
        System.out.println("Form authentication clicked");
        return new loginPage(driver,log);
    }

    public checkBoxPage openCheckBox(){

        click(checkBoxes);
        return new checkBoxPage(driver,log);
    }

    public dropDownPage openDropDown(){
        click(dropDown);
        return new dropDownPage(driver,log);
    }
    public alertPage openJSAlerts(){
        click(javaScriptAlerts);
        return new alertPage(driver, log);

    }
    
    public mWindowPage openMultiWindow() {
    	
    	click(multiWindow);
    	return new mWindowPage(driver,log);
    }


}

