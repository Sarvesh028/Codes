//WAP to swap two value without using third variable.
import java.util.Scanner;
class Assignment4
{
	public static void main(String[] arg)
	{
		Scanner sw=new Scanner(System.in);
		System.out.println("Before Swapping");
		int x=sw.nextInt();
		int y=sw.nextInt();
		System.out.println("Value of X "+x);
		System.out.println("Value of Y "+y);
		System.out.println("After Swapping");
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Value of X "+x);
		System.out.println("Value of Y "+y);
	}
}