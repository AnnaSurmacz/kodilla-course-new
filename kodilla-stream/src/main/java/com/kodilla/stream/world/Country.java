package com.kodilla.stream.world;
import java.math.BigDecimal;

public class Country {
    private final String nameOfCountry;
    private final BigDecimal peopleQuantity;

    public Country(final String nameOfCountry, final BigDecimal peopleQuantity) {
        this.nameOfCountry = nameOfCountry;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}