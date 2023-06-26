//Define a class called "Person" with attributes like name, age, and address.
//Create an object of the class and set values for its attributes.

public class Person {
    
    int age;
    String name;
    String Address;

    public static void main(String[] args) {
        
        Person pp = new Person();
        pp.name = "Tiwari Shah";
        pp.age = 35;
        pp.Address = "Kankarbagh, Patna";
        System.out.println("The name of Person is \n "+ pp.name + " \n " + pp.age + " \n " + pp.Address );


    }
}
