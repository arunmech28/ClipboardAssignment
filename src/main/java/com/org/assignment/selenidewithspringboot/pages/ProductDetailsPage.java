package com.org.assignment.selenidewithspringboot.pages;

import com.org.assignment.selenidewithspringboot.enums.BrandType;
import com.org.assignment.selenidewithspringboot.enums.SortByType;
import com.org.assignment.selenidewithspringboot.helpers.XpathHelper;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class ProductDetailsPage {

    private final String brands = "//span[@class='a-list-item']//span[text()='%s']";
    private final By sortBy = By.name("s");
    private final String items = "//h2";

    public ProductDetailsPage filterByBrand(BrandType brandType){
        String brandXpath = XpathHelper.getDynamicXpath(brands, brandType.getName());
        $x(brandXpath).shouldBe(visible).scrollTo().click();
        return this;
    }

    public ProductDetailsPage sortBy(SortByType sortByType){
        $(sortBy).selectOption(sortByType.getName());
        return this;
    }

    public ProductDescriptionPage selectNthPositionedItem(int positionOfItem){
        int indexOfItem = positionOfItem - 1;
        $$x(items).get(indexOfItem).shouldBe(visible).click();
        return new ProductDescriptionPage();
    }
}
