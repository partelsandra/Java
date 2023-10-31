package week4;

import java.util.ArrayList;

public class ex72 {

    public static void main(String[] args) {
        // Exercise 72.1: Your first account
        Account firstAccount = new Account("First account", 100.0);
        firstAccount.deposit(20.0);
        System.out.println("Exercise 72.1 - Initial state:");
        System.out.println(firstAccount);

        // Exercise 72.2: Your first money transfer
        Account mattAccount = new Account("Matt's account", 1000.0);
        Account myAccount = new Account("My account", 0.0);
        mattAccount.withdrawal(100.0);
        myAccount.deposit(100.0);
        System.out.println("Exercise 72.2 - Account balances:");
        System.out.println(mattAccount);
        System.out.println(myAccount);

        // Exercise 72.3: Money transfers
        Account accountA = new Account("A", 100.0);
        Account accountB = new Account("B", 0.0);
        Account accountC = new Account("C", 0.0);
        transfer(accountA, accountB, 50.0);
        transfer(accountB, accountC, 25.0);
        System.out.println("Exercise 72.3 - Account balances:");
        System.out.println(accountA);
        System.out.println(accountB);
        System.out.println(accountC);

        // Original code
        Account bartosAccount = new Account("Barto's account", 100.00);
        Account bartosSwissAccount = new Account("Barto's account in Switzerland", 1000000.00);

        System.out.println("Initial state:");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);

        bartosAccount.withdrawal(20);
        System.out.println("Barto's account balance is now: " + bartosAccount.balance());
        bartosSwissAccount.deposit(200);
        System.out.println("Barto's Swiss account balance is now: " + bartosSwissAccount.balance());

        System.out.println("Final state:");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);
    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}

class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdrawal(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
        }
    }

    public double balance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return "Account name: " + this.name + ", balance: " + this.balance;
    }
}
