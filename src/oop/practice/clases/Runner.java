package oop.practice.clases;

import oop.practice.clases.airline.Airline;
import oop.practice.clases.airline.AirlineService;
import oop.practice.clases.bankaccount.Account;
import oop.practice.clases.bankaccount.Bank;
import oop.practice.clases.bankaccount.BankClient;
import oop.practice.clases.book.Book;
import oop.practice.clases.book.BookService;
import oop.practice.clases.bus.Bus;
import oop.practice.clases.bus.BusService;
import oop.practice.clases.car.*;
import oop.practice.clases.henfactory.Country;
import oop.practice.clases.henfactory.HenFactory;
import oop.practice.clases.patient.Patient;
import oop.practice.clases.patient.PatientService;
import oop.practice.clases.text.Sentence;
import oop.practice.clases.text.Text;
import oop.practice.clases.text.Word;
import oop.practice.clases.travelvouchers.*;
import oop.practice.clases.country.*;


import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int chooseTask = Reader.readIntValue("""
                (1) Patient
                (2) Bus
                (3) Book
                (4) Airline
                (5) Phone
                (6) Person
                (7) Text
                (8) Travel vouchers
                (9) Hen factory
                (10) Car
                (11) Country
                (12) Bank Account
                Select task:""");
        switch (chooseTask) {
            case 1 -> {
                Patient[] patients = InitData.initPatients();
                PatientService patientService = new PatientService(patients);
                String diagnosis = Reader.readString("\na) Enter a diagnosis to search for patients: ");
                patientService.checkDiagnosis(diagnosis);
                System.out.println("\nb) Enter the range to search by medical card number: ");
                int from = Reader.readIntValue("From: ");
                int to = Reader.readIntValue("To: ");
                patientService.checkMedicalCard(from, to);
            }
            case 2 -> {
                Bus[] buses = InitData.initBuses();
                BusService busService = new BusService(buses);
                int routeNumber = Reader.readIntValue("\na) Display a list of buses for the given route number: ");
                busService.busesByRouteNumber(routeNumber);
                System.out.println("\nb) Display a list of buses that have been in operation for more than a specified period: ");
                int period = Reader.readIntValue("Enter period: ");
                busService.busesOutOfService(period);
                System.out.println("\nc) Display a list of buses whose mileage is greater than the given distance: ");
                int mileage = Reader.readIntValue("Mileage: ");
                busService.busesByMileage(mileage);
            }
            case 3 -> {
                Book[] books = InitData.initBooks();
                BookService bookService = new BookService(books);
                String author = Reader.readString("\na) Display a list of books by author: ");
                System.out.println(Arrays.toString(bookService.booksByAuthor(author)));
                String publishHouse = Reader.readString("\nb) Display a list of books by publish house: ");
                System.out.println(Arrays.toString(bookService.booksByPublishHouse(publishHouse)));
                int year = Reader.readIntValue("\nc) Display a list of books by year: ");
                System.out.println(Arrays.toString(bookService.booksByYear(year)));
            }
            case 4 -> {
                Airline[] airlines = InitData.initAirline();
                AirlineService airlineService = new AirlineService(airlines);
                System.out.println("\na) List of flights by destination: ");
                System.out.println(Arrays.toString(airlineService.flightByDestination("Minsk-Moskow")));
                System.out.println("\n b) List of flights by days of week: ");
                System.out.println(Arrays.toString(airlineService.flightByDayOfWeek("Monday")));
                System.out.println("\n b) List of flights by days of week and departure time: ");
                System.out.println(Arrays.toString(airlineService.flightByDepartureTime("Monday", "05:46")));
            }
            case 5 -> {
                InitData.initPhone();
            }
            case 6 -> {
                InitData.initPerson();
            }
            case 7 -> {
                Word header = new Word("\t\t\t\t\t\tThis is text header");
                String line = """
                        \tLorem Ipsum is simply dummy text of the printing and typesetting industry.
                        Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,
                        when an unknown printer took a galley of type and scrambled it to make a type
                        specimen book.""";
                String line2 = " New line 2.";
                String line3 = " New line 3.\n";

                Sentence sentence = new Sentence(line);
                Text text = new Text(header, sentence);

                text.addSentence(new Sentence(line2));
                text.addSentence(new Sentence(line3));
                text.printHeader();
                text.printText();
            }
            case 8 -> {
                ArrayList<TourPackage> tours = InitData.initTours();
                Client client = new Client("George", "Leontiev", 500.20);
                TourService tourService = new TourService("Top Tours 2023", tours);

                System.out.println("Select by excursion:");
                ArrayList<TourPackage> tourByType = tourService.selectByOptions(TourType.EXCURSION);
                TourService.printTours(tourByType);

                System.out.println("\nSelect by ship:");
                ArrayList<TourPackage> tourByOption = tourService.selectByOptions(TransportType.SHIP);
                TourService.sortByDays(tourByOption);
                TourService.printTours(tourByOption);

                System.out.println("\nSelect by plane and breakfast:");
                tourByOption = tourService.selectByOptions(TransportType.PLANE, FoodType.BREAKFAST);
                TourService.sortByPrice(tourByOption);
                TourService.printTours(tourByOption);

                System.out.println("\nSelect by bus, all inclusive and for 7 days:");
                tourByOption = tourService.selectByOptions(TransportType.BUS, FoodType.ALL_INCLUSIVE, 7);
                TourService.sortByPrice(tourByOption);
                TourService.printTours(tourByOption);

                System.out.println("\nSelect by bus, not all inclusive and for 8 days:");
                tourByOption = tourService.selectByOptions(TransportType.BUS, FoodType.NOT_ALL_INCLUSIVE, 8);
                TourService.sortByPrice(tourByOption);
                TourService.printTours(tourByOption);

                System.out.println("\nSelect for 7 days:");
                tourByOption = tourService.selectByOptions(7);
                TourService.sortByPrice(tourByOption);
                TourService.printTours(tourByOption);

                tourService.addClient(client, tourByOption.get(0));
            }
            case 9 -> {
                System.out.println(new HenFactory().breed(Country.BELARUS).getDescription());
                System.out.println(new HenFactory().breed(Country.UKRAINE).getDescription());
                System.out.println(new HenFactory().breed(Country.MOLDOVA).getDescription());
                System.out.println(new HenFactory().breed(Country.RUSSIA).getDescription());
            }
            case 10 -> {
                Car car1 = new Car("Mercedes Benz", 280, 3.0);
                System.out.println(car1.getModel());
                car1.refueled();

                car1.setWheels(new Wheel(16, WheelType.WINTER, RimsType.ALLOY, WheelPosition.FRONT_LEFT),
                        new Wheel(16, WheelType.WINTER, RimsType.ALLOY, WheelPosition.FRONT_RIGHT),
                        new Wheel(15, WheelType.SUMMER, RimsType.STAMPED, WheelPosition.REAR_LEFT),
                        new Wheel(16, WheelType.WINTER, RimsType.ALLOY, WheelPosition.REAR_RIGHT));
                car1.printWheels();

                car1.changeWheel(WheelPosition.REAR_LEFT,
                        new Wheel(16, WheelType.WINTER, RimsType.ALLOY, WheelPosition.REAR_LEFT));
                car1.printWheels();

                car1.setWheels(new Wheel(16, WheelType.WINTER, RimsType.ALLOY, WheelPosition.FRONT_RIGHT));
                car1.printWheels();

                car1.run();
            }
            case 11 -> {
                Country2 belarus = new Country2("Belarus", "Minsk");
                belarus.addRegions(new Region(RegionType.MINSK_REGION, 39854, 45654354),
                        new Region(RegionType.VITEBSK_REGION, 40051, 4564554),
                        new Region(RegionType.BREST_REGION, 32786, 7685645),
                        new Region(RegionType.GOMEL_REGION, 40372, 52356454),
                        new Region(RegionType.MOGILEV_REGION, 29068, 3456424),
                        new Region(RegionType.GRODNO_REGION, 25127, 3576345));
                belarus.printCapital();
                belarus.printNumberOfRegions();
                belarus.printArea();
                belarus.printRegionalCenter();

            }
            case 12 -> {
                Bank alphaBank = new Bank("Alpha bank");
                BankClient client1 = new BankClient("Nikolai", "Borisov", "ME2848145");
                BankClient client2 = new BankClient("Sergei", "Apanasevich", "MC1364814");

                alphaBank.addClient(client1, client2);

                client1.openAccount(new Account(103.43));
                client1.openAccount(new Account(500.32));
                client1.openAccount(new Account(13.43));
                client1.openAccount(new Account(3333.43));

                client2.openAccount(new Account(45.5));
                client2.openAccount(new Account(225.33));
                client2.openAccount(new Account(-25.52));
                client2.openAccount(new Account(325.12));

                System.out.println(alphaBank.getClient(client1.getPassportId()).getAccount(1).getStatus());
                client1.blockAccount(1);
                System.out.println(alphaBank.getClient(client1.getPassportId()).getAccount(1).getStatus());

                System.out.println(alphaBank.getClient(client1.getPassportId()).getInformation());
                alphaBank.getClient(client1.getPassportId()).sortByBalance();

                System.out.println("Total balance of client  " +
                        alphaBank.getClient(client1.getPassportId()).getFIO() +
                        alphaBank.getClient(client1.getPassportId()).getBalance());

                System.out.println("Total balance of client " +
                        alphaBank.getClient(client2.getPassportId()).getFIO() +
                        alphaBank.getClient(client2.getPassportId()).getBalance());

                System.out.println("Total positive balance " +
                        alphaBank.getClient(client1.getPassportId()).getFIO() +
                        alphaBank.getClient(client1.getPassportId()).getBalancePositiveAccounts());

                System.out.println("Total negative balance " +
                        alphaBank.getClient(client2.getPassportId()).getFIO() +
                        alphaBank.getClient(client2.getPassportId()).getBalanceNegativeAccounts());

            }
        }
    }
}
