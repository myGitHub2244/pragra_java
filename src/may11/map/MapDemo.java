package may11.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapDemo {

    public static void main(String[] args) {


        Map<String,Integer> empSalary=new HashMap<>();
        empSalary.put("Andrew",110000);     //Order is not maintained
        empSalary.put("Brittany",120000);   //calc hashcode for Key, assigns an Index and stores it in HashMap
        empSalary.put("Charles",100000);
        empSalary.put("Zenith",150000);
        empSalary.put("Charles",111000);    //duplicate key no new entry BUT VALUE IS OVERRIDDEN by this value !
        empSalary.put("Zenith2",150000);
        empSalary.put("NullValue",null);
        empSalary.put(null,null);           //null key is allowed, valid. Only 1 null key because key should be Unique.
                                    //null will be allocated topmost index of HashMap container
        empSalary.put(null,121212);

        System.out.println("empSalary = " + empSalary);
        System.out.println("empSalary.get(\"Charles\") = " + empSalary.get("Charles"));

        //print keys
        for(String i: empSalary.keySet()){
            System.out.println("Keys = " + i);
        }

        //print values
        for(Integer i: empSalary.values()){     //using int will give NullPointerException since one of value is Null. Hence use INTEGER instead!
            System.out.println("Values = " + i);
        }

        //Print keys and corresponding values:
        for(String i: empSalary.keySet()){
            System.out.println("Key = " + i+" Values: "+ empSalary.get(i));
        }


    }
}
