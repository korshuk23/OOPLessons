package oop.practice.classes.airline;

import java.time.LocalTime;

public class AirlineService {
    private final Airline[] airlines;
    private static int count = 0;

    public AirlineService(Airline[] airlines) {
        this.airlines = airlines;
    }

    public Airline[] flightByDestination(String destination) {
        Airline[] flightsByDest = new Airline[airlines.length];
        for (Airline airline : airlines) {
            if (airline.getDestination().equals(destination)) {
                flightsByDest[count++] = airline;
            }
        }
        return flightsByDest;
    }

    public Airline[] flightByDayOfWeek(String dayOfWeek) {
        Airline[] flightsByDays = new Airline[airlines.length];
        for (Airline airline : airlines) {
            if (airline.getDaysOfWeek().getDay().equals(dayOfWeek)) {
                flightsByDays[count++] = airline;
            }
        }
        return flightsByDays;
    }

    public Airline[] flightByDepartureTime(String dayOfWeek, String time) {
        Airline[] flightByTime = new Airline[airlines.length];
        for (Airline airline : airlines) {
            if (airline.getDaysOfWeek().getDay().equals(dayOfWeek) &&
                    airline.getDepartureTime().isAfter(LocalTime.parse(time))) {
                flightByTime[count++] = airline;
            }
        }
        return flightByTime;
    }
}
