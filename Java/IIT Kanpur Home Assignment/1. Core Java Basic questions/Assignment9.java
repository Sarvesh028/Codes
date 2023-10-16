import java.util.Scanner;
class Assignment9
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the four digit number:");
		int n=sc.nextInt();
		int a=n%10;
		n=n/10;
		int b=n%10;
		n=n/10;
		int c=n%10;
		n=n/10;
		int sum=a+b+c+n;
		System.out.println("Result = "+sum);
	}
}
//int y = ((x%10) + ((x/10)%10) + ((x/100)%10) +(x/1000));
