
//WAP to read a number from a user and perform the sum of their digits.
import java.util.Scanner;

class Digitsum {
	public static void main(String[] Aada) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		System.out.println("Sum of Digits = " + sum);
	}
}