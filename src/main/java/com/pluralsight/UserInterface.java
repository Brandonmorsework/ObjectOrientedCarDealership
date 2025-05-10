package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Dealership dealership;

    public void display() {

        init();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println(" ");
            System.out.println("Welcome to the Car Dealership!");
            System.out.println(" ");
            System.out.println("Please Choose an option: ");
            System.out.println(" ");
            System.out.println("Press '1' to Find a Vehicle Within a Price Range");
            System.out.println("Press '2' to Find a Vehicle by Make/Model");
            System.out.println("Press '3' to Find a Vehicle Within a Year Range");
            System.out.println("Press '4' to Find a Vehicle by Color");
            System.out.println("Press '5' to Find a Vehicle by Mileage");
            System.out.println("Press '6' to Find a Vehicle by Type (Car, Truck, SUV, Van)");
            System.out.println("Press '7' to List All Vehicles");
            System.out.println("Press '8' to Add a Vehicle to The Dealership");
            System.out.println("Press '9' to Remove a Vehicle From The Dealership");
            System.out.println("Press '99' to Quit");

            String userInput = scanner.nextLine().trim();

            switch (userInput.toUpperCase()) {
                case "1":
                    processGetByPriceRequest();
                    break;
                case "2":
                    processGetByMakeModelRequest();
                    break;
                case "3":
                    processGetByYearRequest();
                    break;
                case "4":
                    processGetByColorRequest();
                    break;
                case "5":
                    processGetByMileageRequest();
                    break;
                case "6":
                    processGetByVehicleTypeRequest();
                    break;
                case "7":
                    processGetAllVehiclesRequest();
                    break;
                case "8":
                    processAddVehicleRequest();
                    break;
                case "9":
                    processRemoveVehicleRequest();
                    break;
                case "99":
                    System.out.println("Thank You For Using the Car Dealership, Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid Option, Returning Home...");
                    break;

            }

        }

        scanner.close();

    }

    private void init() {

        String FILE_NAME = "Vehicles.csv";

        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        this.dealership = dealershipFileManager.getDealership(FILE_NAME);

    }

    private void displayVehicles(ArrayList<Vehicle> vehicles) {

        if (vehicles.isEmpty()) {

            System.out.println("No Vehicles Found...");

        } else {

            for (Vehicle vehicle : vehicles) {
                System.out.printf("%-12s | %-10s | %-30s | %-20s | %-20s | %-20s | %-20s | $%10.2f\n", vehicle.getVin(), vehicle.getYear(), vehicle.getMake(), vehicle.getModel(), vehicle.getVehicleType(), vehicle.getColor(), vehicle.getOdometer(), vehicle.getPrice());
            }
        }
    }





    public void processGetByPriceRequest() {

    }

    public void processGetByMakeModelRequest() {

    }

    public void processGetByYearRequest() {

    }

    public void processGetByColorRequest() {

    }

    public void processGetByMileageRequest() {

    }

    public void processGetByVehicleTypeRequest() {

    }

    public void processGetAllVehiclesRequest() {

       ArrayList<Vehicle> vehicles = dealership.getAllVehicles();

        displayVehicles(vehicles);

    }

    public void processAddVehicleRequest() {

        Scanner scanner = new Scanner(System.in);

        int vin = 0;
        int year = 0;
        String make = null;
        String model = null;
        String vehicleType = null;
        String color = null;
        int odometer = 0;
        double price = 0.0;

        while (vin == 0) {
            try {
                System.out.println("(1 / 8) Please Enter The 5 Digit Vehicle Identification Number");
                int userVinInput = scanner.nextInt();

                if (userVinInput >= 10000 && userVinInput <= 99999) {
                    vin = userVinInput;
                } else {

                System.out.println("The VIN Must Be a Value Between 10000 and 99999!");

                }

            } catch (Exception e) {

                System.out.println("Invalid! Please Enter a 5-Digit VIN");
                scanner.nextLine();
            }
        }

        while (year == 0) {
            try {
                System.out.println("(2 / 8) Please Enter The Year of The Vehicle");
                int userVinInput = scanner.nextInt();

                if (userVinInput >= 1885 && userVinInput <= 2025) {
                    vin = userVinInput;
                } else {

                    System.out.println("The Year Must Be a Value Between 1885 and 2025!");

                }

            } catch (Exception e) {

                System.out.println("Invalid! Please Enter a 4 Digit Year Value");
                scanner.nextLine();
            }
        }





        Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);

    }

    public void processRemoveVehicleRequest() {

    }

}
