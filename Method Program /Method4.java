// Method Overloading jaise same class ka multiple method as we see the example here;

public class Method4 {

    static void number(int a){
        System.out.println("THis is a number which is natural number "+a);
    }
static void number(int a,int b){
        System.out.println("These number are natural number "+a+b);
    }
    static void number(int a, String D){
        System.out.println("THis is a number which is natural number "+a + "And the name of this number is " +D);
    }

    public static void main(String[] args) {
        number(45, 066);
            number(34, "Thirty-four");
    }
}
