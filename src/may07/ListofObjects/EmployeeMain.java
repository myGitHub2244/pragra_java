package may07.ListofObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EmployeeMain {

    public static void main(String[] args) {

        //There are 2 ways to create a List of Employee class objects:

        //Method #1
        List<Employee> list1=new ArrayList<>();
        list1.add(new Employee("John","john@gmail.com",10,"Canada"));
        list1.add(new Employee("Vishal","vishal@gmail.com",20,"India"));
        list1.add(new Employee("Arjun","arjun@gmail.com",30,"US"));
        list1.add(new Employee("Alex","alex@gmail.com",40,"UK"));
        list1.add(new Employee("Steve","steve@gmail.com",50,"Aus"));

        //Method #2
        Employee emp1=new Employee("John","john@gmail.com",10,"Canada");
        Employee emp2=new Employee("Vishal","vishal@gmail.com",20,"India");
        Employee emp3=new Employee("Arjun","arjun@gmail.com",30,"US");
        Employee emp4=new Employee("Alex","alex@gmail.com",40,"UK");
        Employee emp5=new Employee("Steve","steve@gmail.com",50,"Aus");

        List<Employee> list= Arrays.asList(emp1,emp2,emp3,emp4,emp5);

        System.out.println(list);

        Iterator<Employee> iterator= list.iterator();

        while(iterator.hasNext()){
            if(iterator.next().age>35)
                System.out.println("Name: "+iterator.next().email);
        }

        System.out.println();

        for(Employee e:list){
            if(e.getAge()>35){              //using Employee class getter method getAge
                System.out.println(e.email);
            }
        }

        System.out.println();

        for (int i=0;i<list.size();i++){
            if(list.get(i).age>35){         //using get method of List
                System.out.println("Email: "+ list.get(i).email);
            }
        }

    }


}
