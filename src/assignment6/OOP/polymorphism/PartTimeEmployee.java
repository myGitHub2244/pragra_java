package assignment6.OOP.polymorphism;

public class PartTimeEmployee extends Employee {

    public PartTimeEmployee(int employeeID, String employeeName) {
        super(employeeID, employeeName);
    }

    public void calculatePay(){
        System.out.println("Part Time Employee: Calculate Pay");
    }

}
