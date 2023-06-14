//WAP to print matric3*3.
import java.util.Scanner;
class Transpose 
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int[][] a1=new int[3][3];
		System.out.println("Enter number in 3*3 Matrix :");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				a1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matric ELement Are :");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(a1[j][i]+"\t");
			}
			System.out.println();
		}
	}
}
