
/*
 * Write a program to calculate the area of circle and cylinder by 
 * creating methods named areaOfCircle() and areaOfCylinder in a class 
 * named area and using a constant variable PI=3.14.
 */
import java.util.Scanner;

public class Assignment3 {

    static double areaOfCircle(int radius) {
        return Math.PI * radius * radius;
    }

    static double areaOfCylinder(int height, int radius) {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println("The area of Circle is " + Assignment3.areaOfCircle(5));
        System.out.println("The area of cylinder is " + Assignment3.areaOfCylinder(4, 9));
    }
}

// Trying to taking input from user

class area {

    Scanner sc = new Scanner(System.in);

    double areaOfCircle() {
        System.out.println("Enter the radius of Circle ");
        int radius = sc.nextInt();
        return Math.PI * radius * radius;
    }

    double areaOfCylinder() {
        System.out.println("Enter the Radius And Height of Cylinder ");
        System.out.println("Enter the Radius of Cylinder");
        int radius = sc.nextInt();
        System.out.println("Enter the Height of Cylnder ");
        int height = sc.nextInt();
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        area df = new area();
        while (true) {
            System.out.println("Area of Circle is " + df.areaOfCircle());
            System.out.println("The area of Cylinder is " + df.areaOfCylinder());
        }

    }
}