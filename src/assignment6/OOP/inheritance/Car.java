package assignment6.OOP.inheritance;

public class Car extends Vehicle{
    int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    public void getNumDoors(){
    System.out.println("numDoors = " + numDoors);
}


}
