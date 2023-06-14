//WAP to add two numbers with operator
import java.util.Scanner;
class Assignment2a
{
	public static void main(String[] arg)
	{
		Scanner ad=new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1=ad.nextInt();
		System.out.println("Enter second number:");
		int num2=ad.nextInt();
		int sum=num1+num2;
		System.out.println("Sum is "+sum);
		int subtract=num1-num2;
		System.out.println("Subtract is "+subtract);
	}
} 