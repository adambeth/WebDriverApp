package com.adam.theinternet;

import com.adam.pages.dropDownPage;
import com.adam.pages.welcomePage;
import com.adam.utilites.testUtilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dropDownTest extends testUtilities {
    @Test
    public void dropDownTest(){

        welcomePage welcome = new welcomePage(driver,log);
        welcome.openPage();
        dropDownPage dropDown = welcome.openDropDown();

        dropDown.selectOptions(2);

        Assert.assertEquals(dropDown.getSelectedOptions(),"Option 2");

    }


}
