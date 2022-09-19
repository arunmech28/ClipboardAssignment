package com.org.assignment.selenidewithspringboot.helpers;

public final class XpathHelper {

    public static String getDynamicXpath(String xpath, String replacingString){
        return String.format(xpath,replacingString);
    }

}
