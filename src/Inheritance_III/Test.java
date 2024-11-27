package Inheritance_III;

public class Test {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(8000);
        BasicAccount basicAccount = new BasicAccount(7000);
        // BankAcount  before withdraw information
        System.out.println("BankAccount before withdraw Information");
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(1000);
        System.out.println("BankAccount after withdraw Information");
        System.out.println(bankAccount.getBalance());
        //BasicAccount Information
        System.out.println("Basicaccount before withdraw Information");
        System.out.println(basicAccount.getBalance());
        basicAccount.withdraw(5000);
        System.out.println("BasicAccount after first withdraw Information");
        System.out.println(basicAccount.getBalance());
        basicAccount.withdraw(4000);
        System.out.println("BasicAccount overdrift Information");
        System.out.println(basicAccount.getBalance());


    }
}
