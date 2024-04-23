package april20.inheritancedemo;

public class CarMain {
    public static void main(String[] args) {

        Car car = new Car("Blue", "Honda" , "civic", 200 , 2024 , 232837.23);
        car.printCarDetails();
        car.printCar();
        car.getCarObject();

    }
}
