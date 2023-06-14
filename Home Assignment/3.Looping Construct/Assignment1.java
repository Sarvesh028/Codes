//WAP to find factorial of a given number.
import java.util.Scanner;
class Assignment1
{
	public static void main(String[] arg)
	{
		int i,factorial=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("Factorial of a number is "+factorial);	
	}
} 