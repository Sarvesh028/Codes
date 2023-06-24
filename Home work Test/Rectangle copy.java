/*
 * Question 5:
Create a class called "Rectangle" with private instance variables "length" and
"width". Include a method called "calculateArea" that calculates and returns the area
of the rectangle. Write a main method to create an object of the Rectangle class, set
the length to 5 and width to 10, and display the calculated area.
 */

public class Rectangle {
    
    private int length;
    private int breadth;

    static double calculatedArea(int length, int breadth){
        return length * breadth;
    }
    public static void main(String[] args) {
        
        Rectangle ra =new Rectangle();
        ra.length=5;
        ra.breadth=10;
        System.out.println(calculatedArea(5, 10));
    }
}
