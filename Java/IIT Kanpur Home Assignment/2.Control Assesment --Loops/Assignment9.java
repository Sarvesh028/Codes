//WAP to check wherther an input number is a single, two or three digit.
import java.util.Scanner;
class Assignment9
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three digit number:");
		int n=sc.nextInt();
		if(n%10==0)
			System.out.println("Single digit number");
		else if(n%100==0)
			System.out.println("Two digit number");
		else if(n%1000==0)
			System.out.println("Three digit number");
	}
}
