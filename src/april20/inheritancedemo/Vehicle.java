package april20.inheritancedemo;

public class Vehicle {

    String color;
    String make;
    String model;
    int speed;
    int year;

    public Vehicle(String color, String make, String model, int speed, int year) {
        this.color = color;
        this.make = make;
        this.model = model;
        this.speed = speed;
        this.year = year;
    }

    public void printCarDetails(){
        System.out.println("Color : " +color);
        System.out.println("Make :"+make);
        System.out.println("Model : "+model);
        System.out.println("Speed :"+speed);
        System.out.println("Year "+year);

    }

//    public Car getCarObject(){
//        Car car = new Car("Blue", "Honda" , "civic", 200 , 2024 , 232837.23);
//
//        return car;
//    }

        public Car getCarObject(){
        return new Car("Blue", "Honda" , "civic", 200 , 2024 , 232837.23);
   }



}
