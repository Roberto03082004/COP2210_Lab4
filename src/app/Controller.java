package app;

import vehicle.Car;

public class Controller {

    public static void main(String[] args) {
        yourInfoHeader();
        System.out.println();

        Car car1 = new Car();
        car1.displayInfo();

        Car.classDisplayInfo();
        Car car2 = new Car("White", 4);
        car2.displayInfo();

        Car car3 = new Car("Black", 2);
        car3.displayInfo();

        Car car4 = new Car("Blue", 4, 38500, 10432);
        car4.displayInfo();

        System.out.println();
        System.out.println();
        System.out.println("================================================");
        System.out.println("Working with instance method");
        System.out.println("================================================");
        car4.setColor("Green");
        car4.setNumberOfDoors(2);
        car4.displayInfo();

        System.out.println();
        System.out.println();
        System.out.println("================================================");
        System.out.println("Working with public instance variable");
        System.out.println("================================================");
        car2.displayInfo();
        car2.doYouLikeIt = "No";
        car2.displayInfo();

        System.out.println();
        System.out.println();
        System.out.println("================================================");
        System.out.println("Working with build-in string method");
        System.out.println("================================================");

        String color = car1.getColor();
        System.out.printf("Color of instance c1:    \t\t\t\t%s\n", color);
        System.out.printf("Length of Color of instance c1: \t\t%d\n", color.length());
        System.out.println();

        String id = car2.getCarID();
        System.out.printf("CarID of instance c2:    \t\t\t\t%s\n", id);
        System.out.printf("Index of 'd' of c2's CarID: \t\t\t%d\n", id.indexOf('d'));
        System.out.println();

        System.out.printf("CarID of instance c2:    \t\t\t\t%s\n", id);
        System.out.printf("Index of the first 'o' of c2's CarID: \t%d\n", id.indexOf('o'));
        System.out.println();

        System.out.printf("CarID of instance c2:    \t\t\t\t%s\n", id);
        int firstOccurrence = id.indexOf('o');
        int secondOccurrence = id.indexOf('o', firstOccurrence + 1);
        System.out.printf("Index of the second 'o' of c2's CarID:  %d\n", secondOccurrence);

    }//end of main

    public static void yourInfoHeader(){

        System.out.println("================================================");
        System.out.println("PROGRAMMER:  " + "Roberto Callejas");
        System.out.println("PANTHER ID:  " + "6360177");
        System.out.println();
        System.out.println("CLASS \t\t COP2210 ");
        System.out.println("SECTION: \t " + "U02C");
        System.out.println("SEMESTER: \t " + "Summer 2023");
        System.out.println("CLASS TIME: \t " + "10:00 AM - 12:50 PM");
        System.out.println();
        System.out.println("Assignment:  " + "Lab 4");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other person");
        System.out.println("================================================");
        System.out.println();

    }//end of yourInfoHeader
}//end of Controller
