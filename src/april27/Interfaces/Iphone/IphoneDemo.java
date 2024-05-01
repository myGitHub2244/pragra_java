package april27.Interfaces.Iphone;

public class IphoneDemo {

    public static void main(String[] args) {
        SmartPhone iphone = new Iphone();
        iphone.touchScreen();
        iphone.calculate();
        iphone.clickPhoto();
        iphone.processData();
        iphone.playMusic();
//        iphone.isAppleProduct();          --> Cannot call Child class exclusive method using Parent Interface Obj Reference


        Iphone iphone1=new Iphone();
        iphone1.isAppleProduct();
        iphone1.touchScreen();
        iphone1.calculate();
        iphone1.clickPhoto();
        iphone1.processData();
        iphone1.playMusic();
    }
}
