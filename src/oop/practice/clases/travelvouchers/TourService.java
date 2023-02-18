package oop.practice.clases.travelvouchers;

import java.util.ArrayList;
import java.util.Comparator;

public class TourService {
    private String tourName;

    private ArrayList<Client> clients;
    private ArrayList<TourPackage> tours;

    public TourService(String tourName, ArrayList<TourPackage> tours) {
        this.tourName = tourName;
        this.tours = tours;
        this.clients = new ArrayList<>();
    }

    public void addClient(Client client, TourPackage tour) {
        client.setTourPackage(tour);
        clients.add(client);
    }

    public ArrayList<TourPackage> selectByOptions(TourType type) {
        ArrayList<TourPackage> packages = new ArrayList<>();
        for (TourPackage tour : tours) {
            if (tour.getType().equals(type)) {
                packages.add(tour);
            }
        }
        return packages;
    }

    public ArrayList<TourPackage> selectByOptions(TransportType transport) {
        ArrayList<TourPackage> packages = new ArrayList<>();
        for (TourPackage tour : tours) {
            if (tour.getTransport().equals(transport)) {
                packages.add(tour);
            }
        }
        return packages;
    }

    public ArrayList<TourPackage> selectByOptions(TransportType transport, FoodType food) {
        ArrayList<TourPackage> packages = new ArrayList<>();
        for (TourPackage tour : tours) {
            if (tour.getTransport().equals(transport) && tour.getFood().equals(food)) {
                packages.add(tour);
            }
        }
        return packages;
    }

    public ArrayList<TourPackage> selectByOptions(TransportType transport, FoodType food, int days) {
        ArrayList<TourPackage> packages = new ArrayList<>();
        for (TourPackage tour : tours) {
            if (tour.getTransport().equals(transport) && tour.getFood().equals(food) && tour.getNumberOfDays() == days) {
                packages.add(tour);
            }
        }
        return packages;
    }

    public ArrayList<TourPackage> selectByOptions(int days) {
        ArrayList<TourPackage> packages = new ArrayList<>();
        for (TourPackage tour : tours) {
            if (tour.getNumberOfDays() == days) {
                packages.add(tour);
            }
        }
        return packages;
    }

    public static void sortByPrice(ArrayList<TourPackage> tour) {
        tour.sort(Comparator.comparing(TourPackage::getPrice));
    }

    public static void sortByDays(ArrayList<TourPackage> tour) {
        tour.sort(Comparator.comparing(TourPackage::getNumberOfDays));
    }

    public static void printTours(ArrayList<TourPackage> packages) {
        if (packages.size() == 0) {
            System.out.println("Not found");
            return;
        }
        for (TourPackage tour : packages) {
            System.out.printf("To %s, %s, type: %s, transfer by %s, food: %s, for %d days, price: %.2f euro.\n",
                    tour.getCountry(), tour.getCity(), tour.getType(), tour.getTransport(), tour.getFood(), tour.getNumberOfDays(), tour.getPrice());
        }
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<TourPackage> getTours() {
        return tours;
    }

    public void setTours(ArrayList<TourPackage> tours) {
        this.tours = tours;
    }

}
