/*Define a class calculator, which has method for basic functinality like add, sub, mul, devide.
Define another class clac which inherits claculator and add some method to like sin, cosine.
WAP to demonstrate the working of inheritance.
*/
import java.util.Scanner;
class Calculator
{
	int add,sub,mul,div;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two number :");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(" Press 1 for Addition");
		System.out.println(" Press 2 for Subtraction");
		System.out.println(" Press 3 for Multiplication");
		System.out.println(" Press 4 for Division");
	}
	public void display();
	int choice=sc.next();
	switch(choice)
	{
		case 1:
		System.out.println("Add= " +(num1+num2));
		break;

		case 2:
		System.out.println("Sub= " +(num1-num2));
		break;

		case 3:
		System.out.println("Mul= " +(num1*num2));
		break;

		case 4:
		System.out.println("Div= " +(num1/num2));
		break;

		default:
		System.out.println("Invalid Input.............\tPls Enter 1 to 4 digit.");
		break;
	}	
}
class Scientificcal
{
	float sin,cos,p,h;
	public void inputScientificcalData()
	{
		Scanner sc=new Scanner(System.in);
		input();
		System.out.println("Enter Sin");
		p=sc.nextInt();
		System.out.println("Enter cos");
		b=sc.nextInt();
	}
	public void displayScientificcalData();
	{
		display();
		System.out.println("Sine "+(p/h));
		System.out.println("Cosine "+(b/h));
	} 
}
class Assignment1
{
	public static void main(String[] arg)
	{
		Calculator c1=new Calculator();
		c1.inputCalculatorData();
		c1.displayCalculatorData();

		Scientificcal sc1=new Scientificcal();
		sc1.inputScientificcalData();
		sc1.displayScientificcalData();
	};
}
