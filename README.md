🏦 JavaBankingProgram
Overview

JavaBankingProgram is a lightweight Java console application designed to simulate basic banking operations in a simple and interactive way.
The program allows users to check their balance, deposit funds, withdraw money, and exit the system safely.

Features
Function	Description
1. Show Balance	Displays the user’s current account balance.
2. Deposit Money	Allows the user to add funds to their balance.
3. Withdraw Money	Enables money withdrawal with insufficient balance validation.
4. Exit Program	Closes the banking application safely.

Program Logic

The program follows a clean and minimal structure:

A continuous while loop keeps the program running until the user exits.

A Scanner object is used for user input.

A modern switch statement (-> syntax) handles menu options clearly and efficiently.

Example Output
----BANKING PROGRAM----
1. Show balance
2. Deposit
3. Withdraw
4. Exit
------------------------
Enter your choice (1-4):

Selecting option 2 allows the user to enter an amount to deposit.
Selecting option 3 allows the user to withdraw money if sufficient funds are available.

Requirements

Java 17 or higher

Any Java-compatible IDE (NetBeans, IntelliJ IDEA, Eclipse, or VS Code)
