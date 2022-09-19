package com.org.assignment.selenidewithspringboot.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MainMenuItemType {

    MOBILES_AND_COMPUTERS("Mobiles, Computers"),
    TV_APPLIANCES_AND_ELECTRONICS("TV, Appliances, Electronics");

    private final String name;
}
