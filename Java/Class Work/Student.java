/*Question 2:
Create a class called "Student" with the following properties and methods:
Properties: name (String), age (int), grade (int)
Methods:
study() : Print a message indicating that the student is studying.
takeExam() : Print a message indicating that the student is taking an exam.
getGrade() : Return the grade of the student.
Implement the Student class and create an instance of it. Set the name, age, and
grade of the student, and then call the study() , takeExam() , and getGrade() methods
to simulate the student's activities and retrieve their grade.
*/

public class Student {

    static void study(String name ){
        System.out.println(name + " is studying late night");
    }

    static void takeExam(int age){
        System.out.println("At this age of " + age + " is taking an exam. ");
    }

    static void getGrade(int grade){
        System.out.println("After exam the he will score the grade is "+ grade );
    }

    public static void main(String[] args) {
        
        study("Sarvesh");
        takeExam(23);
        getGrade(100);
    }
}
