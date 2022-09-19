package com.org.assignment.selenidewithspringboot.pages;

import com.org.assignment.selenidewithspringboot.enums.MainMenuItemType;
import com.org.assignment.selenidewithspringboot.enums.SubMenuItemType;
import com.org.assignment.selenidewithspringboot.pagecomponents.HamburgerMenuComponent;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

@Component
public class HomePage {

    @Autowired
    HamburgerMenuComponent hamburgerMenuComponent;

    private final By hamburgerButton = By.id("nav-hamburger-menu");

    private HomePage clickHamburger(){
        $(hamburgerButton).shouldBe(visible, enabled).click();
        return this;
    }

    public ProductDetailsPage navigateToProductDetailsPage(MainMenuItemType mainMenuItemType, SubMenuItemType subMenuItemType){
        return clickHamburger()
                .hamburgerMenuComponent
                .selectMainMenuItem(mainMenuItemType)
                .selectSubMenuItem(subMenuItemType);
    }

}
