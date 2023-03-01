package oop.practice.classes.train;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainService {
    private ArrayList<Train> trains;

    public TrainService() {
        this.trains = new ArrayList<>();
    }

    public void sortByTrainNumber() {
        trains.sort(Comparator.comparing(Train::getTrainNumber));
    }

    public void sortByDestination() {
        trains.sort(Comparator.comparing(Train::getDestination).thenComparing(Train::getDepartureTime));
    }

    public String getInformation(String trainNumber) {
        for (Train train : trains) {
            if (train.getTrainNumber().equalsIgnoreCase(trainNumber)) {
                return "Destination: " + train.getDestination() +
                        ", departure time: " + train.getDepartureTime();
            }
        }
        return null;
    }

    public ArrayList<Train> getTrains() {
        return trains;
    }

    public void addTrains(Train... trains) {
        this.trains.addAll(List.of(trains));
    }

    public void printTrains() {
        for (Train train : trains) {
            System.out.println(train.toString());
        }
    }
}
