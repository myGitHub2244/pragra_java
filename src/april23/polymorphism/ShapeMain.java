package april23.polymorphism;

public class ShapeMain {

    public static void main(String[] args) {

        Circle cir=new Circle(10.5);
        Rectangle rec=new Rectangle(10,20);

        cir.getArea();
        rec.getArea();

        //Using Upcasting

        Shape cir1=new Circle(12);                      //Super Class reference variable for Sub class object
        Shape rec1=new Rectangle(15,30);       //Super Class reference variable for Sub class object

        cir1.getArea();
        rec1.getArea();

    }


}
