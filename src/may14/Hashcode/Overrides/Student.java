package may14.Hashcode.Overrides;

import java.util.Objects;

public class Student {

    String name;
    String lastName;
    Integer id;

    public Student(String name, String lastName, Integer id) {
        this.name = name;
        this.lastName = lastName;
        this.id=id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student that = (Student) o;
        return Objects.equals(name, that.name) && Objects.equals(lastName, that.lastName) && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {             //My Override
        return Objects.hash(name, lastName, id);        //calc hashcode using Objects hash() method. Note: this is another Objects class and not Object class
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}
