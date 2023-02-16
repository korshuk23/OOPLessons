package oop.practice.clases.bus;

public class Bus {
    private String driverFio;
    private int busNumber, routeNumber;
    private String mark;
    private int yearOfOperation, mileage;

    public Bus(String driverFio, int busNumber, int routeNumber, String mark, int yearOfOperation, int mileage) {
        this.driverFio = driverFio;
        this.busNumber = busNumber;
        this.routeNumber = routeNumber;
        this.mark = mark;
        this.yearOfOperation = yearOfOperation;
        this.mileage = mileage;
    }

    public String getDriverFio() {
        return driverFio;
    }

    public void setDriverFio(String driverFio) {
        this.driverFio = driverFio;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYearOfOperation() {
        return yearOfOperation;
    }

    public void setYearOfOperation(int yearOfOperation) {
        this.yearOfOperation = yearOfOperation;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }


    @Override
    public String toString() {
        return "Driver: " + driverFio +
                ", classes.entity.Bus number: " + busNumber +
                ", Route number: " + routeNumber +
                ", Mark: " + mark +
                ", Year of operation: " + yearOfOperation +
                ", Mileage: " + mileage;
    }
}
