package april27.Interfaces;

public interface Furniture {

    int numlegs=4;

    void area();
    void material();
    void perimeter();

}

abstract class chair implements Furniture{
}

class Table extends chair implements Furniture{

    @Override
    public void area() {
        System.out.println("Area of Table");
    }

    @Override
    public void material() {
        System.out.println("Material of Table");
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of Table");
    }
}