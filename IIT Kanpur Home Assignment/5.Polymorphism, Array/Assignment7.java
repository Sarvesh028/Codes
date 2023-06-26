//WAP to store first 10 even and odd number between 50-100 in two different 1-D array and print it.
import java.util.Scanner;
class Assignment7
{
	public static void main(String[] arg)
	{
		int[] even=new int[10];
		int[] odd=new int[10];
		int x=0,y=0;
		for(int i=50; x<10 || y<10; i++)
		{
			if(i%2==0)
			{
				even[x]=i;
				x++;
			}
			else
			{
				odd[y]=i;
				y++;
			}
		}
		System.out.println("First 10 even number are :");
		for(int i=0; i<10; i++)
		{
			System.out.print(even[i]+"  ");
		}
		System.out.println("\nFirst 10 odd number are :");
		for(int i=0; i<10; i++)
		{
			System.out.print(odd[i]+"  ");
		}
	}
}