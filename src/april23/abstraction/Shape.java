package april23.abstraction;

public abstract class Shape {
    public abstract void getArea(); //abstract method does not have a body/implementation!
public void show(){
    System.out.println("Non abstract method");
}
}

class Square extends Shape{

    @Override
    public void getArea() {
        System.out.println("getArea is implemented in sub-class");
    }
}
