package april23.abstraction;

public class BMO extends BankOfCanada {

    @Override
    public void rateofInterest() {

        System.out.println("BMO Interest rate is: " + (primeRate+1.0));
    }
}
