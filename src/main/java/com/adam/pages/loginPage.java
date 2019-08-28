package com.adam.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends basePage {

    By username = By.id("username");
    By password = By.id("password");
    By btnLogin = By.className("radius");


    public loginPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public securePage LogIn(String uname, String pword){
        driver.findElement(username).sendKeys(uname);
        driver.findElement(password).sendKeys(pword);
        driver.findElement(btnLogin).click();
        return new securePage(driver, log);
    }


}
