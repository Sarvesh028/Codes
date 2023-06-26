//current date and time 
		//System.out.println("Today Date : "+date.getDate()+"-"+date.getMonth+"-"+date.getyear());

import java.util.*;
class Myclock3
{
	public static void main(String...arg)
	{
		
		while(true)
		{
			Date date=new Date();
			try
			{
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			}
			catch(Exception e){}
			int h=date.getHours();
			int m=date.getMinutes();
			int s=date.getSeconds();
			System.out.println("\t\t\n\n\n\n"+h+" : "+m+" : "+s);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e){}
		}
	}
}