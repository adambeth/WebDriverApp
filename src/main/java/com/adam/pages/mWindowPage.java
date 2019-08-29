package com.adam.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class mWindowPage extends basePage {
	
	
	protected By link = By.xpath("//div[@id='content']//a[@href='/windows/new']");

	public mWindowPage(WebDriver driver, Logger log) {
		super(driver, log);

	}
	
	public void clickLink() {

		driver.findElement(link).click();
		
		
	}
}