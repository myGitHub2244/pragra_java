package assignment6.OOP.interfaces;

public interface Animal {
    String breathe="Can Breathe";   //Must initialize bcoz attributes of Interfaces are public final by default i.e. constants
    void feed();
    void makeSound();
}
