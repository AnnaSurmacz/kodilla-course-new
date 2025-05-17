package com.kodilla.stream.world;
import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final String nameOfContinent;
    private final List<Country> countries = new ArrayList<>();

    public Continent(String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public List<Country> getCountries() {
        return countries;
    }
}