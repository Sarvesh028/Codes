public class BankAccount {
    static int year =1;
    int number = 234556676;
    int balance;
    static int interestRate=10;

    static double calculateInterest(double balance){
        return (balance*interestRate*year)/100;
    }

    public static void main(String[] args) {
        BankAccount BA=new BankAccount();
        System.out.println("the Interest earned is "+BA.calculateInterest(4500));
        BankAccount BA2=new BankAccount();
        System.out.println("the Interest earned is "+BA.calculateInterest(5000));
        
    }
}
