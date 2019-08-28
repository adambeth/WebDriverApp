package com.adam.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class checkBoxPage extends basePage {

    public checkBoxPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    private By box1 = By.xpath("//form[@id='checkboxes']/input[1]");
    private By box2 = By.xpath("//form[@id='checkboxes']/input[2]");
    private By checkbox = By.xpath("//input[@type='checkbox']");


    public void clickCheckBox(By locator){

        driver.findElement(locator).click();

    }

    public void selectAllCheckBoxes(){

        List<WebElement> checkBoxList = findAll(checkbox);
        for(WebElement checkbox : checkBoxList){
            if(!checkbox.isSelected()){
                checkbox.click();
            }
        }
    }
    /** check all the check boxes are selected*/

    public boolean areAllChecked(){
        List<WebElement> checkboxList = findAll(checkbox);
        for (WebElement checkbox : checkboxList){

            if (checkbox.isSelected()){
                return true;
            }
        }
        return false;
    }


}
