//
import java.util.Scanner;
class Assignment10
{
	public static void main(String[] arg)
	{
		int n, t1=0, t2=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Fabonacci series of :");
		n=sc.nextInt();
		for(int i=1; i<=n; ++i)
		{
			System.out.print(t1+"  ");
			int sumOfPrevTwo=t1+t2;
			t1=t2;
			t2=sumOfPrevTwo;
		}
	}
}