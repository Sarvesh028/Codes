/*
Create a class called "Car" with attributes like make, model, and year. Include a
method to display the details of the car. Create multiple objects of the class and
display their details
 */

public class Car {
    

    static void car (String making, String Model, int year){
        System.out.println("The Name of Model of Car is "+ making + " And the model name is " + Model + " And year of making is " +year);
    }
    
    public static void main(String[] args) {
        car("Suzuki", "Nexa", 2017);
        car("Toyota", "Fortuner", 2006);
        car("BMW", "X7", 2020);
        car("Mercedes", "G200", 2018);
    }
}
