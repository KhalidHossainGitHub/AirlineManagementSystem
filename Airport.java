/*
 * Khalid Hossain
 * November 26, 2023 | Individual Programming Assignment 1
 * File: Airport.java
 * Purpose: Airport class represents an airport with its city, country, and ID.
 */

public class Airport {
    private String city; // City where the airport is located
    private String country; // Country where the airport is located
    private String id; // Airport ID

     // Constructor to initialize airport details
    public Airport(String city, String country, String id) {
        this.city = city;
        this.country = country;
        this.id = id;
    }

    // Getter method to retrieve the city where the airport is located
    public String getCity() {
        return city;
    }

    // Getter method to retrieve the country where the airport is located
    public String getCountry() {
        return country;
    }

    // Getter method to retrieve the ID of the airport
    public String getId() {
        return id;
    }
}
