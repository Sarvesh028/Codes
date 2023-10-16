//WAP to calculate the area of circle and triangle.
import java.util.Scanner;
class Qa3
{	
	public static void main(String[] ll)
	{	
		Scanner dc=new Scanner(System.in);
		System.out.println("Enter the height of triangle:");
		int height=dc.nextInt();
		System.out.println("Enter the Base of triangle:");
		int base=dc.nextInt();
		double area=0.5*height*base;
		System.out.println("Area of Triangle = "+area);
	}
}  