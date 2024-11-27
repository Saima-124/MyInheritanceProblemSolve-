package Inheritance_III;

public class BankAccount {
   public double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Invaild amount");
        }
        else if(amount>0 && amount<=balance){
            balance+=amount;
        }
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient amount");
        }
        else if(amount<balance){
            balance-=amount;
        }
    }
}
