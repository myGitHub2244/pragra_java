package april20.compositions;

public class EmployeeMain {
    public static void main(String[] args) {

        //Employee employee1 = new Employee(101, "Ravneet", 100000.00, " Mississauga 110 Matheson Blvd, , L7K M3Y, CA");

        Employee employee = new Employee(101, "Ravneet", 100000.00,
                new Address("110 Matheson", "Mississauga", "CA" ,"kgdfjhs"));
        // System.out.println(employee.address.city);

        System.out.println(employee);
    }
}

/*

Car
Laptop
Mobile
Bank
Employee
Student
Country


 */