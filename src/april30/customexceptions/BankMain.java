package april30.customexceptions;

public class BankMain {
    public static void main(String[] args) {

        Bank bank = new Bank();
        double balance = bank.getBalance();
        System.out.println("Current Balance : " + balance);  // 1000

        double updatedBalance = bank.deposit(2000);
        System.out.println("Balance after 1000 deposit : "+updatedBalance); // 3000

        double balanceAfterWithdraw = bank.withdraw(5000);
        System.out.println("Balance after 1000 withdraw : "+balanceAfterWithdraw); // 3000 -1000 = 2000


    }
}
