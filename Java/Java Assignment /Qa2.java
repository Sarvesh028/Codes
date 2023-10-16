//Take a four digit number as a input from the user and WAP to perform addition of there digits
//without using loop
import java.util.Scanner;
class Qa2
{
	public static void main(String[] ss)
	{
		Scanner ad=new Scanner(System.in);
		System.out.println("Enter the 4 digit Number :");
		int n=ad.nextInt();
		int a=n%10;
		n=n/10;
		int b=n%10;
		n=n/10;
		int c=n%10;
		n=n/10;
		int sum=a+b+c+n;
		System.out.println("Sum of digits = "+sum);
	}
}