//WAP to print user menu and take input of two numbers and perform operation according to the user choice using switch case.
//“+” for addition
//“-“ for subtraction
//“*” for multiplication 
//“/” for division
import java.util.Scanner;
class Practical14
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for substraction");
		System.out.println("Press 3 for multiplication");
		System.out.println("Press 4 for division");
		System.out.println("\n\nEnter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Addition ="+(num1+num2));
				break;
			case 2:
				System.out.println("Substraction ="+(num1-num2));
				break;
			case 3:
				System.out.println("Multiplication ="+(num1*num2));
				break;
			case 4:
				System.out.println("Division ="+(num1/num2));
				break;
			default:
				System.out.println("Invalid input");
				break;
		}
	}
}