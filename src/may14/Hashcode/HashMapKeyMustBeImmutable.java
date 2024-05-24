package may14.Hashcode;

import java.util.HashMap;
import java.util.Iterator;

//HOW TO MAKE A CLASS IMMUTABLE -> CASE: CLASS OBJECT IS BEING USED AS KEY IN A HASHMAP
//BASICALLY ONCE AN OBJECT IS CREATED, THE ATTRIBUTES OF THAT OBJECT SHOULD NOT BE ALLOWED TO CHANGE

/*
To create an immutable class in Java, you need to follow these general principles:
---------------------------------------------------------------------------------------
Declare the class as final so it can’t be extended.
Make all of the fields private so that direct access is not allowed.
Don’t provide setter methods for variables.
Make all mutable fields final so that a field’s value can be assigned only once.
Initialize all fields using a constructor method performing deep copy.
Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.

 */
    public final class HashMapKeyMustBeImmutable {  //Make Class Final so that it cannot be extended
                                                    // hence Child class cannot add more attributes (mutable) to the Object

        private final int id;           //make all instance variables as private and final. Setup these via parameterized constructor
        private final String name;
        private final HashMap<String,String> testMap;

        public int getId() {            //ONLY GETTER METHODS. NO SETTER METHODS
            return id;
        }

        public String getName() {
            return name;
        }

        // Getter function for mutable objects

        public HashMap<String, String> getTestMap() {
            return (HashMap<String, String>) testMap.clone();   //IN GETTER METHODS RETURN CLONE OF OBJECT AND NOT OBJECT ITSELF !
        }

        // Constructor method performing deep copy !!

        public HashMapKeyMustBeImmutable(int i, String n, HashMap<String,String> hm){
            System.out.println("Performing Deep Copy for Object initialization");
            this.id=i;
            this.name=n;

            HashMap<String,String> tempMap=new HashMap<String,String>();
            String key;
            Iterator<String> it = hm.keySet().iterator();
            while(it.hasNext()){
                key=it.next();
                tempMap.put(key,hm.get(key));
            }
            this.testMap=tempMap;
        }

        // Test the immutable class

        public static void main(String[] args) {
            HashMap<String, String> h1 = new HashMap<String,String>();
            h1.put("1", "first");
            h1.put("2", "second");

            String s = "original";

            int i=10;

            HashMapKeyMustBeImmutable immuKey = new HashMapKeyMustBeImmutable(i,s,h1);

            // print the immuKey values
            System.out.println("immuKey id: "+immuKey.getId());
            System.out.println("immuKey name: "+immuKey.getName());
            System.out.println("immuKey testMap: "+immuKey.getTestMap());
            // change the local variable values
            i=20;
            s="modified";
            h1.put("3", "third");
            // print the values again
            System.out.println("immuKey id after local variable change: "+immuKey.getId());
            System.out.println("immuKey name after local variable change: "+immuKey.getName());
            System.out.println("immuKey testMap after local variable change: "+immuKey.getTestMap());

            HashMap<String, String> hmTest = immuKey.getTestMap();
            hmTest.put("4", "new");

            System.out.println("immuKey testMap after changing variable from getter methods: "+immuKey.getTestMap());

        }

    }

