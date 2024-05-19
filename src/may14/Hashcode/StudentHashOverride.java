package may14.Hashcode;

import java.util.Objects;

public class StudentHashOverride {
    String name;
    String lastName;

    public StudentHashOverride(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentHashOverride that = (StudentHashOverride) o;
        return Objects.equals(name, that.name) && Objects.equals(lastName, that.lastName);
    }

    //Override the hashCode method to calc using Object attributes values
    //so that objects having same values will have same hashcode also calculated in this method

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);        //calc hashcode using Objects hash() method. Note: this is another Objects class and not Object class
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
                '}';
    }
}
