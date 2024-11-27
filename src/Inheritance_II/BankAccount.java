package Inheritance_II;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Invalid amount");
        }else if(amount<balance && amount>0){
            balance+=amount;
        }
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient amount");
        }else if(amount>0 && amount<balance){
            balance-=amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
