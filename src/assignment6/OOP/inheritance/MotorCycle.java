package assignment6.OOP.inheritance;

public class MotorCycle extends Vehicle{
    int numCylinders;

    public MotorCycle(String make, String model, int year, int numCylinders) {
        super(make, model, year);
        this.numCylinders = numCylinders;
    }

    public void getNumCylinders(){
    System.out.println("numCylinders = " + numCylinders);
}


}
