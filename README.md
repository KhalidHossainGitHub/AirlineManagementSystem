# Air Travel Management System

This project models a simplified air travel system using **Java**. It includes classes representing **Aircraft**, **Airline**, **Airport**, **Flight**, and **Pilots**, facilitating various operations such as adding pilots to aircraft, tracking flights, and managing an airline's fleet.

## Project Overview

The air travel system includes:

- **Airline**: Represents an airline that operates flights and manages a fleet of aircraft.
- **Flight**: Each flight has an ID, a departure airport, an arrival airport, a pilot, a co-pilot, departure and arrival times, and a designated aircraft.
- **Aircraft**: Aircraft can either be operational or under repair, and they can be landed or airborne. Each aircraft requires at least a pilot and a co-pilot.
- **Pilot**: Represents pilots that can be assigned to aircraft and flights.
- **Airport**: Manages flights and interactions between airlines, aircraft, and pilots.

### Key Features

- **Aircraft Class**:
  - `joinPilot(Pilot pilot)`: Adds the given pilot to the aircraft.
  - `printPilot()`: Displays a list of all pilots working on the aircraft.

- **Airline Class**:
  - `owns(Aircraft aircraft)`: Adds an aircraft to the airline. If the airline already owns the aircraft, the method does nothing.
  - `printFlightByName()`: Displays a list of all flights owned by the current airline, showing all flight information.
  - `pilotsWorkingForAirlines(Airline airline)`: Returns a list of all pilots working with the given airline.
  - `getDepartureFlightByAirport(Airport airport)`: Returns a list of flights that depart from the specified airport on a given date.
  - `getArrivalFlightByAirport(Airport airport)`: Returns a list of flights that arrive at the specified airport on a given date.

- **Pilot Class**:
  - `isPilotForFlight(AirCraft aircraft)`: Returns `true` if the given pilot is working for any flight on the specified aircraft.

- **Flight Class**: Manages flight operations, including the assignment of pilots and tracking departure/arrival airports.

### Technologies Used

- **Java**: Core programming language for building the system.

## How to Run the Project

To run the **Air Travel System Simulation**, follow these steps:

1. **Clone the Repository**:
   - Navigate to the https://github.com/KhalidHossainGitHub/AirlineManagementSystem.git
   - Click on the green **Code** button, then select **Download ZIP** or **Clone** the repository using Git.

2. **Open the Project**:
   - Extract the ZIP file if downloaded, or open the project folder in an IDE such as **Eclipse**, **IntelliJ IDEA**, or **VS Code**.

3. **Compile the Project**:
   - Make sure the `src` folder contains all Java files.
   - In your IDE, compile the project by selecting the **Build** option.

4. **Run the Tests**:
   - Run the `AirportTest.java` class to simulate interactions within the air travel system.
   - This will demonstrate adding pilots to aircraft, managing airlines’ fleets, and tracking flights.

