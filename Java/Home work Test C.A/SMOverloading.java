//void is a itself a return type as we see the example 

public class SMOverloading { // two or more method are off same name but different arguments see example

    static void key() {
        System.out.println("There is a key holder "); // here there is no any return type so we can say that void is
                                                      // itself return type in method.
    }

    // metthod overloading

    static void ram() {
        System.out.println("Good Morning Sita");
    }

    static void ram(int a) {
        System.out.println("Miss you sita " + a);
    }

    static void ram(float f, int b) {
        System.out.println("You have a float type " + f + " and a  int type " + b);
    }

    public static void main(String[] args) {
        key(); // it call directly via name of method
        SMOverloading.key(); // it is also called via name of class directly no any object is reqd. because
                             // of static.

        // now i can call the method overloading
        ram();
        ram(20);
        ram(7.8f, 69);
    }
}
