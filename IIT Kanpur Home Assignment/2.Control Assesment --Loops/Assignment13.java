//WAP to check whether a triangle is Equilateral, Isosceles or Scalene.
import java.util.Scanner;
class Assignment13
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side ab");
		int ab=sc.nextInt();
		System.out.println("Enter the side bc");
		int bc=sc.nextInt();
		System.out.println("Enter the side ca");
		int ca=sc.nextInt();
		if(ab==bc)
		{
			if(bc==ca)
			System.out.println("Equilateral Triangle.");
		}
		if(ab==bc)
		{
			if(bc>ca)
			System.out.println("Isosceles Triangle.");
		}		
		if(ab!=bc)
		{
			if(bc!=ca)
			System.out.println("Scalene Triangle.");
		}
	}
}	