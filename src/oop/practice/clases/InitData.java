package oop.practice.clases;

import oop.practice.clases.airline.AircraftType;
import oop.practice.clases.airline.Airline;
import oop.practice.clases.airline.DaysOfWeek;
import oop.practice.clases.book.BindingType;
import oop.practice.clases.book.Book;
import oop.practice.clases.bus.Bus;
import oop.practice.clases.patient.Patient;
import oop.practice.clases.person.Person;
import oop.practice.clases.phone.Phone;
import oop.practice.clases.travelvouchers.*;

import java.util.ArrayList;

public class InitData {

    public static ArrayList<TourPackage> initTours() {
        ArrayList<TourPackage> tours = new ArrayList<>();

        tours.add(new TourPackage("Spain", "Barcelona", TourType.CRUISE,
                TransportType.SHIP, FoodType.BREAKFAST, 12, 1099.99));
        tours.add(new TourPackage("Spain", "Salou", TourType.RECREATION,
                TransportType.PLANE, FoodType.ALL_INCLUSIVE, 14, 1699.89));
        tours.add(new TourPackage("Spain", "Madrid", TourType.EXCURSION,
                TransportType.BUS, FoodType.NOT_ALL_INCLUSIVE, 5, 400.10));
        tours.add(new TourPackage("Spain", "Malaga", TourType.RECREATION,
                TransportType.PLANE, FoodType.BREAKFAST, 15, 1400.20));
        tours.add(new TourPackage("Spain", "Barcelona", TourType.TREATMENT,
                TransportType.BUS, FoodType.NOT_ALL_INCLUSIVE, 8, 500.80));
        tours.add(new TourPackage("Italy", "Rome", TourType.EXCURSION,
                TransportType.PLANE, FoodType.ALL_INCLUSIVE, 10, 950.36));
        tours.add(new TourPackage("Italy", "Venice", TourType.CRUISE,
                TransportType.SHIP, FoodType.BREAKFAST, 20, 1099.91));
        tours.add(new TourPackage("Italy", "Milan", TourType.SHOPPING,
                TransportType.PLANE, FoodType.BREAKFAST, 3, 399.99));
        tours.add(new TourPackage("Italy", "Florence", TourType.TREATMENT,
                TransportType.TRAIN, FoodType.ALL_INCLUSIVE, 13, 1099.11));
        tours.add(new TourPackage("Italy", "Rome", TourType.SHOPPING,
                TransportType.CAR, FoodType.NOT_ALL_INCLUSIVE, 7, 599.50));
        return tours;
    }

    public static Book[] initBooks() {
        Book[] books = new Book[4];
        books[0] = new Book(1, "Java", new String[]{"Sergei", "Egor", "Nikita"}, "Piter",
                2012, 560, BindingType.SOFT);
        books[1] = new Book(2, "Python", new String[]{"Ivan", "Egor", "Nikita"}, "Moskva",
                2016, 160, BindingType.SOFT);
        books[2] = new Book(3, "Golang", new String[]{"Andrei", "Egor", "Nikita"}, "Minsk",
                2012, 350, BindingType.SOFT);
        books[3] = new Book(4, "JavaScript", new String[]{"Alexandr", "Egor", "Nikita"}, "Piter",
                2017, 860, BindingType.SOFT);
        return books;
    }

    public static Airline[] initAirline() {
        Airline[] airlines = new Airline[4];
        airlines[0] = new Airline("Minsk-Moskow", 3, AircraftType.CHARTER_FLIGHT,
                "18:55", DaysOfWeek.SATURDAY);
        airlines[1] = new Airline("Berlin-Minsk", 2, AircraftType.CONNECTING_FLIGHT,
                "05:45", DaysOfWeek.MONDAY);
        airlines[2] = new Airline("Minsk-Riga", 1, AircraftType.CHARTER_FLIGHT,
                "08:32", DaysOfWeek.MONDAY);
        airlines[3] = new Airline("Warsaw-Minsk", 4, AircraftType.DIRECT_NON_SCHEDULED_FLIGHT,
                "15:15", DaysOfWeek.TUESDAY);
        return airlines;
    }

    public static Patient[] initPatients() {
        Patient[] patients = new Patient[6];
        patients[0] = new Patient("Alexei", "Sergeev", "Nikolaevich",
                "Kopievicha,6", "+375295458340", 1, "cold");
        patients[1] = new Patient("Egor", "Ivanov", "Vitalievich",
                "Oginskogo,8", "+375294453340", 2, "flu");
        patients[2] = new Patient("Ivan", "Nikitenko", "Vladimirovich",
                "Budenogo,9", "+375295442440", 4, "cold");
        patients[3] = new Patient("Andrei", "Alexandrov", "Sergeevich",
                "Koshevogo,4", "+375293458340", 5, "inflammation");
        patients[4] = new Patient("Alexandr", "Alexeev", "Egorovich",
                "Vaneeva,3", "+375294453340", 3, "cold");
        patients[5] = new Patient("Nikita", "Egorov", "Alexandrovich",
                "Scherbakova,34", "+375295258540", 6, "inflammation");
        return patients;
    }

    public static Bus[] initBuses() {
        Bus[] buses = new Bus[6];
        buses[0] = new Bus("Zybenko M.P.", 33, 2, "BMW",
                2010, 333000);
        buses[1] = new Bus("Petrov S.N.", 24, 6, "Mercedes",
                2020, 15000);
        buses[2] = new Bus("Vasnetsov V.S.", 19, 3, "BMW",
                2009, 388000);
        buses[3] = new Bus("Sergeev E.A.", 9, 8, "Mazda",
                2018, 180000);
        buses[4] = new Bus("Ivanov A.A.", 56, 8, "Mazda",
                2016, 202000);
        buses[5] = new Bus("Kireichik V.K.", 39, 1, "BMW",
                2012, 304000);
        return buses;
    }

    public static void initPhone() {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("Anatoliy");
        phone2.receiveCall("Sergei");
        phone3.receiveCall("Valeriy");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        phone1.receiveCall("Anatoliy", "+375291234567");
    }

    public static void initPerson() {
        Person person1 = new Person();
        Person person2 = new Person("Zybenko M.P.", 35);
        person2.move();
        person2.talk();
    }
}
