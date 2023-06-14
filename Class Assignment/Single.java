//Inheritance 
import java.util.Scanner;
class Person
{
	String name;
	int age;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name :");
 		name=sc.nextLine();
		System.out.println("Enter Age :");
		age=sc.nextInt();
	}
	public void display()
	{
		System.out.println("Name :"+name);
		System.out.println("\tAge :"+age);
	}
}
class Student extends Person
{
	int roll;
	String clgname;
	public void inputStudentData()
	{
		Scanner sc=new Scanner(System.in);
		input();
		System.out.println("Enter Roll :");
		roll=sc.nextInt();
		System.out.println("Enter College Name :");
		sc.nextLine();
		clgname=sc.nextLine();
	}
	public void displayStudentData()
	{
		display();
		System.out.print("\t Roll : "+roll);
		System.out.println("\t College Name : "+clgname);
	}
}
class Single
{
	public static void main(String[] arg)
	{
		Student ob=new Student();
		ob.inputStudentData();
		ob.displayStudentData();
	}
}