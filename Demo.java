import java.util.Scanner;

class Demo {


    public static void main(String[] args) {

        System.out.println("Enter an integer");

        Scanner sc=new Scanner(System.in);


        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("value of a   "+a);
        System.out.println("sum"+(a+b));
        
    }
}