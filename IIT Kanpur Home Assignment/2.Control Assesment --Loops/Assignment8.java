//WAP to check whether an input year is a leap year or not.
import java.util.Scanner;
class Assignment8
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:");
		int year=sc.nextInt();
		if(year%100==0)
		{
			if(year%400==0)
				{
					System.out.println("Leap year");
				}
				else 
				{
					System.out.println("Not leap year");
				}
		}
		else if (year%4==0)
			{
				System.out.println("Leap year");
			}
			else
			{
				System.out.println("Not leap year");
			}
	}
}