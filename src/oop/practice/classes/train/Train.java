package oop.practice.classes.train;

import java.time.LocalTime;

public class Train {
    private String destination;
    private String trainNumber;
    private LocalTime departureTime;

    public Train(String destination, String trainNumber, String departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = LocalTime.parse(departureTime);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = LocalTime.parse(departureTime);
    }

    @Override
    public String toString() {
        return "destination: " + destination +
                ", trainNumber: " + trainNumber +
                ", departureTime: " + departureTime;
    }
}
