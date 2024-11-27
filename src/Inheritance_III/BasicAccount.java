package Inheritance_III;

public class BasicAccount extends BankAccount{
    public BasicAccount(double balance) {
        super(balance);
    }
    @Override
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
        }else {
            balance-=30;
            System.out.println("Overdrift is = " + 30);
            balance-=amount;
        }
    }
}
