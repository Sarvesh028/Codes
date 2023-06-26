/*WAP to calculate and print the Electricity bill of a given customer. The customer id and unit consumed by the customer should be taken from the
keyboard and display the total amount to pay to the customer. The charge are as follow : 
Unit Consumption Charge/Unit upto 199 @4.20 200 and above but less than 400 @5.50 400 and above but less than 600 @6.80 600 and 
above @8.00 If bill amount exceeds Rs. 800 
then a surcharge of 18% will be charged and the minimum bill should be of Rs. 200/-.
*/
import java.util.Scanner;
class Assignment15
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the unit:");
		float unit=sc.nextFloat();
		float bill=0.0f;
		if(unit<200)
		{
			bill=unit*4.20f;
		}
		else if(unit>=200 && unit<400)
		{
			bill=unit*5.50f;
		}
		else if(unit>=400 && unit<600)
		{
			bill=unit*6.80f;
		}
		else if(unit>=600 && unit<800)
		{
			bill=unit*8.00f;
		}
		if(unit>=800)
		{
			float sub=unit*18/100;
			bill=unit+sub;
		}		
		System.out.println("Your bill is "+bill);
	}
}