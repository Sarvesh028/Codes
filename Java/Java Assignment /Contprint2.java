import java.util.Scanner;
class Contprint2
{
	public static void main(String [] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name :");
		String name=sc.nextLine();
		for(int i=1; i<10; i++)
		{
			System.out.println(name);
		}
	}
}