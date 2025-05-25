package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> availableAirports = new HashMap<>();
        availableAirports.put("Warsaw", true);
        availableAirports.put("Berlin", false);
        availableAirports.put("London", true);
        availableAirports.put("Madrid", true);

        if (!availableAirports.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Route to " + flight.getArrivalAirport() + " not found.");
        }
        String arrival = flight.getArrivalAirport();
        return availableAirports.get(arrival);
    }
}