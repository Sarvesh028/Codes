import java.util.Scanner;
class Sum
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int num1=sc.nextInt();
		System.out.println("Enter second Number : ");
		int num2=sc.nextInt();
		int Sum=num1+num2;
		System.out.println("Sum is");
		System.out.println(Sum);
	}
}
