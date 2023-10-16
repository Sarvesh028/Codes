import java.util.Scanner;
class Contprint3 
{
	public static void main(String [] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name :");
		String name=sc.nextLine();
		System.out.println("How many times print this :");
		int n=sc.nextInt();
		for(int i=0; i<n; i++)
		{
			System.out.println(name);
		}
	}
}