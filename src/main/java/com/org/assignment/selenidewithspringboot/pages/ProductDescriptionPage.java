package com.org.assignment.selenidewithspringboot.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.SelenideElement;
import com.org.assignment.selenidewithspringboot.helpers.BrowserWindowHelper;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductDescriptionPage {

    private final By productFeatures = By.xpath("//h1[text()=' About this item ']/following-sibling::ul/li/span");
    private final String aboutThisItem = "About this item";

    public ProductDescriptionPage checkWhetherAboutThisItemSectionPresent(){
        BrowserWindowHelper.switchToNthPositionedWindow(2);
        $(withText(aboutThisItem)).scrollTo().shouldHave(visible);
        return this;
    }

    public void printAboutThisSectionToConsole(){
        $$(productFeatures).shouldBe(CollectionCondition.sizeGreaterThan(0))
                .asFixedIterable()
                .stream()
                .map(SelenideElement::getText)
                .forEach(System.out::println);
    }
}
