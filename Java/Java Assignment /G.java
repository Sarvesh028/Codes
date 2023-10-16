import java.util.Scanner;
class G
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three number :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
				System.out.println("A is Greatest");
			else
				System.out.println("C is Greatest");
		}
		else if(b>c)
			System.out.println("B is Greatest");
		else
			System.out.println("C is Greatest");
	}
}