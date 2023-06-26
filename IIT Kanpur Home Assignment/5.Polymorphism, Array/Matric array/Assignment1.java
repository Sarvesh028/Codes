//WAP to read and print the element of 2-D array.
import java.util.Scanner;
class Assignment1
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int [][] arr=new int[3][3];
		System.out.println("Enter the number");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		} 
		System.out.println("Matrix ELement  are:");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		} 
	}
}