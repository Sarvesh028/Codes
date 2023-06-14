//WAP to find the largest number among three using ternary operator. 
import java.util.Scanner;
class Assignment7
{
	public static void main(String[] arg)
	{
		int a,b,c,d;
		Scanner l=new Scanner(System.in);
		System.out.println("Enter three numbers");	
		a=l.nextInt(); 
		b=l.nextInt(); 
		c=l.nextInt();
		d=c>(a>b?a:b)?c:((a>b)?a:b);
		System.out.println("largest number is "+d); 
	}
}