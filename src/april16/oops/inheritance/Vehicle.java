package april16.oops.inheritance;

public class Vehicle {

    String brand;
    String model;
    int year;

//    public Vehicle(String brand, String model, int year) {
//        this.brand = brand;
//        this.model = model;
//        this.year = year;
//    }


    public void displayInfo(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(year);
    }
}
