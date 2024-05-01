package assignment6.OOP.polymorphism;

public class EmployeeMain {
    public static void main(String[] args) {

        Object obj;
        Employee partEmp = new PartTimeEmployee(101,"John Ce");
        Employee fullEmp = new FullTimeEmployee(102,"Dwayne Jo");

        partEmp.getInfo();
        partEmp.calculatePay();

        fullEmp.getInfo();
        fullEmp.calculatePay();
    }
}
