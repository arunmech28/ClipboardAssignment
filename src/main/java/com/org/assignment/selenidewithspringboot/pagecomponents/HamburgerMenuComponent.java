package com.org.assignment.selenidewithspringboot.pagecomponents;


import com.org.assignment.selenidewithspringboot.enums.MainMenuItemType;
import com.org.assignment.selenidewithspringboot.enums.SubMenuItemType;
import com.org.assignment.selenidewithspringboot.pages.ProductDetailsPage;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

@Component
public class HamburgerMenuComponent {

    public HamburgerMenuComponent selectMainMenuItem(MainMenuItemType itemType){
        $(byText(itemType.getName())).shouldBe(visible).click();
        return this;
    }

    public ProductDetailsPage selectSubMenuItem(SubMenuItemType itemType){
        $(byText(itemType.getName())).shouldBe(visible).click();
        return new ProductDetailsPage();
    }

}
