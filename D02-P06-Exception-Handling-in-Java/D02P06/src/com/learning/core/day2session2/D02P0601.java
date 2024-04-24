package com.learning.core.day2session2;

import java.util.Scanner;

class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}
 
class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}
 
class BankAccount {
    private int accNo;
    private String custName;
    private String accType;
    private float balance;
 
    public BankAccount(int accNo, String custName, String accType, float initialBalance) throws LowBalanceException, NegativeAmountException {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
 
        if (accType.equals("Savings") && initialBalance < 1000) {
            throw new LowBalanceException("Low Balance");
        } else if (accType.equals("Current") && initialBalance < 5000) {
            throw new LowBalanceException("Low Balance");
        }
 
        if (initialBalance < 0) {
            throw new NegativeAmountException("Negative Amount");
        }
 
        this.balance = initialBalance;
    }
 
    public void deposit(float amt) throws NegativeAmountException {
        if (amt < 0) {
            throw new NegativeAmountException("Negative Amount");
        }
        balance += amt;
    }
 
    public float getBalance() throws LowBalanceException {
        if (balance < 1000 && accType.equals("Savings")) {
            throw new LowBalanceException("Low Balance");
        } else if (balance < 5000 && accType.equals("Current")) {
            throw new LowBalanceException("Low Balance");
        }
        return balance;
    }
}
 
public class D02P0601 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accNo = scanner.nextInt();
        System.out.print("Enter customer name: ");
        String custName = scanner.next();
        System.out.print("Enter account type (Savings/Current): ");
        String accType = scanner.next();
        System.out.print("Enter initial balance: ");
        float initialBalance = scanner.nextFloat();
 
        try {
            BankAccount account = new BankAccount(accNo, custName, accType, initialBalance);
            System.out.println("Account balance: " + account.getBalance());
        } catch (LowBalanceException | NegativeAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
