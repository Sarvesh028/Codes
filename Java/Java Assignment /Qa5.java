//WAP to enter marks of five subjects and calculate total marks, average marks and percentage.
import java.util.Scanner;
class Qa5
{
	public static void main(String[] cc)
	{
		Scanner kk=new Scanner(System.in);
		System.out.println("Enter the marks of Social Science :");
		int sst=kk.nextInt();
		System.out.println("Enter the marks of Science :");
		int sci=kk.nextInt();
		System.out.println("Enter the marks of Mathematics :");
		int math=kk.nextInt();
		System.out.println("Enter the marks of Hindi :");
		int hindi=kk.nextInt();
		System.out.println("Enter the marks of English :");
		int eng=kk.nextInt();
		int totalmarks=(sst+sci+math+hindi+eng);
		float average=(totalmarks/5);
		float percentage=(totalmarks/500)*100;
		System.out.println("Total Marks = "+totalmarks+ " Average = "+average +" Percentage = "+percentage);
	}
}