package vehicle;

import java.util.Random;

public class Car{


    private static int vehicleCounter = 2000;
    private static final String CAR_FACTORY_ID = "Norwood";
    private String carID;
    private String color;
    private String factory;
    private int numberOfDoors;
    private double price;
    private int mileage;
    public String doYouLikeIt;


    public Car(){
        vehicleCounter = getVehicleCounter();
        factory = getFactory();
        carID = "VIN-" + factory + "-" + vehicleCounter;
        numberOfDoors = 2;
        color = "Red";
        mileage = 0;
        Random gen = new Random();
        price = gen.nextInt(45000 - 35000 + 1)+35000;
        doYouLikeIt = "Yes";
        vehicleCounter++;

    }//end of Car1 constructor
    public Car(String color, int numberOfDoors){
        this();
        this.color = color;
        this.numberOfDoors = numberOfDoors;

    }//end of Car2 constructor

    public Car(String color, int numberOfDoors, double price, int mileage){
        this(color, numberOfDoors);
        this.price = price;
        this.mileage = mileage;

    }//end of Car3 constructor


    public static int getVehicleCounter(){
        return vehicleCounter;

    }//end of getVehicleCounter

    public static void setVehicleCounter(int vehicleCounter){
        Car.vehicleCounter = vehicleCounter;

    }//end of setVehicleCounter

    public String getCarID(){
        return carID;

    }//end of getCarID

    public String getColor(){
        return color;

    }//end of getColor

    public void setColor(String color){
        this.color = color;
    }//end of setColor

    public String getFactory(){
        factory = CAR_FACTORY_ID;
        return factory;
    }//end of getFactory

    public int getNumberOfDoors(){
        return numberOfDoors;
    }//end of getNumberOfDoors

    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }//end of setNumberOfDoors

    public double getPrice(){
        return price;
    }//end of getPrice

    public static void classDisplayInfo(){
        System.out.println("================================================");
        System.out.println("Car Class Info");
        System.out.println("================================================");
        System.out.println("vehicleCounter: \t" + getVehicleCounter());
        System.out.println("CAR_FACTORY_ID: \t" + CAR_FACTORY_ID);

    }//end of classDisplayInfo

    public void displayInfo(){
        System.out.println();
        System.out.println("================================================");
        System.out.println("CAR INFO");
        System.out.println("================================================");
        System.out.println("Car ID: \t\t\t" + getCarID());
        System.out.println("Factory: \t\t\t" + getFactory());
        System.out.println("Number of Doors:\t" + getNumberOfDoors());
        System.out.println("Color: \t\t\t\t" + getColor());
        System.out.println("Mileage: \t\t\t" + mileage);
        System.out.printf("Price: \t\t\t\t$%.2f\n", getPrice());
        System.out.println("Do you like it: \t" + doYouLikeIt);
        System.out.println();

    }//end of displayInfo


}//end of Car
