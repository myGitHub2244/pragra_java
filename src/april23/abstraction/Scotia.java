package april23.abstraction;

public class Scotia extends BankOfCanada {

    @Override
    public void rateofInterest() {
        System.out.println("Scotia Interest rate is: " + (primeRate+2.0));
    }
}
