/*
 * Khalid Hossain
 * November 26, 2023 | Individual Programming Assignment 1
 * File: Pilots.java
 * Purpose: Pilots class represents a pilot with their name, ID, and position.
 */

public class Pilots {
    private String pilotName; // Name of the pilot
    private int pilotID; // ID of the pilot
    private String pilotPosition; // Position of the pilot

    // Constructor to initialize pilot details
    public Pilots(String pilotName, int pilotID, String pilotPosition) {
        this.pilotName = pilotName;
        this.pilotID = pilotID;
        this.pilotPosition = pilotPosition;
    }

    // Getter method to retrieve the name of the pilot
    public String getPilotName() {
        return pilotName;
    }

    // Getter method to retrieve the ID of the pilot
    public int getPilotID() {
        return pilotID;
    }

    // Getter method to retrieve the position of the pilot
    public String getPilotPosition() {
        return pilotPosition;
    }

    // Requirement 5: Method to check if the current pilot is assigned to a specific aircraft
    public boolean isPilotForFlight(Aircraft aircraft) {
        for (Pilots pilot : aircraft.getPilots()) {
            if (this.equals(pilot)) {
                return true;
            }
        }
        return false;
    }
}
