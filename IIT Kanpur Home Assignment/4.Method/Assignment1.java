/*  create a class as student with member:
    data member: rollno, name, mark1, mark2, mark3, total and average.
    member function :- gettotal(), getdata() and display data.
    gettotal(): Return the total marks
    getdata();- Method used to get student details
    display data();- Method used to display the student details.
 */

public class Assignment1 {

    int mark1, mark2, mark3, total, average;

    public void getdata(String name, int rollno) {
        System.out.println("The name of Student is " + name + " \nAnd the Roll no is " + rollno);
    }

    public int gettotal(int mark1, int mark2, int mark3) {
        return total = mark1 + mark2 + mark3;
    }

    public void displaydata() {
        System.out.println("The marks of student is " + total);
    }

    public static void main(String[] args) {
        Assignment1 as = new Assignment1();
        as.getdata("Ramesh", 12);
        as.gettotal(90, 78, 89);
        as.displaydata();

    }
}