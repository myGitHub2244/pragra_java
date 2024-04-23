package april20.compositions;

public class Employee {
    int id;
    String name;
    double salary;
    //String address;
    Address address;

    public Employee(int id, String name, double salary, Address address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public void printEmployeeDetails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
        System.out.println(address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}
