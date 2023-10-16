/*
 * Question 3:
Create a class called "BankAccount" with the following properties and methods:
Properties: accountNumber (String), balance (double)
Methods:
deposit(double amount) : Add the specified amount to the account balance.
withdraw(double amount) : Subtract the specified amount from the account
balance.
 */

public class BankAccount {
    
    String accountNumber = "00345488458";
    double balance;

    static void deposit(double amount){
        System.out.println("The Account number is related to  this has deposite the amount is "+ amount);
    }

    static void withdraw(double amount2){
        System.out.println("The Account number is related to  this has withdraw the amount is "+ amount2);
    }


    public static void main(String[] args) {
         
        deposit(1500000);
        withdraw(5000);
    }
}
