//WAP to perform the sum all elements of 2-D array.
import java.util.Scanner;
class Assignment2
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int [][] arr1=new int[3][3];
		System.out.println("Enter the number for first Matrix:");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		} 
		System.out.println("The FIrst Matrix ELement are:");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}
		int [][] arr2=new int[3][3];
		System.out.println("Enter the number for Second Matrix:");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		} 
		System.out.println("The second Matrix ELement  are:");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
		int sum=arr1[3][3]+arr2[3][3];
		System.out.println(sum); 
	}
}