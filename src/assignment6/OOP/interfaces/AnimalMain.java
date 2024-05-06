package assignment6.OOP.interfaces;

public class AnimalMain {
    public static void main(String[] args) {
        Climable lion=new Lion();
        lion.feed();
        lion.makeSound();
        lion.climb();

        Swimmable penguin=new Penguin();
        penguin.feed();
        penguin.makeSound();
        penguin.swim();

    }
}
