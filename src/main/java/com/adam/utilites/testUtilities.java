package com.adam.utilites;

public class testUtilities extends baseTest {


    // STATIC SLEEP
    protected void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
