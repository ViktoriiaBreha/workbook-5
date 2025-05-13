package com.pluralsight;

import java.time.Year;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public int getYear() {
        return year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    //Finish here!!!
    @Override
    public double getValue() {
        int presentYear = Year.now().getValue();
        int howManyYears = presentYear - year;
        double carValue;

        if (howManyYears <= 3) {
            carValue = getOriginalCost() * Math.pow(0.97, howManyYears);
        } else if (howManyYears <= 6) {
            carValue = getOriginalCost() * Math.pow(0.94, howManyYears);
        } else if (howManyYears <= 10) {
            carValue = getOriginalCost() * Math.pow(0.92, howManyYears);
        } else {
            carValue = 1000.00;
        }

        if (odometer > 100000 && !(makeModel.toLowerCase().contains("honda") && makeModel.toLowerCase().contains(
                "toyota"))) {
            carValue *= 0.75;
        }
        return carValue;
    }
}
