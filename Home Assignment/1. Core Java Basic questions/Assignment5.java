//WAP to calculate the Area of circle.
import java.util.Scanner;
class Assignment5
{
	public static void main(String[] arg)
	{
		Scanner ar=new Scanner(System.in);
		System.out.println("Enter the value of radious");
		int radious=ar.nextInt();
		Double area=3.14*radious*radious;
		System.out.println("Area is " +area+ " sq unit");
	}
}