/*WAP to read the name of 10 students and write into the file and after writing display all the data of 
that file 
*/
import java.util.Scanner;
import java.io.*;
class Program24
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			FileWriter fos=new FileWriter("student.txt",true);
			for(int i=0; i<10; i++)
			{
				System.out.println("Enter 10 Names of Students:");
				String name=sc.nextLine();
				fos.write(name);
				fos.write('\n');
			}
			fos.close();
			FileReader fis=new FileReader("student.txt");
			int data;
			while((data=fis.read())!=-1)
			{
				System.out.print((char)data);
			}
			fis.close();
		}
		catch(Exception ob)
		{
			System.out.println(ob.getMessage());	
		}
	}
}