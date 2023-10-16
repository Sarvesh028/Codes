//WAP to perform sum of two numbers.
import java.util.Scanner;
class Sum
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter Second number");
		int num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("Sum is "+sum);
	}
}
