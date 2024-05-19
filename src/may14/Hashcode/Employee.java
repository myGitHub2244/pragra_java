package may14.Hashcode;

import java.util.Objects;

public class Employee {

    String name;
    String lastName;
    int phones;

    public Employee(String name, String lastName, int phones) {
        this.name = name;
        this.lastName = lastName;
        this.phones = phones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return phones == employee.phones && Objects.equals(name, employee.name) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, phones);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phones=" + phones +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPhones() {
        return phones;
    }
}
