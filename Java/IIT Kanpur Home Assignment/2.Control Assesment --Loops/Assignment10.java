//WAP to input the age of a candidates and determine whether it is eligible for casting his/her own vote or not.
import java.util.Scanner;
class Assignment10
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age :");
		int age=sc.nextInt();
		if(age>=18)
			System.out.println("Eligible for vote.");
		else
			System.out.println("Not Eligible for vote.");
	}
}