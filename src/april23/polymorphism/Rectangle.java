package april23.polymorphism;

public class Rectangle extends Shape{

    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public void getArea() {
        System.out.println("Area of rectangle: " + length*breadth);
    }
}
