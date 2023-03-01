package oop.practice.classes.country;

import java.util.ArrayList;
import java.util.List;

public class Region {
    private RegionType name;
    private ArrayList<City> cities;
    private double area;
    private int population;

    public Region(RegionType name, double area, int population) {
        this.name = name;
        this.area = area;
        this.population = population;
        this.cities = new ArrayList<>();
    }

    public RegionType getName() {
        return name;
    }

    public void setName(RegionType name) {
        this.name = name;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void addCities(City... cities) {
        this.cities.addAll(List.of(cities));
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
