//WAP to perform sum of all the even element of array.
import java.util.Scanner;
class Assignment4
{
	public static void main(String[] arg)
	{
		int[] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter even number");
		int sum=1;
		for(int i=0; i<10; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int num: arr)
		{
			sum=sum+num;
		}
		System.out.println("Sum of all the even element of array "+sum);
	}
}