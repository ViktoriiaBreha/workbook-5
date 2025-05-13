package com.pluralsight;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<Asset> asset = new ArrayList<>();

        asset.add(new House("My house", "2019-06-01", 456897, "Main St", 3, 3000, 8000));
        asset.add(new House("Vacation house", "2022-08-24", 567888, "Lake St.", 1, 2000, 5000));

        asset.add(new Vehicle("Tom's truck", "2019-03-26", 70000, "Ford", 2022, 98000));
        asset.add(new Vehicle("My car", "2024-06-12", 30000, "Toyota", 2019, 88000));

        for (int i = 0; i < asset.size(); i++) {
            Asset a = asset.get(i);

            System.out.println(" ");
            System.out.printf("Description: %s \n", a.getDescription());
            System.out.printf("Date Acquired: %s \n", a.getDateAcquired());
            System.out.printf("Original Cost: $%.2f \n", a.getOriginalCost());
            System.out.printf("Current Value: $%.2f \n", a.getValue());

            String message = "";
            if (asset.get(i) instanceof House) {
                House house = (House) a;
                message = "House at " + house.getAddress();
            } else if (asset.get(i) instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) a;
                message = "Vehicle: " +
                        vehicle.getYear() + " " + vehicle.getMakeModel();
            }

            System.out.println(message);

        }
    }
}
