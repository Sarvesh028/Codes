//WAP to find maximum between two numbers using switch statement.
import java.util.Scanner;
class Assignment18
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Press 1 for maximum number :");
		System.out.println("Press 2 for maximum number :");
		int choice=sc.nextInt();
		int choice==(num1>num2);
		switch(choice)
		{
			case 1:
				System.out.println("The maximum number is "+num2);
				break;
			case 2:
				System.out.println("The maximum number is "+num1);
				break;
			default:
				System.out.println("Invalid Entry");
				break;
		}
	}
}