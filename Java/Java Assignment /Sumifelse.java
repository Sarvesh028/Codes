import java.util.Scanner;
class Sumifelse
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 digit number :");
		int n=sc.nextInt();
		if(n>999 && n<=9999)
		{
			int a=n%10;
			int b=n/1000;
			int sum=a+b;
			System.out.println("Sum of digit = "+sum);
		}
		else
		{
			System.out.println("Plz enter 4 digit Number");
		}
	}
}