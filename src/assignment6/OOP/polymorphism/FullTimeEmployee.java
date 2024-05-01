package assignment6.OOP.polymorphism;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int employeeID, String employeeName) {
        super(employeeID, employeeName);
    }

    public void calculatePay(){
        System.out.println("Full Time Employee: Calculate Pay");
    }

}
