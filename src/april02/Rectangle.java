package april02;

public class Rectangle {

    double length;
    double width;

    public void setSide(double len,double wid) {
        length=len;
        width=wid;
    }
    public double getArea(){
        return length*width;
    }

    public double getArea1(double length,double width){
        return length*width;            //this is just using arguments to calc. It is not referring to Objects length/width
    }

    public double getCircumference(){
        return 2*(length+width);
    }


    public static void main(String[] args) {
        Rectangle rec=new Rectangle();

//Object's attributes length and width are not set until we set them. Below example shows values are still Default
        double area1=rec.getArea1(2,4);
        System.out.println("Area of Rectangle: "+area1);
        System.out.println("Length: "+rec.length);  //proves objects attributes are not set. Hence returns 0
        System.out.println("Width: "+rec.width);  //proves objects attributes are not set. Hence returns 0


//Object's attributes has to be explicity set : length and width
        rec.setSide(5,10);
        double area=rec.getArea();
        System.out.println("Area of Rectangle: "+area);

        double circumference=rec.getCircumference();
        System.out.println("Circumference of Rectangle: "+circumference);



    }
}
