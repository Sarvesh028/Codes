/*
Define a package named temperature and create a class named conversion that has method
which converts the temperature from fahrenheit to celsius.
Define a package named mypack and create a class that has method which calls method of
class of temperature package.
*/

package Temperature;
import java.util.Scanner;
public class Conversion
{
	Scanner sc=new Scanner(System.in);
	public void Fahrenheit()
	{
		double Fahrenheit, celsius;
		System.out.print("Enter Temperature in Fahrenheit");
		Fahrenheit=sc.nextDouble();
		celsius=(Fahrenheit-32)*(0.5556);
		Fahrenheit=((celsius*9)/5+32);
		System.out.println("Temperature in Celsius is "+celsius);
		System.out.println("Temperature in Fahrenheit is "+Fahrenheit);
	}
}