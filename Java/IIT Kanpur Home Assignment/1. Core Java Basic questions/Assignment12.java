//WAP to enter marks of five subject and calculate total marks, average
// marks and percentage.
import java.util.Scanner;
class Assignment12
{
	public static void main(String[] arg)
	{
		Scanner map=new Scanner(System.in);
		System.out.println("Enter the marks of math:");
		int math=map.nextInt();
		System.out.println("Enter the marks of computer:");
		int computer=map.nextInt();
		System.out.println("Enter the marks of english:");
		int english=map.nextInt();
		System.out.println("Enter the marks of science:");
		int science=map.nextInt();
		System.out.println("Enter the marks of hindi:");
		int hindi=map.nextInt();
		int sum=math+computer+english+science+hindi;
		System.out.println("Total Marks is " +sum); 
		int average=sum/5;
		System.out.println("Average Marks is "+average);
		int percentage=(sum*100)/500;
		System.out.println("Percentage Marks is "+percentage+ "%");
	}
}