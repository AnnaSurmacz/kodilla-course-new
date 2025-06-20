package com.kodilla.good.patterns.flights;
import java.util.Set;

public class FlightsApp {
    public static void main(String[] args) {
        Set<Flight> flights = Set.of(
                new Flight("Gdańsk", "Wrocław"),
                new Flight("Gdańsk", "Kraków"),
                new Flight("Kraków", "Wrocław"),
                new Flight("Wrocław", "Gdańsk"),
                new Flight("Wrocław", "Kraków")
        );

        FlightService service = new FlightService(flights);

        System.out.println("Loty z Gdańska: " + service.findFlightsFrom("Gdańsk"));
        System.out.println("Loty do Wrocławia: " + service.findFlightsTo("Wrocław"));

    }
}