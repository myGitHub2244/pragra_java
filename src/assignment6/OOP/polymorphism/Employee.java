package assignment6.OOP.polymorphism;

public class Employee {
    int employeeID;
    String employeeName;

    public Employee(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public void getInfo(){
        System.out.println("employeeID = " + employeeID);
        System.out.println("employeeName = " + employeeName);
    }
    public void calculatePay(){
        System.out.println("Employee: Calculate Pay");
    }

}
