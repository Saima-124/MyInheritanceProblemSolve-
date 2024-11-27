package Inheritance_IV;

public class Test {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(7000);
        CheckingAccount checkingAccount = new CheckingAccount(10000);
        System.out.println("BankAccount Information");
        System.out.println("Initial balance");
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(5000);
        System.out.println(bankAccount.getBalance());
        System.out.println("CheckingAccount Information");
        System.out.println("Initial balance");
        System.out.println(checkingAccount.getBalance());
        checkingAccount.withdraw(7000);
        System.out.println("Without overdrift is = " + checkingAccount.getBalance());
        checkingAccount.withdraw(4000);
        System.out.println("First overdrift is = " + checkingAccount.getBalance());
        checkingAccount.withdraw(7000);
        System.out.println("Second overdrift is = " + checkingAccount.getBalance());
    }
}
