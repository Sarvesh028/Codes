//WAP to swap two value of 2 no.
import java.util.Scanner;
class Assignment3
{
	public static void main(String[] arg)
	{
		int a,b,z;
		Scanner sw=new Scanner(System.in);
		System.out.println("Enter the value of a and b:");
		a=sw.nextInt();
		b=sw.nextInt();
		System.out.println("Before swapping number: "+a +" "+b);
		z=a;
		a=b;
		b=z;
		System.out.println("After swapping number: "+a +" "+b);
		System.out.println();
	}
}