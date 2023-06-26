/*
Define a class flight with following description:
	Private Members:
		Flight Number, Destination, Distance and fuel
		A method calfuel() to calculate the value of fuel as per the following criteria
			Distance 			Fuel
			<=1000				500
			more than 1000 and <=2000	1100
			more than 2000			2200
	Public Members
		A method feedinfo() to allow the user to enter values for Flight Number, Destination
		Distance & call method calfuel() to claculate the quantity of Fuel
		A method showinfo() to allow the user to view the content of all the data members
*/

import java.util.Scanner;

class Assignment4 {
	private int dist, fuel;
	private String fno, dest;

	private void calFuel() {
		if (dist <= 1000)
			fuel = 500;
		else if (dist > 1000 && dist <= 2000)
			fuel = 1100;
		else
			fuel = 2200;
	}

	public void feedInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Flight Number:");
		fno = sc.next();
		System.out.print("Enter Distance:");
		dist = sc.nextInt();
		System.out.print("Enter Destination:");
		dest = sc.next();
		calFuel();
	}

	public void shoeInfo() {
		System.out.println("Flight Number :" + fno);
		System.out.println("Destination :" + dest);
		System.out.println("Distance :" + dist);
		System.out.println("Fuel :" + fuel);
	}

	public static void main(String[] args) {
		Assignment4 aa = new Assignment4();
		while (true) { // for continous loop
			aa.calFuel();
			aa.feedInfo();
			aa.shoeInfo();
		}
	}

}