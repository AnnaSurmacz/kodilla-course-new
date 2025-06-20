package com.kodilla.good.patterns.flights;

import java.util.Set;
import java.util.stream.Collectors;

    public class FlightService {
        private final Set<Flight> flights;

        public FlightService(Set<Flight> flights) {
            this.flights = flights;
        }

        public Set<Flight> findFlightsFrom(String from) {
            return flights.stream()
                    .filter(f -> f.getDeparture().equalsIgnoreCase(from))
                    .collect(Collectors.toSet());
        }


        public Set<Flight> findFlightsTo(String to) {
            return flights.stream()
                    .filter(f -> f.getArrival().equalsIgnoreCase(to))
                    .collect(Collectors.toSet());
        }
    }


