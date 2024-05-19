package may18.FunctionalInterface;

public class PlayCricketMain {

    public static void main(String[] args) {

        //IMPORTANT: If we use Obj ref of Parent, then Attribute of Parent is fetched. But incase of Methods child class methods are fetched.

        IPlay play1=new PlayCricket();
        System.out.println("play1.a = " + play1.a);       //Polymorphism: If Obj ref is Interface Prints attribute from Parent Class

        PlayCricket play2=new PlayCricket();
        System.out.println("play2.a = " + play2.a);       //Polymorphism: If Obj ref is Child Prints attribute from Child Class

        play1.cricketPlay3();   //Polymorphism: Even if Obj ref is Interface, but always executes child class methods
        play2.cricketPlay3();   //Polymorphism: Obj ref is Child class, always executes child class methods

    }

}
