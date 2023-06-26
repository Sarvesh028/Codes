/*
 * Question 2:
Create a class called "Calculator" with a static variable "pi" and a method called
"calculateCircleArea" that takes the radius as an argument and returns the area of a
circle. Write a main method to calculate the area of a circle with a radius of 5 using
the "calculateCircleArea" method.
 */

public class Calculator {
    
    static double calculateCircleArea(int radius){
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println("The area Of Circle is " + calculateCircleArea(5));
    }
}
