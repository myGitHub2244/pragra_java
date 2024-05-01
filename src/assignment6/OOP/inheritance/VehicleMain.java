package assignment6.OOP.inheritance;

public class VehicleMain {

    public static void main(String[] args) {
        Car car=new Car("Honda","Pilot",2023,4);
        car.displayInfo();
        car.getNumDoors();

        MotorCycle motorCycle=new MotorCycle("Yamaha","RX350",1990,6);
        motorCycle.displayInfo();
        motorCycle.getNumCylinders();

        ElectricCar electricCar=new ElectricCar("Tesla","E class",2023,2,1000);
        electricCar.displayInfo();
        electricCar.chargeBattery();

    }


}
