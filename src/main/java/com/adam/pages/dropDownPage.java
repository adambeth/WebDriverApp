package com.adam.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropDownPage extends basePage {

    private By dropDownList = By.id("dropdown");

    public dropDownPage(WebDriver driver, Logger log) {
        super(driver, log);
    }


    public void selectOptions(int i) {
        WebElement dropDownElement = find(dropDownList);
        Select dropdown = new Select(dropDownElement);
        dropdown.selectByIndex(i);

    }

    public String getSelectedOptions(){
        WebElement dropDownElement = find(dropDownList);
        Select dropdown = new Select(dropDownElement);
        String selectedValue = dropdown.getFirstSelectedOption().getText();
        return selectedValue;

    }


}
