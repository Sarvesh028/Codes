//WAP to calculate sum of all element of an array.
import java.util.Scanner;
class Assignment3
{
	public static void main(String arg[]);
	{
		int[] arr=new int[10];
		int sum = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		for(int i=0; i<10; i++)
		{
			arr[i]=sc.nextInt();	
		}
		for(int num : arr)
		{
			sum=sum+num;
		}
		System.out.println("Sum of all the number of an array "+sum);
	}
}