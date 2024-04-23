package april20.inheritancedemo;

public class Car extends Vehicle {

    double price;

    public Car(String color, String make, String model, int speed, int year, double price) {
        super(color, make, model, speed, year);
        this.price = price;
    }
    public void printCar(){
        System.out.println(super.year);
        System.out.println(super.color);
    }

}


// this keyword?   vs Super keyword


/*

this ---> current

this();


Super
to refer the parent/super class
variables
methods
constructor




 */
