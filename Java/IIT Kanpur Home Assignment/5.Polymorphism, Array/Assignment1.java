//WAP to read and print the element of array of size 10.
import java.util.Scanner;
class Assignment1
{
	public static void main(String[] arg)
	{
		int[] num=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 number:");
		for(int i=0; i<10; i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("Array element are :");
		for(int i=0; i<10; i++)
		{
			System.out.println(num[i]);
		}
	}
}