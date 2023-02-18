package oop.practice.clases;

import oop.practice.clases.airline.Airline;
import oop.practice.clases.airline.AirlineService;
import oop.practice.clases.bus.Bus;
import oop.practice.clases.bus.BusService;
import oop.practice.clases.henfactory.Country;
import oop.practice.clases.henfactory.HenFactory;
import oop.practice.clases.patient.Patient;
import oop.practice.clases.patient.PatientService;
import oop.practice.clases.text.Sentence;
import oop.practice.clases.text.Text;
import oop.practice.clases.text.Word;
import oop.practice.clases.travelvouchers.*;

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
        }
    }
}
