package oop.practice.classes.country;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private ArrayList<District> districts;

    public City(String name) {
        this.name = name;
        this.districts = new ArrayList<>();
    }

    public ArrayList<District> getDistricts() {
        return districts;
    }

    public void setDistricts(District... districts) {
        this.districts.addAll(List.of(districts));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
