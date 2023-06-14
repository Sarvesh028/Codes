//WAP to check whether a number is positive, negative or zero using switch statement.
import java.util.Scanner;
class Assignment19
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int num=sc.nextInt();
		int digit==(num>0);
		int digit==(num<0);
		int digit=(num=0);
		switch(num)
		{
			case 1:
				System.out.println("This is positive number ");
				break;
			case 2:
				System.out.println("This is negative number ");
				break;
			case 3:
				System.out.println("This is Zero ");
				break;
		}
	}
}
