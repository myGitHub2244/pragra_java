package april06.constructor;

public class Mobile {
    double weight;
    String brand;
    double price;
    String color;

    //receiveCalls
    //outgoingCalls
    //texting

    public void makeOutgoingCalls(String color){
        System.out.println("Make Outgoing Calls using " + color+ " color iPhone");
    }

    public void receiveIncomingCalls(){
        System.out.println("Receive Incoming Calls");
    }

    public void texting(){
        System.out.println("Send a Text");
    }

}
