package assignment4.Contructor;

public class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;
    String accountType;

    public BankAccount(int accountNumber, String accountHolderName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void depositMoney(double deposit){
        this.balance +=deposit;
    }

    public void withdrawMoney(double withdraw){
        this.balance -=withdraw;
    }

    public void getAccountDetails(){
        System.out.println("accountNumber = " + accountNumber);
        System.out.println("accountHolderName = " + accountHolderName);
        System.out.println("balance = " + balance);
        System.out.println("accountType = " + accountType);
    }

    public static void main(String[] args) {
        BankAccount acct=new BankAccount(101,"Jack Astor",25000.50,"Savings");
        acct.depositMoney(225.50);
        acct.withdrawMoney(20.50);
        acct.getAccountDetails();

        BankAccount acct1=new BankAccount(321,"John Connor",2322.50,"Chequing");
        acct1.depositMoney(4545.44);
        acct1.withdrawMoney(4545.12);
        acct1.getAccountDetails();


    }


}
