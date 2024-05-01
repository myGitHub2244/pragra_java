package april27.Interfaces.Iphone;

public abstract class SmartPhone implements Calculator,Camera,Computer,MusicPLayer{

    @Override
    public void calculate() {

    }

    @Override
    public void clickPhoto() {

    }

    @Override
    public void processData() {

    }

    @Override
    public void playMusic() {

    }

    public abstract void touchScreen();     //Abstract method to enforce Child class to Implement it. Hence, Class also Abstract

}
