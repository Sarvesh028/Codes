/*
 * Question 3:
Create a class called "BankAccount" with private instance variables
"accountNumber" and "balance". Include a method called "deposit" that takes an
amount as an argument and adds it to the balance. Include a method called
"withdraw" that takes an amount as an argument and subtracts it from the balance.
Write a main method to create an object of the BankAccount class, set the account
number, deposit $500, withdraw $200, and display the remaining balance.
 */

public class BankAccount {
    private int  accountNumber;
    public int getaccountNumber() {
        return accountNumber;
    }
    public void setaccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    private int balance;

    static double deposit(int amo){
        System.out.println("Your Account is Deposited By the amount of ");
        return amo;

    }

    static int withdraw(int amo, int amo2){
        System.out.println("your Remaining Balance is ");
        return amo - amo2;
    }

    public static void main(String[] args) {
        
        BankAccount ac = new BankAccount();
        ac.setaccountNumber(123545466);
        System.out.println(deposit(500));
        System.out.println("Your Account Number is "+ ac.accountNumber);
        System.out.println(withdraw(500, 200));


    }
}
