package com.oasis;

public class ATM {

    private Account account;

    public ATM(Account account) {
        this.account = account;
    }

    public void checkBalance() {

        System.out.println("----------------------------");
        System.out.println("Account Holder: "
                + account.getAccountHolder());
        System.out.println("Current Balance: ₹"
                + account.getBalance());
        System.out.println("----------------------------");
    }

    public void deposit(double amount) {

        if (amount <= 0) {

            System.out.println("Invalid amount.");
            System.out.println(
                    "Deposit amount must be greater than ₹0.");

        } else {

            account.deposit(amount);

            System.out.println("----------------------------");
            System.out.println("Deposit Successful!");
            System.out.println("Deposited Amount: ₹" + amount);
            System.out.println("New Balance: ₹"
                    + account.getBalance());
            System.out.println("----------------------------");
        }
    }

    public void withdraw(double amount) {

        if (amount <= 0) {

            System.out.println("Invalid amount.");
            System.out.println(
                    "Withdrawal amount must be greater than ₹0.");

        } else if (amount > account.getBalance()) {

            System.out.println("----------------------------");
            System.out.println("Insufficient Balance.");
            System.out.println("Available Balance: ₹"
                    + account.getBalance());
            System.out.println("----------------------------");

        } else {

            account.withdraw(amount);

            System.out.println("----------------------------");
            System.out.println("Withdrawal Successful!");
            System.out.println("Withdrawn Amount: ₹" + amount);
            System.out.println("Remaining Balance: ₹"
                    + account.getBalance());
            System.out.println("----------------------------");
        }
    }
}
