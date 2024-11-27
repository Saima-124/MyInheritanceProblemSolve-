package Inheritance_II;

public class Test2 {
    public static void main(String[] args) {
        BasicAccount b = new BasicAccount(20000);
        System.out.println("Initial balance = " + b.getBalance());
        b.deposit(5000);
        System.out.println("After first deposit = " + b.getBalance());
        b.withdraw(10000);
        System.out.println("After first withdraw = " + b.getBalance());
        b.withdraw(16000);
        System.out.println("After second withdraw = " + b.getBalance());
    }
}
