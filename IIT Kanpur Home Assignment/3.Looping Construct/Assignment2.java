//WAP to find the sum of all the digits of a given number.
import java.util.Scanner;
class Assignment2
{
	public static void main(String[] arg)
	{
		int m,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		while(n>0)
		{
			m=n%10;
			sum=sum+m;
			n=n/10;
		}
		System.out.println("The sum of digits is "+sum);
	}
}