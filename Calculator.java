public class Calculator {


     int a = 50;
     int b = 60;
     static int d=111;
   

    public static void main(String[] args) {
        System.out.println("Pre-object value " +d);//111
        
        
        Calculator sum = new Calculator();
        d = 100;
        System.out.println("The Sum of A and B is "+ (sum.a+sum.b));
        System.out.println("The new Sum is "+ (sum.d));


        Calculator avg = new Calculator();
        sum.d = 200;
        System.out.println("Average of A and B is "+ ((avg.a+avg.b)/2));
        System.out.println("The New Average is "+ avg.d);
        Calculator.d=24356;

        System.out.println(d);
        //System.out.println(a);


    }
}
