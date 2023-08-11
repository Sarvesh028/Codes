public class Qout47 {
    public static int x = 10;
    public static void main(String[] args) {
        System.out.println(x+" ");
        int x = 5;
        myFunction();
        System.out.println(x+" ");
    }
    public static void myFunction(){
        x= x+ 3;
        System.out.println(x+" ");
    }
}
