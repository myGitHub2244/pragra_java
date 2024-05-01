package april23.abstraction;

public abstract class Vehicle {

    public abstract  boolean hasEngine(int x);
    public abstract  boolean hasSteetingWheel();
}
class Tesla extends Vehicle {
    @Override
    public boolean hasEngine(int x) {
        return false;
    }

    @Override
    public boolean hasSteetingWheel() {
        System.out.println("Half steering");
        return true;
    }

    public void screen(){
        System.out.println("tesla has big screen");
    }
}
