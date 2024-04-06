package april06.constructor;

public class Car {

    String color;
    String brand;
    double price;

Car(){
    System.out.println("Hello this is Default Constructor");
    System.out.println("Default Constructor is optional and is created by compile if not present PROVIDED PARAMETERIZED CONSTRUCTOR IS ALSO NOT PRESENT ");
    System.out.println("*** Default constructor initializes the object attributes with default values ***");
    System.out.println("Default values for Non-primitive e.g. String is null, and Primitive is 0/0.0");
    }
    public void displayInfo(){
        System.out.println("color = " + color);
        System.out.println("brand = " + brand);
        System.out.println("price = " + price);

    }
}
