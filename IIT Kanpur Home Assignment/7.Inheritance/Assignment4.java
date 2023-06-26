
/*
Create a class "Account" which has method interest() to calculate simple interest and override
this method into drive class "SavingAccount", which calculate compound interest.
*/
import java.util.Scanner;

class Account {
	Scanner sc = new Scanner(System.in);
	float principle;
	float rate;
	float time;

	public void interest() {
		System.out.println("Enter the Principle Amount:");
		float principle = sc.nextFloat();
		System.out.println("Enter the Interest Rate:");
		float rate = sc.nextFloat();
		System.out.println("Enter the Time:");
		float time = sc.nextFloat();
		float SI = (principle * rate * time) / 100;
		System.out.println("The Simple Interest of Rs" + principle + "@" + rate + "per annum for the Time Duration"
				+ time + "years is Rs" + SI);
	}
}

class SavingAccount extends Account {
	public void interest() {
		super.interest();
		System.out.println("You are in Saving Amount Mode:");
		System.out.println("Enter the Principle Amount:");
		float principle = sc.nextFloat();
		System.out.println("Enter the Interest Rate:");
		float rate = sc.nextFloat();
		System.out.println("Enter the Time Duration:");
		float time = sc.nextFloat();
		float SI = (principle * rate * time) / 100;
		System.out.println("The Simple Interest of Rs" + principle + "@" + rate + "per annum for the Time Duration"
				+ time + "years is Rs" + SI);
		float p = 1 + (rate / 100);
		double x = Math.pow(2, 2);
		double Amount = principle * (x);
		double CI = Amount - principle;
		System.out.println("The Compound Interest of Rs" + principle + "@" + rate + "per annum for the Time Duration"
				+ time + "years is Rs" + CI);
		interest();
	}
}

class Assignment4 {
	public static void main(String[] arg) {
		SavingAccount S = new SavingAccount();
		S.interest();
	}
}