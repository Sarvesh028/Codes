class Demo2{

    int a = 20;
    int b = 40;
    static int c = 50;

}

public class Demo {

    int a = 10;
    int b;
    static int c = 50;

    public static void main(String[] args) {
        
        Demo object = new Demo();
        System.out.println("The Pre Demo object 'a' "+object.a + " And 'b' output is " +object.b + "  Or pre Static demo is "+c);
        object.a = 20;
        object.b = 40;
        object.c = 100;
        System.out.println("The Demo object 'a' "+object.a + " And 'b' output is " +object.b + "  Or Static demo is "+c);

        Demo2 obj1 = new Demo2();
        System.out.println("The Pre Demo obj1 'a' "+obj1.a + " And 'b' output is " +obj1.b + "  Or pre Static demo is "+obj1.c);
        obj1.a = 200;
        obj1.b = 300;
        obj1.c = 200;
        System.out.println("The Demo object 'a' "+obj1.a + " And 'b' output is " +obj1.b + "  Or Static demo is "+obj1.c);
    }
}
