package oop.practice.clases.country;

public class District {
    private String districtName;
    private double area;

    public District(String districtName, double area) {
        this.districtName = districtName;
        this.area = area;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
