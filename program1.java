//import java.util.Scanner;

import java.util.Scanner;

class smart{
    int a;
    public void ring(){
        System.out.println("Ringing.....");
    }
    public void vibrate(){
        System.out.println("Vibrating.....");
    }
}
class Mobile {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        smart nokia = new smart();
        nokia.a=sc.nextInt();
        int b=nokia.a;
        System.out.println(b);
        nokia.vibrate();
        nokia.ring();
    }
}