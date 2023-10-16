/*
 * Question 1:
Create a class called "Car" with private instance variables "model" and "year".
Include appropriate getter and setter methods for these variables. Write a main
method to create an object of the Car class, set the model and year, and display
them.
 */

public class Car {
    
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public static void main(String[] args) {
        
        Car cc= new Car();
        cc.setModel("BMW");
        cc.setYear(2023);
        System.out.println("The "+cc.getModel() + " is launched in " +cc.getYear()+ " year.");
    }

}
