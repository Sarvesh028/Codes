/*WAP to read the name of 10 students and write into the file and after writing display all the data of
that file in soted order
*/
import java.util.Scanner;
import java.io.*;
class Assignment
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			FileWriter fw=new FileWriter("student.txt");
			for(int i=0; i<10; i++)
			{
				System.out.print("Enter Name:");
				String name=sc.nextLine();
				fw.write(name);                  
				fw.write('\n');
			}
			fw.close();
			String[] list=new String[10];
			int index=0;
			FileReader fr=new FileReader("Student.txt");
			int data;
			String s="";
			while((data=fr.read())!=-1)
			{
				char ch=(char)data;
				if(ch !='\n')
				{
					s=s+ch;	
				}
				else
				{
					list[index]=s;
					index++;
					s="";
				}
			}
			fr.close();
			for(int i=0; i<10; i++)
			{
				for(int j=0; j<10-i-1; j++)
				{
					if(list[j].compareTo(list[j+i])>0)
					{
						String t=list[j];
						list[j]=list[j+1];
						list[j+1]=t;
					}
				}
			}
			for(int i=0; i<10; i++)
			{
				System.out.println(list[i]);
			}
		}
		catch(Exception ob)
		{
			System.out.println(ob.getMessage());
		}
	}
}