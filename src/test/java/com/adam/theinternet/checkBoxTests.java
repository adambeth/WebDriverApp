package com.adam.theinternet;

        import com.adam.pages.checkBoxPage;
        import com.adam.pages.welcomePage;
        import com.adam.utilites.testUtilities;
        import org.testng.Assert;
        import org.testng.annotations.Test;

public class checkBoxTests extends testUtilities {



    @Test
    public void testCheckBoxes(){

        welcomePage welcome = new welcomePage(driver, log);
        welcome.openPage();
        checkBoxPage checkBoxPage = welcome.openCheckBox();
        checkBoxPage.selectAllCheckBoxes();

        Assert.assertEquals(checkBoxPage.areAllChecked(),true);


    }
}
