import java.util.Scanner;

public class MathUtils {

    static int multiply(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number Which you have to Multiply");
        System.out.println("Enter First Number ");
        int a = sc.nextInt();
        System.out.println("Enter the second Number ");
        int b = sc.nextInt();
        int c = a*b;
        System.out.println(c);
        return a*b;
    }
    
    public static void main(String[] args) {
        MathUtils.multiply();
    }
}
