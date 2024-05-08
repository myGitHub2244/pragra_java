package assignment6.OOP.interfaces;

public class Lion implements Climable {
    @Override
    public void climb() {
        System.out.println("Can climb");
    }
    @Override
    public void feed() {
        System.out.println("Carnivorous animal");

    }
    @Override
    public void makeSound() {
        System.out.println("Roars");
    }
}
