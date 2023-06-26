//WAP to check whether a triangle can be formed by the given value for the angles.
import java.util.Scanner;
class Assignment12
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the angles :");
		int angle1=sc.nextInt();
		int angle2=sc.nextInt();
		int angle3=sc.nextInt();
		int sum=angle1+angle2+angle3;
		if(sum==180)
			System.out.println("This is triangle .");
		else
			System.out.println("This is not a triangle.");
	}
}