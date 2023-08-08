import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Sarvesh Kumar");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
        System.out.println(st.nextToken());
        }
        StringTokenizer st1 = new StringTokenizer("Sarvesh.Kumar");
        while (st1.hasMoreTokens()) {
        System.out.println(st1.nextToken("."));
        }
        StringTokenizer st3=new StringTokenizer("Sarvesh Kumar","e");
        while (st3.hasMoreTokens()){
        System.out.println(st3.nextToken());
        }
        StringTokenizerDemo st4=new StringTokenizerDemo();
        System.out.println(st4.toString());

        StringTokenizer st5=new StringTokenizer("Sarvesh Is a best in his world ");
        System.out.println(st5.countTokens());
        }

}
