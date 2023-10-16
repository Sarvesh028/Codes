//Perform a substraction using taking the input from the user;.....

import java.util.Scanner;
class D3
{
	public static void main(String[]  ade)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number.....");
		int n1=sc.nextInt();
		System.out.println("ENter second number.....");
		int n2=sc.nextInt();
		int sub=n1-n2;
		System.out.println("The substraction of numbers are "+sub);
	}
}