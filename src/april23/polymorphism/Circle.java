package april23.polymorphism;

public class Circle extends Shape{

    double rad;

    Circle(double rad){
        this.rad=rad;
    }
    @Override
    public void getArea() {
        System.out.println("Area of circle: " + Math.PI * rad * rad);
    }
}
