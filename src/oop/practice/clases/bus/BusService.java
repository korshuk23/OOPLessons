package oop.practice.clases.bus;

import java.time.Year;

public class BusService {
    private Bus[] buses;

    public BusService(Bus[] buses) {
        this.buses = buses;
    }

    public void busesByRouteNumber(int routeNumber) {
        for (Bus bus : buses) {
            if (bus.getRouteNumber() == routeNumber) {
                System.out.println(bus.toString());
            }
        }
    }

    public void busesOutOfService(int period) {
        for (Bus bus : buses) {
            if (Integer.parseInt(Year.now().toString()) - bus.getYearOfOperation() > period) {
                System.out.println(bus.toString());
            }
        }
    }

    public void busesByMileage(int mileage) {
        for (Bus bus : buses) {
            if (bus.getMileage() > mileage) {
                System.out.println(bus.toString());
            }
        }
    }
}
