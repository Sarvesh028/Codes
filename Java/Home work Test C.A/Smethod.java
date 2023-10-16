public class Smethod {

    static int sum(int a, int b) { // it is with static
        return a + b;
    }

    static int sum1(int d, int e) { // it is with static

        return d + e;

    }

    float sub(float g, float h) { // this is without static value so it will call via object declearation.
        return g - h;
    }

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = a + b; // there is a too many code to sum
        // int c = sum(a, b);

        int d = 4;
        int e = 6;
        int f = d + e; // here is also to many code too sum
        // int f = sum1(d, e);
        // but in method there is in one-code with assign the vlaue and sum it

        System.out.println(c);
        System.out.println(f);

        // here the method is calling but there is a static value then we can call it
        // directly
        // you can assign any value to call the method

        // Now there are way to call the method when it is static
        // 1. via method
        // 2. via class directly
        System.out.println(sum(a, b)); // here the vlaue of a and b is changed if you can change it
        System.out.println(sum1(d, e));
        System.out.println(Smethod.sum(10, 20)); // When there is static then method is called direclty via class
        System.out.println(Smethod.sum1(7, 9));

        // here is making a object class for method which is non static
        Smethod sm = new Smethod();

        // Now there are way to call the method when it is not static
        // 1. via reference

        System.out.println(sm.sub(8, 4)); // it is call via reference of object
        System.out.println(sm.sum(3, 3));
        System.out.println(sm.sum1(5, 8));

    }
}
