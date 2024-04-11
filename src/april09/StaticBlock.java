package april09;

public class StaticBlock {

    static{
        System.out.println("Static block is always executed first");
    }

    public static void main(String[] args) {
        System.out.println("This is executed after Static block");
    }
}
