package oop.practice.clases;

import oop.practice.clases.bus.Bus;
import oop.practice.clases.bus.BusService;
import oop.practice.clases.patient.Patient;
import oop.practice.clases.patient.PatientService;

public class Runner {
    public static void main(String[] args) {
        int chooseTask = Reader.readIntValue("""
                (1) Patient
                (2) Bus
                (3) Book
                (4) Phone
                (5) Person
                                
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

            }
            case 4 -> {
                InitData.initPhone();
            }
            case 5 -> {
                InitData.initPerson();
            }
        }
    }
}
