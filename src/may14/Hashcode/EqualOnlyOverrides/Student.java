package may14.Hashcode.EqualOnlyOverrides;

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
    public boolean equals(Object obj) {
        return super.equals(obj);
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
