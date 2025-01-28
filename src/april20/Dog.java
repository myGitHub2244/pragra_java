package april20;

public class Dog extends Animal{


    String color;   //we can override the parent class variable in child class !

    public void makeSound(){
        location = "India"; //Parent class variable can be directly accessed in child !
        super.color = "black";  //Incase of variables override we can use super to refer to parent class!
        color = "brown";
        System.out.println("Dog location is: "+location); //
        System.out.println("Dog is barking...and has color: "+color);
        System.out.println("Animal has color: "+super.color);

    }
}
