package com.pluralsight;


import java.util.ArrayList;

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

    public ArrayList<Vehicle> getVehiclesByPrice(double minPrice, double maxPrice) {


        return null;
    }


    public ArrayList<Vehicle> getVehiclesByMake(String make) {


        return null;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int minYear, int maxYear) {


        return null;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {


        return null;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int minMileage, int maxMileage) {


        return null;
    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {


        return null;
    }

    public ArrayList<Vehicle> getAllVehicles() {

        return vehicles;

    }

    public boolean addVehicle(Vehicle vehicle) {

        return vehicles.add(vehicle);
    }

    public boolean removeVehicle(Vehicle vehicle) {


        return vehicles.remove(vehicle);
    }

}
