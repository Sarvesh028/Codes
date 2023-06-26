//WAP to find larger number among two number.
import java.util.Scanner;
class Assignment2
{
	public static void main(String[] arg)
	{
		Scanner l=new Scanner(System.in);
		System.out.println("Enter two number");
		int a=l.nextInt();
		int b=l.nextInt();
		if(a>b)
		{
			System.out.println("A is greatest");
		}
		else
		{
			System.out.println("B is greatest");
		}
	}
}