package assignment6.OOP.inheritance;

public class ElectricCar extends Car{
    int batterCapacity;

    public ElectricCar(String make, String model, int year, int numDoors, int batterCapacity) {
        super(make, model, year, numDoors);
        this.batterCapacity = batterCapacity;
    }

    public void chargeBattery(){
        System.out.println("Electric Car: Charge battery");
    }


}
