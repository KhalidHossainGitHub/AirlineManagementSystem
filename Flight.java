/*
 * Khalid Hossain
 * November 26, 2023 | Individual Programming Assignment 1
 * File: Flight.java
 * Purpose: Flight class represents a flight with its name, departure time, arrival time,
 * departure airport, arrival airport, and associated aircraft.
 */

import java.util.Date;

public class Flight {
    private String flightName; // Flight name
    private Date departureTime; // Departure time of the flight
    private Date arrivalTime; // Arrival time of the flight
    private Airport departureAirport; // Departure airport of the flight
    private Airport arrivalAirport; // Arrival airport of the flight
    private Aircraft aircraftName; // Name of aircraft 

    // Constructor to initialize flight details
    public Flight(String flightName, Date departureTime, Date arrivalTime,
    Airport departureAirport, Airport arrivalAirport, Aircraft aircraftName) {
        this.flightName = flightName;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.aircraftName = aircraftName;
    }

    // Getter method to retrieve the flight name
    public String getFlightName() {
        return flightName;
    }

    // Getter method to retrieve the departure time of the flight
    public Date getDepartureTime() {
        return departureTime;
    }

    // Getter method to retrieve the arrival time of the flight
    public Date getArrivalTime() {
        return arrivalTime;
    }

    // Getter method to retrieve the departure airport of the flight
    public Airport getDepartureAirport() {
        return departureAirport;
    }

    // Getter method to retrieve the arrival airport of the flight
    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    // Getter method to retrieve the associated aircraft of the flight
    public Aircraft getAircraft() {
        return aircraftName;
    }

    // Getter method to retrieve the ID of the flight
    public String getId() {
        return flightName;
    }
}
