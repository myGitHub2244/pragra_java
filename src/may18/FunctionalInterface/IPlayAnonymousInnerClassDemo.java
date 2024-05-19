package may18.FunctionalInterface;

public class IPlayAnonymousInnerClassDemo {

    public static void main(String[] args) {

        IPlay iplay=new IPlay() {               //Implement the abstract using anonymous Inner class
            @Override
            public String cricketPlay() {
                return "Football";
            }
        };

        System.out.println("iplay.cricketPlay() = " + iplay.cricketPlay());


    }


}
