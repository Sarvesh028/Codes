//Perform a Addition using taking the input from the user;.....

import java.util.Scanner;
class D2
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number.....");
		int num1=sc.nextInt();
		System.out.println("Enter the second number.....");
		int num2=sc.nextInt();
		int add=num1+num2;
		System.out.println("The addition of two number is "+add);
	}
}