//WAP to calculate the area of circle.
import java.util.Scanner;
class Q5
{
	public static void main(String[] dd)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radious of circle :");
		float rad=sc.nextFloat();
		double area=3.14*rad*rad;
		System.out.println("Area of circle = "+area); 
	}
}