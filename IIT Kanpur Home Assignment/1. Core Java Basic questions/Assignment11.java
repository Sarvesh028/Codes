//WAP take a 4 digit number as a input from user and to perform the addition of first and last digit of number without using looping.
import java.util.Scanner;
class Asssignment11
{
	public static void main(String[] arg)
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter 4 four number");
		int n=t.nextInt();
		int a=n%10;
		int b=n/1000;
		int sum=a+b;
		System.out.println("Result = "+sum);
	}
}