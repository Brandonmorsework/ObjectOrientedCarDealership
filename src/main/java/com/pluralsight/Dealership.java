package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {

    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> vehicles;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.vehicles = new ArrayList<>();
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

    public List<Vehicle> getVehiclesByPrice(double minPrice, double maxPrice) {


        return null;
    }


    public List<Vehicle> getVehiclesByMake(String make) {


        return null;
    }

    public List<Vehicle> getVehiclesByYear(int minYear, int maxYear) {


        return null;
    }

    public List<Vehicle> getVehiclesByColor(String color) {


        return null;
    }

    public List<Vehicle> getVehiclesByMileage(int minMileage, int maxMileage) {


        return null;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {


        return null;
    }

    public ArrayList<Vehicle> getAllVehicles() {

        return vehicles;

    }

    public void addVehicle(Vehicle vehicle) {

        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {


        vehicles.remove(vehicle);
    }

}
