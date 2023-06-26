import java.util.Scanner;
class Student2
{
	String name;
	int roll;
	void readStudentData()
	{⁬
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name\t :");
		name=sc.nextLine();
		System.out.print("Enter Roll\t :");
		roll=sc.nextInt();
	}
	void displayStudentData()
	{
		System.out.println("Name\t :"+name);
		System.out.println("Roll\t :"+roll);
	}
}
class Main
{
	public static void main(String[] arg)
	{
		Student s1=new Student();
		Student s2=new Student();
		s1.readStudentData();
		s2.readStudentData();
		s1.displayStudentData();
		s2.displayStudentData();
	}
}