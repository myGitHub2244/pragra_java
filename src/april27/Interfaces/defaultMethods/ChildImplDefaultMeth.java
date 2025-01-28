package april27.Interfaces.defaultMethods;

public class ChildImplDefaultMeth implements DefaultMeth2, DefaultMeth1 {

//    Child class implements multiple Interfaces that have same default method names, hence it is mandatory to override in Child !

    @Override
    public int numberSpices(){
        return 8;
    }

    public static void main(String[] args) {
        DefaultMeth1 def1 = new ChildImplDefaultMeth();
        System.out.println("def1.numberSpices() = " + def1.numberSpices()); //calls overridden method from child class

        DefaultMeth2 def2 = new ChildImplDefaultMeth();
        System.out.println("def2.numberSpices() = " + def2.numberSpices()); //calls overridden method from child class

        ChildImplDefaultMeth ch1 = new ChildImplDefaultMeth();
        System.out.println("ch1.numberSpices() = " + ch1.numberSpices()); //calls overridden method from child class

    }

}
