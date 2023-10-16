//WAP to find the cube of a number.
import java.util.Scanner;
class Assignment6
{
	public static void main(String[] arg)
	{
		Scanner cc=new Scanner(System.in);
		System.out.println("Enter the value of number");
		int number=cc.nextInt();
		int Cube=number*number*number;
		System.out.println("cube is " +Cube+ " cubic unit");
		
	}
}