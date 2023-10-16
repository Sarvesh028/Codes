/*
 * Q:
Create a class called "Student" with private instance variables "name" and "grade".
Include a static variable "passingGrade" with a value of 60. Include a method called
"isPassing" that checks if the grade is greater than or equal to the passing grade and
returns true or false. Write a main method to create an object of the Student class,
set the name and grade, and display whether the student is passing or not.
 */

public class Students {

    private String name;
    private int grade;

    static int passingGrade=60;
    boolean isPassing(int grade){
    boolean b;
        if(grade>=60){
            b= true;
        }
        else
            b= false;

        return b;
    }
    
    public static void main(String[] args) {
        
        Students ss= new Students();
        System.out.println(ss.name="Sarvesh");
        System.out.println(ss.grade=78);
        System.out.println(ss.isPassing(80));

        System.out.println(ss.name="Rohit");
        System.out.println(ss.grade=59);
        System.out.println(ss.isPassing(59));
    

    }    
}
