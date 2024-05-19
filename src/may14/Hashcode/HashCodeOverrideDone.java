package may14.Hashcode;

import java.util.HashMap;
import java.util.Map;

public class HashCodeOverrideDone {

    public static void main(String[] args) {
        StudentHashOverride s1=new StudentHashOverride("John","Cen");       //Create Key
        StudentHashOverride s2=new StudentHashOverride("Pete","Bravo");

        Map<StudentHashOverride,Integer> map=new HashMap<>();   //Create a Map with Student as Key and Integer i.e. marks as Values
        map.put(s1,70);
        map.put(s2,80);
        System.out.println("map = " + map);
        System.out.println("Marks of Student s1 is: "+ map.get(s1));

        //Now try to retrieve with another Key (new object) which has value exact same as s1:
        System.out.println("Marks of Student s1 is: "+ map.get(new StudentHashOverride("John","Cen"))); //returns null

        //generate and print hashcodes:          --> Should be same for both objects since we have overridden the hashCode() method to always return same hashcode for same value of an object
        System.out.println("s1 = " + s1.hashCode());
        System.out.println("new StudentHashOverride(\"John\",\"Cen\") = " + new StudentHashOverride("John", "Cen").hashCode());

        //Above although we tried to retrieve using exact same key, still it could not retrieve the corresponding value !
        //Reason: The hashcode of the new object created in line# 25 is not same as hashcode of object s1
        //          Hence, if we use the new object to retrieve it will NOT match with s1 hashcode hence does not retrieve it !

        //Solution: Override the hashcode method in Student class, so that each time a new object is created with exact same
        //          values, the hashcode generated will also be exact same !

    }


}
