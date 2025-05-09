package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class DealershipFileManager {


    //???

    //???



    public Dealership getDealership(String fileName) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        String line;

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String dealershipHeader = br.readLine();
            String[] headerParts = dealershipHeader.split("\\|");

            String dealerName = headerParts[0];
            String dealerAddress = headerParts[1];
            String dealerPhone = headerParts[2];


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

        } catch (Exception e) {

            System.out.println("Error, File Not Found!");
        }

    }



}
