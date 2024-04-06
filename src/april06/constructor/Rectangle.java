package april06.constructor;

public class Rectangle {

    double length;
    double width;

    Rectangle(double length,double width){
        System.out.println("Parameterized Constructor");
        this.length=length;
        this.width=width;
    }

    Rectangle(double length,double width,boolean flag){
        System.out.println("Parameterized Constructor");
        this.length=length;
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

        Rectangle rec2=new Rectangle(5,6,true);
        System.out.println("Area: "+rec2.calcArea());
        System.out.println("Perimeter: " + rec2.calcPerimeter());

    }

}
