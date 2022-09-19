package com.org.assignment.selenidewithspringboot.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SubMenuItemType {

    TELEVISION("Televisions"),
    HEADPHONES("Headphones");

    private final String name;
}
