package april09;

public class StaticBlock {

   /* Static block is executed when the Class is loaded. Hence, it is possible to execute the static block
    without the main method. it can be done via command line using javac and java commands !!!

    On doing so, the static block executed but there was runtime error:
    error: can't find main(String[]) method in class: april09.StaticBlock

   */

    static{
        System.out.println("Static block is always executed first. This can be executed without main method via command line");
    }

    public static void main(String[] args) {
        System.out.println("This is executed after Static block");
    }
}
