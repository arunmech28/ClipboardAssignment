package com.org.assignment.selenidewithspringboot.selenidewithspringboot.base;

import com.codeborne.selenide.WebDriverRunner;
import com.org.assignment.selenidewithspringboot.driver.DriverSetup;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.testcontainers.containers.BrowserWebDriverContainer;

import java.io.File;

public class TestSetUp {

//    @Rule
//    public BrowserWebDriverContainer chrome =
//            new BrowserWebDriverContainer()
//                    .withRecordingMode(BrowserWebDriverContainer.VncRecordingMode.RECORD_ALL, new File("build")).
//                    .withCapabilities(driverSetup);
//
//    @Before
//    public void setUp() {
//        RemoteWebDriver driver = chrome.getWebDriver();
//        WebDriverRunner.setWebDriver(driver);
//    }

    @Autowired
    private DriverSetup driverSetup;

    @BeforeEach
    public void setUpDriver(){
        driverSetup.setUpConfiguration().loadUrl();
    }

}
