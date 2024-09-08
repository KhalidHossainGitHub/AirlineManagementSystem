/*
 * Khalid Hossain
 * November 26, 2023 | Individual Programming Assignment 1
 * File: Airline.java
 * Purpose: Airline class represents an airline with its ID, list of flights, 
 * and list of aircraft.
 */

import java.util.ArrayList;

public class Airline {
    private String id; // Airline ID
    private ArrayList<Flight> flights; // List of flights associated with the airline
    private ArrayList<Aircraft> aircraft; // List of aircraft associated with the airline

    // Constructor to initialize airline details
    public Airline(String id, ArrayList<Flight> flights, ArrayList<Aircraft> aircraft) {
        this.id = id;
        this.flights = flights;
        this.aircraft = aircraft;
    }

    // Getter method to retrieve the airline ID
    public String getId() {
        return id;
    }

    // Getter method to retrieve the list of flights associated with the airline
    public ArrayList<Flight> getFlights() {
        return flights;
    }

    // Getter method to retrieve the list of aircraft associated with the airline
    public ArrayList<Aircraft> getAircraft() {
        return aircraft;
    }

    // Requirement 3: Method to add an aircraft to the list of aircraft owned by the airline
    public void owns(Aircraft aircraft) {
        if (!this.aircraft.contains(aircraft)) {
            this.aircraft.add(aircraft);
        }
    }

    // Requirement 4: Method to print the list of flights owned by the airline
    public void printFlightByName() {
        for (Flight f : flights) {
            System.out.println("Flight ID: " + f.getId() + ", Aircraft: " + f.getAircraft().getName()
                    + ", Arrival Time: " + f.getArrivalTime() + ", Departure Time: " + f.getDepartureTime());
        }
    }

    // Requirement 6: Method to retrieve the list of pilots working for the airline
    public ArrayList<Pilots> pilotsWorkingForAirlines() {
        ArrayList<Pilots> workingPilots = new ArrayList<>();
        for (Aircraft a : aircraft) {
            workingPilots.addAll(a.getPilots());
        }
        return workingPilots;
    }

    // Requirement 7: Method to get the list of departure flights from a specific airport
    public ArrayList<Flight> getDepartureFlightByAirport(Airport airport) {
        ArrayList<Flight> departureFlights = new ArrayList<>();
        for (Flight f : flights) {
            if (f.getDepartureAirport().equals(airport)) {
                departureFlights.add(f);
            }
        }
        return departureFlights;
    }

    // Requirement 8: Method to get the list of arrival flights at a specific airport
    public ArrayList<Flight> getArrivalFlightByAirport(Airport airport) {
        ArrayList<Flight> arrivalFlights = new ArrayList<>();
        for (Flight f : flights) {
            if (f.getArrivalAirport().equals(airport)) {
                arrivalFlights.add(f);
            }
        }
        return arrivalFlights;
    }
}
