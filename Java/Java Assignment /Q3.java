//WAP to swap two values of 2 no.
import java.util.Scanner;
class Q3
{	
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number Before Swapping");
		int n1=sc.nextInt();
		System.out.println("Enter Second Number Before Swapping");
		int n2=sc.nextInt();
		int b=n1;
		n1=n2;
		n2=b;
		System.out.println("Number After Swapping"+n1);
		System.out.println("Number After Swapping"+n2);
	}
} 