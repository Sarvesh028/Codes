//WAP to find the largest number among three number using if-else.
import java.util.Scanner;
class Assignment3
{
	public static void main(String[] arg)
	{
		Scanner ln=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=ln.nextInt();
		if(n1>=n2 && n1>=n3)
		{
			System.out.println("The largest number is "+n1);
		}
		else if(n2>=n1 && n2>=n3)
		{
			System.out.println("The largest number is "+n2);
		}
		else
		{
			System.out.prinln("The Largest number is "+n3);
		}
	}
}