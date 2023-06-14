//WAP to calculate the area of triangle.
import java.util.Scanner;
class Assignment10
{
	public static void main(String[] arg)
	{
		Scanner at=new Scanner(System.in);
		System.out.println("Enter the base:");
		int base=at.nextInt();
		System.out.println("Enter the height:");
		int height=at.nextInt();
		double area=0.5*base*height;
		System.out.println("The Area is " +area);
	}
}