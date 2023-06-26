/*
 * Define a class named "Employee" with following fields;
 * empID, empName, depID, bloodGroup, Salary.
 * define the following methods:
 * setEmployeeDetails(): to read the Employee data.
 * printEmployeeDetails(); TO display the employee data.
 */

import java.util.Scanner;

public class Assignment2 {

    String empName;
    char bloodGroup;
    int empID, depID;
    double salary;

    void setEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Employee ");
        empName = sc.nextLine();
        System.out.println("Enter the Employee ID ");
        empID = sc.nextInt();
        System.out.println("Enter the Department ID ");
        depID = sc.nextInt();
        System.out.println("Enter the blood group ");
        bloodGroup = sc.next().charAt(0);
        System.out.println("Enter the Salary Which you have earned ");
        salary = sc.nextDouble();
    }

    void printEmployeeDetails() {
        System.out.println("Name :- " + empName);
        System.out.println("ID " + empID);
        System.out.println("DepID " + depID);
        System.out.println("BD " + bloodGroup);
        System.out.println("Salary " + salary);
        System.out.println("Hi there my name is " + empName + " And My ID is " + empID + " I belongs to " + depID
                + " department and my blood group is " + bloodGroup + " I earned Salary from this company is "
                + salary);
    }

    public static void main(String[] args) {
        Assignment2 emp = new Assignment2();
        while (true) {
            emp.setEmployeeDetails();
            emp.printEmployeeDetails();
        }

    }

}
