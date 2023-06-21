//WAP to read the element in array and print in reverse order.
import java.util.Scanner;
class Assignment2
{
	public static void main(String[] arg)
	{
		int[] rev=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		for(int i=0; i<5; i++)
		{
			rev[i]=sc.nextInt();
		}
		System.out.println("Reverse array element are :");
		for(int i=5-1; i>=0; i--)
		{
			System.out.println(rev[i]);
		}
	}
}
