package april23.abstraction;

public class RBC extends BankOfCanada {

    @Override
    public void rateofInterest() {

        System.out.println("RBC Interest rate is: " + (primeRate+3.0));
    }
}
