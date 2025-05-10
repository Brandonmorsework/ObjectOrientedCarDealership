package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DealershipFileManager {

    public Dealership getDealership(String fileName) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        String line;

        Dealership dealership = null;

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String dealershipHeader = br.readLine();
            String[] headerParts = dealershipHeader.split("\\|");

            String name = headerParts[0];
            String address = headerParts[1];
            String phone = headerParts[2];


            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                int vin = Integer.parseInt(parts[0]);
                int year = Integer.parseInt(parts[1]);
                String make = parts[2];
                String model = parts[3];
                String vehicleType = parts[4];
                String color = parts[5];
                int odometer = Integer.parseInt(parts[6]);
                double price = Double.parseDouble(parts[7]);

                Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                vehicles.add(vehicle);

            }

            br.close();

            dealership = new Dealership(name, address, phone);
            for (Vehicle vehicle : vehicles) {
                dealership.addVehicle(vehicle);
            }

        } catch (Exception e) {

            System.out.println("Error, File Not Found!");
        }

        return dealership;

    }

    public void saveDealership(Dealership dealership, String fileName) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            writer.write(dealership.getName() + "|" + dealership.getAddress() + "|" + dealership.getPhone());
            writer.newLine();

            for (Vehicle vehicle : dealership.getAllVehicles()) {
                writer.write(vehicle.getVin() + "|" + vehicle.getYear() + "|" + vehicle.getMake() + "|" + vehicle.getModel() + "|" + vehicle.getVehicleType() + "|" + vehicle.getColor() + "|" + vehicle.getOdometer() + "|" + vehicle.getPrice());
                writer.newLine();
            }

            System.out.println("Dealership Entries Successfully Saved!");

            } catch(Exception e) {

                System.out.println("Error Writing These Entries to File");

            }

    }

}
