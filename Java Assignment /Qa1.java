//WAP to compute the quotient and remainder of a given number.
import java.util.Scanner;
class Qa1
{
	public static void main(String[] vv)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dividend");
		float d=sc.nextFloat();
		System.out.println("Enter the divisor");
		float d1=sc.nextFloat();
		float remainder=(d/d1);
		float quotient=(d%d1);
		System.out.println("Quotient = "+quotient);
		System.out.println("Remainder = "+remainder);
	}
} 