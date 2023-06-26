//WAP to compute quotient and remainder og given number.
import java.util.Scanner;
class Assignment8
{
	public static void main(String[] arg)
	{	
		int q,r;
		Scanner qr=new Scanner(System.in);
		System.out.println("Enter the divider");
		int divider=qr.nextInt();
		System.out.println("Enter the divident");
		int divident=qr.nextInt();
		int quotient=divident/divider;
		int remainder=divident%divider;
		System.out.println("Quotient is "+quotient + " Remainder is "+remainder);
	}
}