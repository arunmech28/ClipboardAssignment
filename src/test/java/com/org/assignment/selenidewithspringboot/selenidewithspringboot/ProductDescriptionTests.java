package com.org.assignment.selenidewithspringboot.selenidewithspringboot;

import com.org.assignment.selenidewithspringboot.selenidewithspringboot.base.TestSetUp;
import com.org.assignment.selenidewithspringboot.enums.BrandType;
import com.org.assignment.selenidewithspringboot.enums.MainMenuItemType;
import com.org.assignment.selenidewithspringboot.enums.SortByType;
import com.org.assignment.selenidewithspringboot.enums.SubMenuItemType;
import com.org.assignment.selenidewithspringboot.pages.HomePage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductDescriptionTests extends TestSetUp {

	@Autowired
	private HomePage homePage;

	@Test
	void testAmazonProductDetails() {
		homePage.navigateToProductDetailsPage(MainMenuItemType.TV_APPLIANCES_AND_ELECTRONICS, SubMenuItemType.TELEVISION)
				.filterByBrand(BrandType.SAMSUNG)
				.sortBy(SortByType.PRICE_HIGH_TO_LOW)
				.selectNthPositionedItem(2)
				.checkWhetherAboutThisItemSectionPresent() //Assertion
				.printAboutThisSectionToConsole();
	}

}
