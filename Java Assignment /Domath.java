//WAP to "do" math
import java.util.Scanner;
class Domath
{
	public static void main(String[] vv)
	{
		Scanner wc=new Scanner(System.in);
		char ch;
		do
		{
		System.out.println("Enter two number :");
		int num1=wc.nextInt();
		int num2=wc.nextInt();
		System.out.println("Press 1 for Addition ");
		System.out.println("Press 2 for Substraction ");
		System.out.println("Press 3 for Multiplication ");
		System.out.println("Press 4 for Division ");
		System.out.println("Enter your choice : ");
		int choice=wc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Addition = "+(num1+num2));
				break;
			case 2:
				System.out.println("Substaction = "+(num1-num2));
				break;
			case 3:
				System.out.println("Multiplication = "+(num1*num2));
				break;
			case 4:
				System.out.println("Division = "+(num1/num2));
				break;
			default:
				System.out.println("Pls enter valid input :");
				break;
		}
		System.out.println("Do you want to recalculate Press(Y/N)");
		ch=wc.next().charAt(0);
		}
		while(ch=='Y' || ch=='y');
	}
}