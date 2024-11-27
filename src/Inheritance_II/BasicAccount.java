package Inheritance_II;

public class BasicAccount extends BankAccount{
    public BasicAccount(double balance) {
        super(balance);
    }
    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
    }

}
