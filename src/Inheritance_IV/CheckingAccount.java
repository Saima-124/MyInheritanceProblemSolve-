package Inheritance_IV;
public class CheckingAccount extends BankAccount {
    public double overdrift = 0;
    public CheckingAccount(double balance) {
        super(balance);
    }
    @Override
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
        }
        else if(amount>balance && overdrift==0){
            balance-=20;
            System.out.println("Frist overdrift in month is = " + 20);
            balance-=amount;
            overdrift++;
        }
        else{
            balance-=30;
            System.out.println("Second overdrift in month is = " + 30);
            balance-=amount;
        }
    }
}
