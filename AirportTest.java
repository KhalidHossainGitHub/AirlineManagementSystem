/*
 * Khalid Hossain
 * November 26, 2023 | Individual Programming Assignment 1
 * File: AirportTest.java
 * Purpose: AirportTest class is used to test the functionality of the implemented classes.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AirportTest {

    public static void main(String[] args) throws ParseException {
        // Instances of Airport class
        Airport pearson = new Airport("Toronto", "Canada", "YYZ");
        Airport montreal = new Airport("Montreal", "Canada", "YUL");
        Airport ottawa = new Airport("Ottawa", "Canada", "YOW");

        // Instances of Pilots class
        Pilots johnSmith = new Pilots("John Smith", 540, "Captain");
        Pilots SarahEric = new Pilots("Sarah Eric", 651, "CoPilot");
        Pilots monnaKam = new Pilots("Monna Kam", 785, "Navigator");

        ArrayList<Pilots> pilots = new ArrayList<>();
        pilots.add(johnSmith);
        pilots.add(SarahEric);
        pilots.add(monnaKam);

        // Instance of Aircraft class
        Aircraft boeing787 = new Aircraft("boeing787", "Working", "landed", pilots);

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm");
        Date departureTime = dateFormat.parse("07/17/2018 03:19");
        Date arrivalTime = dateFormat.parse("07/20/2018 04:50");
        // Instances of Flight class
        Flight ac472 = new Flight("AC472", departureTime, arrivalTime, pearson, ottawa, boeing787);

        ArrayList<Flight> flights = new ArrayList<>();
        flights.add(ac472);
        ArrayList<Aircraft> aircrafts = new ArrayList<>();
        aircrafts.add(boeing787);
        // Instances of Airline class
        Airline airCanada = new Airline("Air Canada", flights, aircrafts);

        // TESTING THE PROGRAM (output) ------------------------

        // Test joinPilot and printPilots in Aircraft class
        Pilots newPilot = new Pilots("New Pilot", 999, "First Officer");
        boeing787.joinPilot(newPilot);
        System.out.println("Pilots working on boeing787 after adding new pilot:");
        boeing787.printPilots();

        // Test owns and printFlightByName in Airline class
        Aircraft airbusA320 = new Aircraft("AirbusA320", "Working", "landed", new ArrayList<>());
        airCanada.owns(airbusA320);
        System.out.println("Flights owned by Air Canada after adding AirbusA320:");
        airCanada.printFlightByName();

        // Test isPilotForFlight in Pilots class
        System.out.println("Is John Smith working for the flight ac472? " +
                johnSmith.isPilotForFlight(boeing787)); // NOTE: John Smith is working on boeing787

        // Test pilotsWorkingForAirlines in Airline class
        System.out.println("Pilots working for Air Canada:");
        ArrayList<Pilots> airCanadaPilots = airCanada.pilotsWorkingForAirlines();
        for (Pilots pilot : airCanadaPilots) {
            System.out.println("Pilot Name: " + pilot.getPilotName() + ", ID: " + pilot.getPilotID() +
                    ", Position: " + pilot.getPilotPosition());
        }

        // Test getDepartureFlightByAirport and getArrivalFlightByAirport in Airline class
        System.out.println("Departure flights from Toronto on 07/17/2018:");
        ArrayList<Flight> departureFlights = airCanada.getDepartureFlightByAirport(pearson);
        for (Flight flight : departureFlights) {
            System.out.println("Flight ID: " + flight.getId() + ", Aircraft: " + flight.getAircraft().getName() +
                    ", Arrival Time: " + flight.getArrivalTime() + ", Departure Time: " + flight.getDepartureTime());
        }

        System.out.println("Arrival flights to Ottawa on 07/20/2018:");
        ArrayList<Flight> arrivalFlights = airCanada.getArrivalFlightByAirport(ottawa);
        for (Flight flight : arrivalFlights) {
            System.out.println("Flight ID: " + flight.getId() + ", Aircraft: " + flight.getAircraft().getName() +
                    ", Arrival Time: " + flight.getArrivalTime() + ", Departure Time: " + flight.getDepartureTime());
        }
    }
}
