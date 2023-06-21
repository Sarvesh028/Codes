//WAP to perform element wise sum of two 1-D array of size 6 and store in third array.
import java.util.Scanner;
class Assignment5
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int[] a1=new int[6];
		int[] a2=new int[6];
		int[] a3=new int[6];
		System.out.println("Enter 1st Array Element :");
		for(int i=0; i<6; i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("Enter 2nd Array Element :");
		for(int i=0; i<6; i++)
		{
			a2[i]=sc.nextInt();
		}
		for(int i=0; i<6; i++)
		{
			a3[i]=a1[i]+a2[i];
			System.out.print(a3[i]+"\n\t");
		}
	}
}