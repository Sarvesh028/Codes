/*Write a Java class called "Rectangle" that has attributes for length and width.
Include methods to calculate the area and perimeter of the rectangle. Create an
object of the class and compute these values.
*/

public class Rectangle {
    
    static void area(int l, int b){
        System.out.println("The Area of Rectangle is  " +l * b);
    }
    
    static void perimeter(int l, int b){
        System.out.println("The Perimeter of Rectangle is  " +(2 * (l + b)));
    }

    public static void main(String[] args) {
    
        area(2, 4);
        perimeter(2, 4);
    }
}
