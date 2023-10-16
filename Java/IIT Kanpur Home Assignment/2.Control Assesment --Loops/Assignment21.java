//Create a Menu-Driven Program to compute the area of the various geometrical shape.(like circle, rectangle, rectangle etc).
import java.util.Scanner;
class Assignment21
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Area of circle");
		System.out.println("Press 2 for Area of rectangle");
		System.out.println("\n\nEnter your Choice");
		int choice=sc.nextInt();
		System.out.println("You have chosen Area of circle");
		System.out.println("Enter the radious");
		int radious=sc.nextInt();
		double area1=3.14*radious*radious;
		System.out.println("You have chosen Area of rectangle");
		System.out.println("Enter your length and Breadth");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		int area2=length*breadth;
		switch(choice)
		{
			case 1:
				System.out.println("Area of Circle is "+area1+" sq unit ");
				break;
			case 2:
				System.out.println("Area of Rectangle is "+area2+" sq unit ");
				break;
			default:
				System.out.println("Invalid Input:.........\n\t\n......");
				break;
		}
	}
}