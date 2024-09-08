/*
 * Khalid Hossain
 * November 26, 2023 | Individual Programming Assignment 1
 * File: Aircraft.java
 * Purpose: Aircraft class represents an aircraft with its name, state, flight state,
 * and a list of associated pilots.
 */

import java.util.ArrayList;

public class Aircraft {
    private String name; // Aircraft name
    private String state; // Aircraft state: working/under repair
    private String flightState; // Flight state of the aircraft: landed/airborne
    private ArrayList<Pilots> pilots; // List of all pilots associated with the aircraft

    // Constructor to initialize aircraft details
    public Aircraft(String name, String state, String flightState, ArrayList<Pilots> pilots) {
        this.name = name;
        this.state = state;
        this.flightState = flightState;
        this.pilots = pilots;
    }

    // Getter method to retrieve the aircraft name
    public String getName() {
        return name;
    }

    // Getter method to retrieve the aircraft state
    public String getState() {
        return state;
    }

    // Getter method to retrieve the flight state of the aircraft
    public String getFlightState() {
        return flightState;
    }

    // Getter method to retrieve the list of pilots associated with the aircraft
    public ArrayList<Pilots> getPilots() {
        return pilots;
    }

    // Requirement 1: Method to add a pilot to the list of pilots for this aircraft
    public void joinPilot(Pilots pilot) {
        pilots.add(pilot);
    }

    // Requirement 2: Method to print the list of pilots for this aircraft
    public void printPilots() {
        for (Pilots pilot : pilots) {
            System.out.println("Pilot Name: " + pilot.getPilotName() + ", ID: " + pilot.getPilotID()
                    + ", Position: " + pilot.getPilotPosition());
        }
    }
}
