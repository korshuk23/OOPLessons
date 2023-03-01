package oop.practice.classes.airline;

import java.time.LocalTime;

public class Airline {
    private String destination;
    private int flightNumber;
    private AircraftType aircraftType;
    private LocalTime departureTime;
    private DaysOfWeek daysOfWeek;

    public Airline(String destination, int flightNumber, AircraftType aircraftType, String departureTime, DaysOfWeek daysOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.daysOfWeek = daysOfWeek;
        this.departureTime = LocalTime.parse(departureTime);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public AircraftType getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(AircraftType aircraftType) {
        this.aircraftType = aircraftType;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = LocalTime.parse(departureTime);
    }

    public DaysOfWeek getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(DaysOfWeek daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    @Override
    public String toString() {
        return "Destination: '" + destination +
                ", Flight number: " + flightNumber +
                ", Aircraft type: " + aircraftType +
                ", Departure time: " + departureTime +
                ", Days of week: " + daysOfWeek + "\n";
    }
}
