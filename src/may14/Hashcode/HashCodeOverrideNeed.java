package may14.Hashcode;

import java.util.HashMap;
import java.util.Map;

public class HashCodeOverrideNeed {

    public static void main(String[] args) {
        Student s1=new Student("John","Cen");       //Create Key
        Student s2=new Student("Pete","Bravo");

        Map<Student,Integer> map=new HashMap<>();   //Create a Map with Student as Key and Integer i.e. marks as Values
        map.put(s1,70);     //if we add objects to Map by adding references then any update to Object i.e. Key itself still retrieves correct Value
        map.put(s2,80);
        System.out.println("map = " + map);
        System.out.println("s1.hashCode() = " + s1.hashCode());
        System.out.println("Marks of Student s1 is: "+ map.get(s1));

        //Update the name attribute in object s1
        s1.setName("Michael");  //replace name John with Michael
        System.out.println("s1.hashCode() = " + s1.hashCode());
        //map.get(s1) below will still retrieve correct corresponding value (marks) even if key S1 (name) was updated
        System.out.println("Marks of Student s1 is: "+ map.get(s1));

        //Now try to retrieve with another Key (new object) which has value exact same as s1:
        System.out.println("new Student(\"Michael\",\"Cen\").hashCode() = " + new Student("Michael", "Cen").hashCode());
        System.out.println("Marks of Student s1 is: "+ map.get(new Student("Michael","Cen"))); //returns null

        //Above although we tried to retrieve using exact same key, still it could not retrieve the corresponding value !
        //Reason: The hashcode of the new object created in line# 25 is not same as hashcode of object s1, bcoz hashCode (Obj class) returns memory location of objects
        //          Hence, if we use the new object to retrieve it will NOT match with s1 hashcode hence does not retrieve it !

        //Solution: Override the hashcode method in Student class, so that each time a new object is created with exact same
        //          values, the hashcode generated will also be exact same !

        /*NOTE:
        hashCode() method: hashCode() method is used to get the hash code of an object. hashCode() method of the object class returns the memory reference
        of an object in integer form. Definition of hashCode() method is public native hashCode(). It indicates the implementation of hashCode() is native
        because there is not any direct method in java to fetch the reference of the object.

         */

    }


}
