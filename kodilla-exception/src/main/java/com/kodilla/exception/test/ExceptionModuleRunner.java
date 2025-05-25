package com.kodilla.exception.test;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();

        Flight flight1 = new Flight("Warsaw", "London");
        Flight flight2 = new Flight("Warsaw", "Barcelona");


        try {
            boolean canFly = flightFinder.findFlight(flight1);
            System.out.println("Flight to " + flight1.getArrivalAirport() + " is " + (canFly ? "available." : "unavailable."));
        } catch (RouteNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            boolean canFly = flightFinder.findFlight(flight2);
            System.out.println("Flight to " + flight2.getArrivalAirport() + " is " + (canFly ? "available." : "unavailable."));
        } catch (RouteNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

