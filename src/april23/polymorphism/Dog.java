package april23.polymorphism;

public class Dog extends Animal {
        public void makeSound(){

//            Note: Method Overriding: if we keep exact same code as Super Class then compiler gives error
//            System.out.println("Animal is making sound");

//            We must provide implementation different than that of Super Class
            System.out.println("Dog is barking");
        }
    }
