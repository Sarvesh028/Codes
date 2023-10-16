import java.util.Scanner;
class Student
{
	int id;
	String name;
	void InputData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student ID :");
		id=sc.nextInt();
		System.out.print("Enter Student Name :");
		name=sc.next();
	}
	void DisplayData()
	{
		System.out.print("Student ID "+id);
		System.out.print("Student Name "+name);
	}
}
class Main
{
	public static void main(String[] arg)
	{
		Student s1=new Student();
		s1.InputData();
	}
}