package may18.FunctionalInterface;

public class PlayCricket implements IPlay {
    int a=15;

    @Override
    public String cricketPlay() {       //override the abstract method
        return "PlayCricket";
    }

    @Override
    public String cricketPlay3() {      //Since Interface allows multiple inheritance and same default method is present
        // in both Interface IPlay and IPlay2
        // then to ensure we call correct intended default method we need to override that default method in child class
        System.out.println("Inside child class");
        return IPlay.super.cricketPlay3();
    }
}
