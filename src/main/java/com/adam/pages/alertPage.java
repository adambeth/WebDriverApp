package com.adam.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class alertPage extends basePage {


    private By clickForJSAlertButtonLocator = By.xpath("//button[text()='Click for JS Alert']");
    private By clickForJSConfirmButtonLocator = By.xpath("//button[text()='Click for JS Confirm']");
    private By clickForJSPromptButtonLocator = By.xpath("//button[text()='Click for JS Prompt']");
    private By resultTextLocator = By.id("result");

    public alertPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    /** Clicking on 'Click for JS Alert' button to open alert */

    public void clickJSAlert(){
        click(clickForJSAlertButtonLocator);
    }
    /** Clicking on 'Click for JS Confirm' button to open alert */

    public void clickJSConfirm(){
        click(clickForJSConfirmButtonLocator);

    }

    /** Clicking on 'Click for JS Prompt' button to open alert */
    public void clickJSPrompt(){
        click(clickForJSPromptButtonLocator);

    }
    /** Switch to alert and get it's message */

    public String getAlertText(){
        Alert alert =switchToAlert();
        String alertText = alert.getText();
        return alertText;

    }

    /** Switch to alert and press OK */
    public void acceptAlert(){
        Alert alert = switchToAlert();
        alert.accept();

    }

    /** Switch to alert and press Cancel */

    public void dismissAlert(){
        Alert alert = switchToAlert();
        alert.dismiss();

    }
}
