package com.org.assignment.selenidewithspringboot.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BrandType {

    SAMSUNG("Samsung"),
    LG("LG");

    private final String name;

}
