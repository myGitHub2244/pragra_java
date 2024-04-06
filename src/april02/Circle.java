package april02;

public class Circle {

    double radius;

    public void setRadius(double rad){
        radius=rad;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }

    public double getCircumference(){
        return 2*3.14*radius;
    }


    public static void main(String[] args) {
        Circle cir=new Circle();

        cir.setRadius(5);
        double area=cir.getArea();
        System.out.println("Area of Circle: "+area);

        double circumference=cir.getCircumference();
        System.out.println("Circumference of Circle: "+circumference);

    }
}
