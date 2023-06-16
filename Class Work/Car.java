/*Question 1:
Create a class called "Car" with the following properties and methods:
Properties: make (String), model (String), year (int)
Methods:
startEngine() : Print a message indicating that the car's engine has started.
drive(int distance) : Print a message indicating the distance driven by the car.
stopEngine() : Print a message indicating that the car's engine has stopped.
Implement the Car class and create an instance of it. Set the make, model, and year
of the car, and then call the startEngine() , drive() , and stopEngine() methods to
simulate the car's behavior.
*/

public class Car {
static void startEngine(String make, String model){
        System.out.println(make + " "+model + " Has started the engine ");
    }

    static void Drive(int km){
        System.out.println(km + " KM Has Driven the car ");
    }

    static void stopEngine(int year){
        System.out.println(year + " Has stopped the engine ");
    }

    public static void main(String[] args) {
        startEngine("BMW", "X7");
        Drive(60);
        stopEngine(2020);
    }/* 
    String make;
     String model;
    int year;
    void startEngine(){
        System.out.println("Engine has started");
    }
    void drive(int distance){
        System.out.println("Car has travelled "+ distance);
    }
    void stopEngine(){
        System.out.println("Now the engine has stopped");
    }
    public static void main(String[] args) {
        Car detail=new Car();
        detail.make="AUDI";
        detail.model="Q3";
        detail.year=2014;

    detail.startEngine();
    detail.drive(23422);
    detail.stopEngine();

    }*/
    
}