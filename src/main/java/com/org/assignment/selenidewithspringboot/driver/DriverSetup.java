package com.org.assignment.selenidewithspringboot.driver;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DriverSetup {

    @Value("${runmode:local}")
    private String runMode;

    @Value("${application.url}")
    private String applicationUrl;

    @Value("${browser:chrome}")
    private String browser;

    @Value("${remote.url:http://localhost:4444/wd/hub}")
    private String remoteUrl;

    @Value("${selenide.browserSize}")
    private String browserSize;

    @Value("${selenide.timeout}")
    private long timeout;

    public DriverSetup setUpConfiguration(){

        Configuration.browserSize = browserSize;
        Configuration.timeout = timeout;

        if(runMode.equalsIgnoreCase("local")) {
            if (browser.equalsIgnoreCase("firefox")) {
                Configuration.browser = "firefox";
            } else {
//                Configuration.browserVersion = "105.0.5195.125";
                WebDriverManager.chromedriver().driverVersion("104.0.5112.79").setup();
            }
        }
        else {
            Configuration.remote = remoteUrl;
            if(browser.equalsIgnoreCase("firefox")){
                Configuration.browserCapabilities = getFirefoxCapabilities();
            }
            else {
                Configuration.browserCapabilities = getChromeCapabilities();
            }
        }
        return this;
    }

    public void loadUrl(){
        Selenide.open(applicationUrl);
    }

    private MutableCapabilities getFirefoxCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("firefox");
        capabilities.setCapability("enableVNC",true);
        return capabilities;
    }

    public MutableCapabilities getChromeCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setCapability("enableVNC",true);
        return capabilities;
    }

}
