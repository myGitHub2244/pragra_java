package april06.constructor;

public class AnimalMain {

    public static void main(String[] args) {

        Animal ani=new Animal();    //Call default constructor by not passing any arguments
        //NOTE: if the Animal class does not have Default Constructor present the Compiler will not
        //      create default constructor in this case because there is a parameterized constructor is present in Animal

        ani=new Animal(20,"green",4,false);//Call default constructor by not passing 4 arguments
        ani.Animal();

    }

}
