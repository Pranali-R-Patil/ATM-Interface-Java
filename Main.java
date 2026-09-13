package com.oasis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create account
        Account account =
                new Account("Pranali", 1234, 5000);

        // Create ATM
        ATM atm = new ATM(account);

        System.out.println("================================");
        System.out.println("        WELCOME TO ATM");
        System.out.println("================================");

        // PIN verification
        int attempts = 0;
        int maxAttempts = 3;
        boolean loginSuccessful = false;

        while (attempts < maxAttempts) {

            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();

            if (account.verifyPin(enteredPin)) {

                loginSuccessful = true;

                System.out.println("\nLogin Successful!");
                break;

            } else {

                attempts++;

                int remainingAttempts =
                        maxAttempts - attempts;

                System.out.println("Incorrect PIN.");

                if (remainingAttempts > 0) {

                    System.out.println(
                            "Attempts remaining: "
                            + remainingAttempts);
                }
            }
        }

        // If login is successful
        if (loginSuccessful) {

            boolean running = true;

            while (running) {

                System.out.println("\n========== ATM MENU ==========");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.println("==============================");

                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:

                        atm.checkBalance();
                        break;

                    case 2:

                        System.out.print(
                                "Enter amount to deposit: ");

                        double depositAmount =
                                sc.nextDouble();

                        atm.deposit(depositAmount);
                        break;

                    case 3:

                        System.out.print(
                                "Enter amount to withdraw: ");

                        double withdrawAmount =
                                sc.nextDouble();

                        atm.withdraw(withdrawAmount);
                        break;

                    case 4:

                        System.out.println(
                                "\nThank you for using ATM.");

                        System.out.println(
                                "Please collect your card.");

                        running = false;
                        break;

                    default:

                        System.out.println(
                                "Invalid choice. "
                                + "Please try again.");
                }
            }

        } else {

            System.out.println("\nToo many incorrect attempts.");
            System.out.println("Your account is blocked.");
        }

        sc.close();
    }
}