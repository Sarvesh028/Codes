//WAP to check a given number is even or odd.
import java.util.Scanner;
class Assignment1
{
	public static void main(String[] arg)
	{
		Scanner eo=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=eo.nextInt();
		if (n % 2 == 0)
		{
            System.out.println("Entered number is an even number");
      	}
		else 
		{
         	System.out.println("Entered number is an odd number");
		}
	}
}