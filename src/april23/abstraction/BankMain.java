package april23.abstraction;

public class BankMain {

    public static void main(String[] args) {

        BankOfCanada scotia = new Scotia();
        scotia.rateofInterest();

        BankOfCanada bmo = new BMO();
        bmo.rateofInterest();

        BankOfCanada rbc = new RBC();
        rbc.rateofInterest();



    }
}
