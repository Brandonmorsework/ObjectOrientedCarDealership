package com.pluralsight;


import java.util.ArrayList;

public class Dealership {

    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> vehicle;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.vehicle = new ArrayList<>();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(double minPrice, double maxPrice) {



    }


    public ArrayList<Vehicle> getVehiclesByMake(String make) {



    }

    public ArrayList<Vehicle> getVehiclesByYear(int minYear, int maxYear) {



    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {



    }

    public ArrayList<Vehicle> getVehiclesByMileage(int minMileage, int maxMileage) {



    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {



    }

    public ArrayList<Vehicle> getAllVehicles() {



    }

    public boolean addVehicle(Vehicle vehicle) {



    }

    public boolean removeVehicle(Vehicle vehicle) {



    }

}
