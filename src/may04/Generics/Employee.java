package may04.Generics;

import java.util.ArrayList;

public class Employee<T, R> {

    T id;
    R name;

    public Employee(T id, R name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {              //override the toString method. Else toString of Object class will be used which print hashcode
        return "Employee{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}


class Main {
    public static void main(String[] args) {

        //Use of Generics makes it Type safety at Compile-Time by limiting to Allowable data-type. Else using just Object type would make it less Type safety
        Employee<String, String> employee = new Employee<String, String>("101","Pragra");
        System.out.println(employee);       //this will call toString method to print the object.

        Employee<Integer,String> employee1=new Employee<>(102,"Pankaj");
        System.out.println(employee1);

        Employee<Integer,Integer> emp2=new Employee<>(103,104);
        System.out.println(emp2);


    }
}

// flexitbility of working with any type of data
// type safety


// create a class Vehicle<T,R> ----
