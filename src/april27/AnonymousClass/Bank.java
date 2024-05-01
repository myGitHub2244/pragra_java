package april27.AnonymousClass;

public interface Bank {
    int rate=7;     //this is public static by default
    void getRate();
}

class BankDemo {
    public static void main(String[] args) {

        //Anonymous class. Basically instead of 1) Creating separate implementation Class of Bank Interface to implement method
        // and 2) defining Obj
        //We merge the 2 steps into 1 step

        Bank bank=new Bank() {      //Anonymous class. Note: This is obj of Anonymous class and not Bank Interface. The reference is of Bank Interface
            @Override
            public void getRate() {
                System.out.println("Bank Rate: "+rate);
            }
        };
        bank.getRate();
    }
}