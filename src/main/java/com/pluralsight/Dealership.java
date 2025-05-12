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

        List<Vehicle> availableVehicles = new ArrayList<>();

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getPrice() >= minPrice && vehicle.getPrice() <= maxPrice) {
                availableVehicles.add(vehicle);
            }
        }

        return availableVehicles;
    }


    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {

        List<Vehicle> availableVehicles = new ArrayList<>();

        for (Vehicle vehicle : vehicles) {

            if (vehicle.getMake().trim().equalsIgnoreCase(make) && vehicle.getModel().trim().equalsIgnoreCase(model)) {
                availableVehicles.add(vehicle);

            }
        }
        return availableVehicles;
    }

    public List<Vehicle> getVehiclesByYear(int minYear, int maxYear) {

        List<Vehicle> availableVehicles = new ArrayList<>();

        for (Vehicle vehicle : vehicles) {

            if (vehicle.getYear() >= minYear && vehicle.getYear() <= maxYear) {
                availableVehicles.add(vehicle);
            }
        }
        return availableVehicles;

    }

    public List<Vehicle> getVehiclesByColor(String color) {


        List<Vehicle> availableVehicles = new ArrayList<>();

        for (Vehicle vehicle : vehicles) {

            if (vehicle.getColor().trim().equalsIgnoreCase(color)) {
                availableVehicles.add(vehicle);

            }
        }
        return availableVehicles;
    }

    public List<Vehicle> getVehiclesByMileage(int minMileage, int maxMileage) {


        List<Vehicle> availableVehicles = new ArrayList<>();

        for (Vehicle vehicle : vehicles) {

            if (vehicle.getOdometer() >= minMileage && vehicle.getOdometer() <= maxMileage) {
                availableVehicles.add(vehicle);
            }
        }
        return availableVehicles;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {


        List<Vehicle> availableVehicles = new ArrayList<>();

        for (Vehicle vehicle : vehicles) {

            if (vehicle.getVehicleType().trim().equalsIgnoreCase(vehicleType)) {
                availableVehicles.add(vehicle);

            }
        }
        return availableVehicles;
    }

    public List<Vehicle> getVehiclesByVin(int vin) {

        List<Vehicle> availableVehicles = new ArrayList<>();

        for (Vehicle vehicle : vehicles) {

            if (vehicle.getVin() == vin) {
                availableVehicles.add(vehicle);

            }
        }

        return availableVehicles;
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
