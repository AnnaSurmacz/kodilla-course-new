package com.kodilla.good.patterns.challenges;

public class Address {
    private final String street;
    private final String city;
    private final String zipCode;
    private final String homeNumber;

    public Address(final String street, final String city, final String zipCode, final String homeNumber) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.homeNumber = homeNumber;

    }
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }
    public String zipCode() {
        return zipCode;

    }
    public String HomeNumber() {
        return homeNumber;

    }

}

