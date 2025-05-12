package com.pluralsight;

public class MainApp {
    public static void main(String[] args) {

        Moped m1 = new Moped("red", 2,2,20);
//        m1.setColor("Red");
//        m1.setNumberOfPassengers(2);
//        m1.setCargoCapacity(2);
//        m1.setFuelCapacity(20);

        Car c1= new Car("white", 5,10,40);
//        c1.setColor("White");
//        c1.setNumberOfPassengers(5);
//        c1.setCargoCapacity(10);
//        c1.setFuelCapacity(40);

        SemiTruck s1 = new SemiTruck("orange", 4,50,60);
//        s1.setColor("Orange");
//        s1.setNumberOfPassengers(4);
//        s1.setCargoCapacity(50);
//        s1.setFuelCapacity(60);

        Hovercraft h1 = new Hovercraft("black", 1,2,30);
//        h1.setColor("Black");
//        h1.setNumberOfPassengers(1);
//        h1.setCargoCapacity(2);
//        h1.setFuelCapacity(30);

        System.out.println("The car is: " + c1.getColor() + " and can have " + c1.getNumberOfPassengers() + " " +
                "passengers");
        System.out.println("The moped is: " + m1.getColor() + " and can have " + m1.getNumberOfPassengers() + " " +
                "passengers");
        System.out.println("The semi truck is: " + s1.getColor() + " and cargo capacity is: " + s1.getCargoCapacity());
        System.out.println("The hovercraft is: " + h1.getColor() + " and can have " + h1.getFuelCapacity() + " fuel");;

    }
}
