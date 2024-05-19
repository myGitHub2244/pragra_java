package may18.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {

        Map<String,String> map1=new HashMap<>();
        map1.put("James","Cameroon");
        map1.put("Nick","Cage");

        //If there is too much Retrieval to be done then use ConcurrentHashMap
        ConcurrentHashMap<String,String> con=new ConcurrentHashMap<>();

        Set<Map.Entry<String,String>> entries=map1.entrySet();

        //to know the 'for-loop' structure just type map1.entrySet().for   --> Intellij will provide the for each loop !

        for(Map.Entry<String,String> entry:entries){
            System.out.println(entry);      //print Key-Value
        }

        for(Map.Entry<String,String> entry:entries){
            System.out.println(entry.getKey());      //print Key only
        }

        for(Map.Entry<String,String> entry:entries){
            System.out.println(entry.getValue());      //print Value only
        }

    }


}
