//WAP to calculate area of cicle, rectangle,square using Abstract class shapes.

import java.util.Scanner;
abstract class Shape
{
	abstract void area();
	void Display()
	{

	}
}
class Circle extends Shape
{
	void area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius :");
		int r=sc.nextInt();
		float area=3.14f*r*r;
		System.out.println("Area Of Circle :"+area);
	}
}
class Rectangle extends Shape
{
	void area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length :");
		int l=sc.nextInt();
		System.out.println("Enter breadth :");
		int b=sc.nextInt();
		int area=l*b;
		System.out.println("Area Of Rectangle :"+area);
	}
}
class Assignment3
{
	public static void main(String[] arg)
	{
		Circle ob=new Circle();
		ob.area();
		Rectangle ob1=new Rectangle();
		ob1.area();
	}
}

