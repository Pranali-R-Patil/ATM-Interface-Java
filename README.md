# ATM Interface – Java

A console-based ATM Interface application developed using **Java** and **Maven**.  
This project demonstrates core Java programming concepts, Object-Oriented Programming, input handling, validation, and transaction management.

## 📌 Project Overview

The ATM Interface allows a user to securely access an account using a PIN and perform basic banking operations.

The application provides a simple menu-driven interface where the user can:

- Verify their PIN
- Check account balance
- Deposit money
- Withdraw money
- View transaction history
- Perform multiple transactions
- Exit the application

The project is organized using separate Java classes to demonstrate basic **Object-Oriented Programming (OOP)** principles.

## ✨ Features

### 🔐 PIN Authentication
- User must enter the correct PIN to access the ATM.
- Maximum of **3 attempts** are allowed.
- The account is blocked after three incorrect attempts.

### 💰 Check Balance
Displays:
- Account holder name
- Current account balance

### ➕ Deposit Money
- Allows the user to deposit money.
- Prevents zero or negative deposit amounts.
- Displays the updated balance after a successful deposit.

### ➖ Withdraw Money
- Allows the user to withdraw money.
- Prevents zero or negative withdrawal amounts.
- Prevents withdrawal when the requested amount is greater than the available balance.
- Displays the remaining balance after a successful withdrawal.

### 🧾 Transaction History
Records successful:
- Deposits
- Withdrawals

For each transaction, the application displays:
- Transaction type
- Transaction amount
- Balance after the transaction

### 🔄 Multiple Transactions
The user can perform multiple operations during the same session without restarting the application.

## 🛠️ Technologies Used

- **Java**
- **Maven**
- **Object-Oriented Programming (OOP)**
- **ArrayList**
- **Scanner**

## 📂 Project Structure

```text
ATM-Interface-Java/
│
├── pom.xml
│
├── README.md
│
└── src/
    └── main/
        └── java/
            └── com/
                └── oasis/
                    ├── Main.java
                    ├── Account.java
                    ├── ATM.java
                    └── Transaction.java