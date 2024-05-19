package may14.Hashcode;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMap {

    public static void main(String[] args) {

        Map<Employee,Integer> empMap=new HashMap<>();

        Employee emp1 = new Employee("John","Trovolta",923929239);
        Employee emp2 = new Employee("Smith","John",234992229);
        Employee emp3 = new Employee("Pete","Gere",113929239);

        empMap.put(emp1,75);
        empMap.put(emp2,85);
        empMap.put(emp3,95);

        System.out.println("emp1.get(emp1) = " + empMap.get(emp1));

    }


}
