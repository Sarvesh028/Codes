/*
Create a package by name logicate which consist of classes for AND, OR, NOT gate, and
all classes has method with signature boolean doOperation(arg_list),
import this package into java source file and simulate the behavior of all gates.
*/

import java.util.Scanner;
class Assignment1
{
	public static void main(String[] arg)
	{
		A1();
	}
	public static void A3()
	{
	
	}
	public static void A1()
	{
		A2();
	}
	public static void A2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number:");
		int a=sc.nextInt();
		System.out.print("Enter Number:");
		int b=sc.nextInt();
		int res=0;
		try
		{
			res=a/b;
			System.out.println("Result = "+res);
		}
		catch(ArithmeticException ob)
		{
			System.out.println("You can't Divide a number with zero");
		}
		System.out.println("Program Completed");
	}
}