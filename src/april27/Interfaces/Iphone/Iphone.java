package april27.Interfaces.Iphone;

public class Iphone extends SmartPhone{

    @Override
    public void touchScreen() {
        System.out.println("Touchscreen Enabled");
    }

    public void isAppleProduct(){
        System.out.println("Apple Product");
    }

}
