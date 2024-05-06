package assignment6.OOP.interfaces;

public class Penguin implements Swimmable{
    @Override
    public void feed() {
        System.out.println("Herbivorous animals");
    }

    @Override
    public void makeSound() {
        System.out.println("Quacks");
    }

    @Override
    public void swim() {
        System.out.println("Can swim");
    }
}
