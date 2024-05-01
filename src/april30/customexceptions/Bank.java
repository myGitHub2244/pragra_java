package april30.customexceptions;

public class Bank {

    // get balance
    // deposit
    // withdraw

    double balance = 1000;

    double getBalance(){
        return balance;
    }

    double deposit(double depositAmount) {
        balance = balance + depositAmount;
        return balance;
    }

    double withdraw(double withdrawlAmount) {

        // comparison

        if(withdrawlAmount > balance) {
            // stop user from doing this.
            // show some error message..

            // throw  -- when you want to throw an exception , create an exception
            // throws

            //int x = 10/0;
            try {
                throw new InsufficientBalanceException("Insufficient Balance exception");
            }
            catch (Exception  e) {
                e.printStackTrace();
            }


        }
        balance = balance - withdrawlAmount;
        return balance;
    }




}
