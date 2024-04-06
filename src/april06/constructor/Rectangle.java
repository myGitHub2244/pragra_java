package april06.constructor;

public class Rectangle {

    double length;
    double width;

    Rectangle(double length){
        System.out.println("Parameterized Constructor to init Length");
        this.length=length;
    }

    Rectangle(double length,double width){
        this(length);   // Call another parameterized constructor using 1 argument. Should be first line  **********
    //  this();     //cannot call 2nd constructors !

        System.out.println("Parameterized Constructor to init Width");
        this.width=width;
    }



    // Need to create Default Constructor  manually Java will not create bcoz parameterized constructor is present !!
    Rectangle(){
        System.out.println("Default Constructor");
    }

    public double calcArea(){
        return length*width;
    }

    public double calcPerimeter(){
        return 2*(length+width);
    }

    public static void main(String[] args) {
        Rectangle rec=new Rectangle();
        System.out.println("Area: "+rec.calcArea());
        System.out.println("Perimeter: " + rec.calcPerimeter());


        Rectangle rec1=new Rectangle(2,3);
        System.out.println("Area: "+rec1.calcArea());
        System.out.println("Perimeter: " + rec1.calcPerimeter());

        Rectangle rec2=new Rectangle(5);
        System.out.println("Area: "+rec2.calcArea());
        System.out.println("Perimeter: " + rec2.calcPerimeter());

    }

}
