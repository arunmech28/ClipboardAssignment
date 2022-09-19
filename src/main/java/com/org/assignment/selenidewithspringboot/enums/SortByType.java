package com.org.assignment.selenidewithspringboot.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SortByType {

    PRICE_HIGH_TO_LOW("Price: High to Low"),
    NEWEST_ARRIVALS("Newest Arrivals");

    private final String name;
}
