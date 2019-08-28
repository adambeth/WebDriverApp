package com.adam.theinternet;


import com.adam.pages.loginPage;
import com.adam.pages.securePage;
import com.adam.pages.welcomePage;
import com.adam.utilites.testUtilities;
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
        welcomePage welcome = new welcomePage(driver,log);
        welcome.openPage();
        loginPage login= welcome.openFormAuthentication();
        securePage securePage = login.LogIn(username,password);

        WebDriverWait wait = new WebDriverWait(driver, 10);


        // verifications
        // new url
        String expectedUrl = "http://the-internet.herokuapp.com/secure";
        Assert.assertEquals(securePage.getPageUrl(), expectedUrl);

        // log out button is visible
        Assert.assertTrue(securePage.isLogOutButtonVisible(),
                "logOutButton is not visible.");

        // Successful log in message
        String expectedSuccessMessage = "You logged into a secure area!";
        String actualSuccessMessage = securePage.getSuccessMessage();
        Assert.assertTrue(actualSuccessMessage.contains(expectedSuccessMessage),
                "actualSuccessMessage does not contain expectedSuccessMessage\nexpectedSuccessMessage: "
                        + expectedSuccessMessage + "\nactualSuccessMessage: " + actualSuccessMessage);

    }
}
