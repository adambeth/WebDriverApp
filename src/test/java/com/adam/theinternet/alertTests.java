package com.adam.theinternet;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.adam.pages.alertPage;
import com.adam.pages.welcomePage;
import com.adam.utilites.testUtilities;

public class alertTests extends testUtilities {

	@Test
	public void clickAlerts() {

		welcomePage welcome = new welcomePage(driver, log);
		welcome.openPage();
		alertPage alerts = welcome.openJSAlerts();
		alerts.clickJSConfirm();

		Assert.assertEquals(alerts.getAlertText(), "I am a JS Confirm");
		alerts.acceptAlert();

		Assert.assertEquals(alerts.getResultText(), "You clicked: Ok");

	}
	
	@Test
	public void dismissAlert() {
		

		welcomePage welcome = new welcomePage(driver, log);
		welcome.openPage();
		alertPage alerts = welcome.openJSAlerts();
		alerts.clickJSConfirm();
		
		alerts.dismissAlert();
		String resultText = alerts.getResultText();
		
		Assert.assertEquals(resultText, "You clicked: Cancel");
		
	
	}

}
