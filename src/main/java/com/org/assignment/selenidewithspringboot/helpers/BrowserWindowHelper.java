package com.org.assignment.selenidewithspringboot.helpers;

import com.codeborne.selenide.Selenide;

public final class BrowserWindowHelper {

    public static void switchToNthPositionedWindow(int positionOfWindow){
        int indexOfWindow = positionOfWindow - 1;
        Selenide.switchTo().window(indexOfWindow);
    }
}
