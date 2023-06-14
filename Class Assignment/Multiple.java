// inheritance2
import java.util.Scanner;
class person
{
	String name;
	int age;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name :");
		name=sc.nextLine();
		System.out.print("Enter Age :");
		age=sc.nextInt();
	}
	public void display()
	{
		System.out.print("Name :"+name);
		System.out.print("\tAge :"+age);
	}
}
class Student extends Person
{
	String clgname;
	int roll;
	public void inputStudentData()
	{
		Scanner sc=new Scanner(System.in);
		input();
		System.out.print("Enter Roll :");
		roll=sc.nextInt();
		System.out.print("Enter College Name :");
		sc.nextLine();
		clgname=sc.nextLine();
	}
	public void displayStudentData()
	{
		display();	
		System.out.print("\t Roll :"+roll);
		System.out.println("\t College Name :"+clgname);
	}
}
class Teacher extends Person
{
	String dept;
	float salary;
	public void inputTeacherData()
	{
		Scanner sc=new Scanner(System.in);
		input();
		System.out.print("Enter Dept :");
		dept=sc.nextLine();
		System.out.print("Enter Salary :");
		salary=sc.nextFloat();
	}
	public void displayTeacherData()
	{
		System.out.print("\t Department :"+dept);
		System.out.println("\t Salary :"+salary);
	}
}
class Doctor extends Person
{
	String spec;
	public void inputDoctorData()
	{
		Scanner sc=new Scanner(System.in);
		input();
		System.out.print("Enter Specialization :");
		spec=sc.nextLine();
	}
	public void displayDoctorData()
	{
		display();
		System.out.println("\t Specialization :"+spec);
	}
}
class Multiple
{
	public static void main(String[] arg)
	{
		Student s1=new Student();
		s1.inputStudentData();
		s1.displayStudentData();
		
		Teacher t1=new Teacher();
		t1.inputTeacherData();
		t1.displayTeacherData();

		Doctor d1=new Doctor();
		d1.inputDoctorData();
		d1.displayDoctorData();


	}
}