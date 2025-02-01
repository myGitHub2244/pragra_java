package may04.Generics;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {


        List list = new ArrayList();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add("Lovepreet");      //it allows to add String to List of Integers !! Hence, there is no type safety which is Issue
        list.add("Vasu");
        list.add("Prableen");
        list.add(23.44);

        System.out.println(list);

// use to enter salary
        // 10000, 20000, pragra
        // Javascript ----> typescript      ---> Typescript checks type safety at compile time itself !



    }
}
