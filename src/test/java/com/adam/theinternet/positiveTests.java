package com.adam.theinternet;


import com.adam.pages.loginPage;
import com.adam.pages.securePage;
import com.adam.pages.welcomePage;
import com.adam.utilites.testUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class positiveTests extends testUtilities {

    @Test
    @Parameters({"username","password"})
    public void logInTest(String username, String password) {
        System.out.println("Starting logIn test");


        // open main page
        String url = "http://the-internet.herokuapp.com/";
        driver.get(url);
        //log.info("Opening Welcome Page");

        welcomePage welcome = new welcomePage(driver,log);
        loginPage login= welcome.clickFormAuthentication();
        //log.info("Clicking and navigating to Form authentication");

        securePage securePage = login.LogIn(username,password);
        //log.info("Creating Secure Page object");

        WebDriverWait wait = new WebDriverWait(driver, 10);


        // verifications
        // new url
        String expectedUrl = "http://the-internet.herokuapp.com/secure";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);

        // log out button is visible
        Assert.assertTrue(driver.findElement(By.xpath("//a[@class='button secondary radius']")).isDisplayed(),
                "logOutButton is not visible.");

        // Successful log in message
        String expectedSuccessMessage = "You logged into a secure area!";
        String actualSuccessMessage = driver.findElement(By.id("flash")).getText();
        Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage),
                "actualSuccessMessage does not contain expectedSuccessMessage\nexpectedSuccessMessage: "
                        + expectedSuccessMessage + "\nactualSuccessMessage: " + actualSuccessMessage);

    }
}
